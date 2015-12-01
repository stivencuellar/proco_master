package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.proco.dao.SesionDAO;
import co.com.proco.model.SesionDTO;
import co.com.proco.services.ProcoFacade;

/**
 * Recuperar la informacion de los objetos sesion que se muestran en la pantalla
 * 
 * @author SCuellar
 */
public class SesionServicesImplLocal implements SesionServicesInterface {

	private ApplicationContext context;
	
	private  String url = "http://localhost:8080/WebService/rest/json/servicios/";
	
	public List<SesionDTO> getSesiones() {
	  
		ProcoFacade procoFacade = new ProcoFacade();
		List<SesionDTO> sesionDTOList = procoFacade.obtenerSesiones();

		// Crear la lista con los DTO
		List<SesionDTO> sesionList = new ArrayList<SesionDTO>();

		for (SesionDTO sesionDTO : sesionDTOList) {
			SesionDTO sesionDTOJPA = new SesionDTO();
			sesionDTOJPA.setTitulo(sesionDTO.getTitulo());
			sesionDTOJPA.setImagen(sesionDTO.getImagen());
			sesionDTOJPA.setNombre(sesionDTO.getNombre());
			sesionDTOJPA.setDescripcion(sesionDTO.getDescripcion());
			sesionList.add(sesionDTOJPA);
		}

    return sesionList;
  }
	
	public  List<SesionDTO> ObtenerSesion() {

		List<SesionDTO> listaSesion = new ArrayList<SesionDTO>();

		try {
			// Construye el cliente web
			Client client = Client.create();
			WebResource webResource = client.resource(url+"sesion");

			GsonBuilder builder = new GsonBuilder();

			// Envia la peticion al WS y obtiene la respuesta
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			// Se procesa la respuesta
			String output = response.getEntity(String.class);

			JsonArray ar = new JsonParser().parse(output).getAsJsonArray();


			for(int i = 0; i < ar.size(); i++)
			{
				listaSesion.add((builder.create()).fromJson(ar.get(i).toString(), SesionDTO.class));
			}

			System.out.println("Output from Server .... \n");
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaSesion;
	}

}
