package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.proco.model.AreaConocimientoDTO;
import co.com.proco.services.ProcoFacade;


public class AreasConocimientoImplLocal implements AreasConocimientoInterface {

	@Override
	public List<AreaConocimientoDTO> recuperarAreasConocimientoBD() {
	
		ProcoFacade procoFacade = new ProcoFacade();
		List<AreaConocimientoDTO> areasConocimientoList = procoFacade.obtenerAreasConocimiento();		
		return areasConocimientoList;
	}

	@Override
	public List<AreaConocimientoDTO> recuperarAreasConocimientoWS() {
		
		List<AreaConocimientoDTO> listaAreaConocimiento = new ArrayList<AreaConocimientoDTO>();

		try {
			// Construye el cliente web
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/WebService/rest/json/servicios/areasConocimiento");

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
				listaAreaConocimiento.add((builder.create()).fromJson(ar.get(i).toString(), AreaConocimientoDTO.class));
			}

			System.out.println("Output from Server .... \n");
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaAreaConocimiento;
	}

}
