package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.ProyectosDTO;
import co.com.proco.services.ProcoFacade;

public class ProyectosImplLocal implements ProyectosInterface{

	private ApplicationContext context;
	
	public List<ProyectosDTO> getProyectos() {
		ProcoFacade proyectosFacade = new ProcoFacade();
		List<ProyectosDTO> proyectosDTOList = proyectosFacade.getFirstProyectosDTOFromIndex();
		List<ProyectosDTO> proyectosList = new ArrayList<ProyectosDTO>();
		
		for (ProyectosDTO proyectoDTO : proyectosDTOList) {
			ProyectosDTO proyectoDTOJPA = new ProyectosDTO();
			proyectoDTOJPA.setTitulo(proyectoDTO.getTitulo());
			proyectoDTOJPA.setImagen(proyectoDTO.getImagen());
			proyectoDTOJPA.setNivelMadurez(proyectoDTO.getNivelMadurez());
			proyectoDTOJPA.setDescripcion(proyectoDTO.getDescripcion());
			proyectoDTOJPA.setModificadoPor(proyectoDTO.getModificadoPor());
			proyectoDTOJPA.setFechaModificacion(proyectoDTO.getFechaModificacion());
			proyectosList.add(proyectoDTOJPA);
		}
		
		return proyectosList;
	}

}
