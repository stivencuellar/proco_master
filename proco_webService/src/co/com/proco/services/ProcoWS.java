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

@Path("json/servicios")
public class ProcoWS {

//	@GET
//	@Path("/sesion")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response primerMetodo (){
//		ProcoFacade facade = new ProcoFacade();
//		List<SesionDTO> sesionList = facade.obtenerSesiones();
//		
//		Gson gson = new Gson();
//		String json = gson.toJson(sesionList);		
//		return Response.status(201).entity(json).build();
//	}
//	
	
	@GET
	@Path("/sesion")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SesionDTO> primerMetodo (){
		ProcoFacade facade = new ProcoFacade();
		List<SesionDTO> sesionList = facade.obtenerSesiones();
		return  sesionList; 
	}
	
	
	@POST
	@Path("/sesion_sesion")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response primerMetodoPost (SesionDTO sesionDTO){
		String result = "sesionDTO saved : " + sesionDTO;
		return  Response.status(201).entity(result).build(); 
	}
	
	
	@GET
	@Path("/configuracion")
	@Produces(MediaType.APPLICATION_JSON)
	public Response segundoMetodo (){
		ProcoFacade facade = new ProcoFacade();
		List<ConfiguracionDTO> sesionList = facade.obtenerConfiguracion();
		
		Gson gson = new Gson();
		String json = gson.toJson(sesionList);		
		return Response.status(201).entity(json).build();
	}
	
	@GET
	@Path("/areasConocimiento")
	@Produces(MediaType.APPLICATION_JSON)
	public Response tercerMetodo (){
		ProcoFacade facade = new ProcoFacade();
		List<AreaConocimientoDTO> sesionList = facade.obtenerAreasConocimiento();
		
		Gson gson = new Gson();
		String json = gson.toJson(sesionList);		
		return Response.status(201).entity(json).build();
	}
}
