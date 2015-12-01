package co.com.proco.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import co.com.proco.model.AreaConocimientoDTO;
import co.com.proco.model.ConfiguracionDTO;
import co.com.proco.model.SesionDTO;

@Path("json/servicios1")
public class ProcoWS2 {

	
	@GET
	@Path("/configuracion")
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerConfiguracion (){
		ProcoFacade facade = new ProcoFacade();
		List<ConfiguracionDTO> configuracionList = facade.obtenerConfiguracion();		
		Gson gson = new Gson();
		String json = gson.toJson(configuracionList);		
		return Response.status(201).entity(json).build();
	}
	
	@GET
	@Path("/areasConocimiento")
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerAreasConocimiento (){
		ProcoFacade facade = new ProcoFacade();
		List<AreaConocimientoDTO> areaConocimientoList = facade.obtenerAreasConocimiento();		
		Gson gson = new Gson();
		String json = gson.toJson(areaConocimientoList);		
		return Response.status(201).entity(json).build();
	}
}
