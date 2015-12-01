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

import co.com.proco.model.ActividadesDTO;
import co.com.proco.model.AreaConocimientoDTO;
import co.com.proco.model.ConfiguracionDTO;
import co.com.proco.model.IndividuoDTO;
import co.com.proco.model.ProyectosDTO;
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
	public List<SesionDTO> obtenerSesiones (){
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
	
	
	@GET
	@Path("/misCosasProyectos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerMisCosasActividades(){
		ProcoFacade facade = new ProcoFacade();
		List<ActividadesDTO> actividadesList = facade.getFirstActividadesDTOFromIndex();		
		Gson gson = new Gson();
		String json = gson.toJson(actividadesList);		
		return Response.status(201).entity(json).build();
	}
	
	@GET
	@Path("/misCosasProyectos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerMisCosasProyectos(){
		ProcoFacade facade = new ProcoFacade();
		List<ProyectosDTO> proyectosList = facade.getFirstProyectosDTOFromIndex();		
		Gson gson = new Gson();
		String json = gson.toJson(proyectosList);		
		return Response.status(201).entity(json).build();
	}
	
	@GET
	@Path("/individuos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerIndividuos(){
		ProcoFacade facade = new ProcoFacade();
		List<IndividuoDTO> individuosList = facade.getFirstIndividuoDTO();		
		Gson gson = new Gson();
		String json = gson.toJson(individuosList);		
		return Response.status(201).entity(json).build();
	}
	
	
}
