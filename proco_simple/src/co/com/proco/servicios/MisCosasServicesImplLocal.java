package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.ActividadesDTO;
import co.com.proco.model.ProyectosDTO;
import co.com.proco.services.ProcoFacade;

public class MisCosasServicesImplLocal implements MisCosasServicesInterface{

	private ApplicationContext context;
	
	public List<ActividadesDTO> getActividades() {

		ProcoFacade actividadesFacade = new ProcoFacade();
		List<ActividadesDTO> actividadesDTOList = actividadesFacade.getFirstActividadesDTOFromIndex();
		List<ActividadesDTO> actividadesList = new ArrayList<ActividadesDTO>();
		
		for (ActividadesDTO actividadDTO : actividadesDTOList) {
			ActividadesDTO actividadDTOJPA = new ActividadesDTO();
			actividadDTOJPA.setTitulo(actividadDTO.getTitulo());
			actividadDTOJPA.setImagen(actividadDTO.getImagen());
			actividadDTOJPA.setDescripcion(actividadDTO.getDescripcion());
			//actividadDTOJPA.setRequeridos(actividadDTO.getRequeridos());
			//actividadDTOJPA.setRecompenza(actividadDTO.getRecompenza());
			actividadesList.add(actividadDTOJPA);
		}
		
		return actividadesList;
	}

	@Override
	public List<ProyectosDTO> getProyectos() {
		ProcoFacade proyectosFacade = new ProcoFacade();
		List<ProyectosDTO> proyectosDTOList = proyectosFacade.getFirstProyectosDTOFromIndex();
		List<ProyectosDTO> proyectosList = new ArrayList<ProyectosDTO>();
		
		for (ProyectosDTO proyectoDTO : proyectosDTOList) {
			ProyectosDTO proyectoDTOJPA = new ProyectosDTO();
			proyectoDTOJPA.setTitulo(proyectoDTO.getTitulo());
			proyectoDTOJPA.setImagen(proyectoDTO.getImagen());
			proyectoDTOJPA.setDescripcion(proyectoDTO.getDescripcion());
			proyectosList.add(proyectoDTOJPA);
		}
		
		return proyectosList;
	}
	
}
