package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.proco.model.ConfiguracionDTO;
import co.com.proco.services.ProcoFacade;


public class ConfiguracionImplLocal implements ConfiguracionInterface {

	private  String url = "http://localhost:8080/WebService/rest/json/servicios/";
	
	@Override
	public List<ConfiguracionDTO> recuperarConfiguracion() {
		List<ConfiguracionDTO> listaConfiguracion = new ArrayList<ConfiguracionDTO>(); 
		
//		ConfiguracionDTO objConf1 = new ConfiguracionDTO();
//		objConf1.setPaginaDestino("areasConocimientoRender.jsp");
//		objConf1.setImagen("resources/img/areasConocimiento.png");
//		objConf1.setNombreConfiguracion("Esto si funcionó :P ");
//		listaConfiguracion.add(objConf1);
//		
//		ConfiguracionDTO objConf2 = new ConfiguracionDTO();
//		objConf2.setPaginaDestino("#");
//		objConf2.setImagen("resources/img/individuo.jpg");
//		objConf2.setNombreConfiguracion("Individuos");
//		listaConfiguracion.add(objConf2);
//		
//		ConfiguracionDTO objConf3 = new ConfiguracionDTO();
//		objConf3.setPaginaDestino("#");
//		objConf3.setImagen("resources/img/proyectos.jpg");
//		objConf3.setNombreConfiguracion("Proyectos");
//		listaConfiguracion.add(objConf3);		
		
		return listaConfiguracion;
	}

	@Override
	public List<ConfiguracionDTO> recuperarConfiguracionBD() {
		ProcoFacade procoFacade = new ProcoFacade();
		List<ConfiguracionDTO> configuracionList = procoFacade.obtenerConfiguracion();
		return configuracionList;
		
	}

	@Override
	public List<ConfiguracionDTO> obtenerConfiguracionWS() {
	
		List<ConfiguracionDTO> listaConfiguracion = new ArrayList<ConfiguracionDTO>();

		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/WebService/rest/json/servicios1/configuracion");
			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(output).getAsJsonArray();

			for(int i = 0; i < ar.size(); i++)
			{
				listaConfiguracion.add((builder.create()).fromJson(ar.get(i).toString(), ConfiguracionDTO.class));
			}

			System.out.println("Output from Server .... \n");
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaConfiguracion;
	}

}
