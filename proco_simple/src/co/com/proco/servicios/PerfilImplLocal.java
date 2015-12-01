package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.PerfilDTO;
import co.com.proco.services.ProcoFacade;

public class PerfilImplLocal implements PerfilInterface{
	
	private ApplicationContext context;

	@Override
	public List<PerfilDTO> getPerfiles() {
		ProcoFacade perfilFacade = new ProcoFacade();	
		List<PerfilDTO> perfilDTOList = perfilFacade.getFirstPerfilDTO();	
		List<PerfilDTO> perfilList = new ArrayList<PerfilDTO>();	
			
		for (PerfilDTO perfilsDTO : perfilDTOList){	
			PerfilDTO perfilsDTOJPA = new PerfilDTO();
			perfilsDTOJPA.setNombre(perfilsDTO.getNombre());
			perfilsDTOJPA.setDescripcion(perfilsDTO.getDescripcion());
			perfilsDTOJPA.setModificadoPor(perfilsDTO.getModificadoPor());
			perfilsDTOJPA.setFechaModificacion(perfilsDTO.getFechaModificacion());
			
			
			perfilList.add(perfilsDTOJPA);
		}	
		return perfilList;	
	

	}

}
