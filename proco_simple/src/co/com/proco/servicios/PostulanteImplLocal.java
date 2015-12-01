package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.PostulanteDTO;
import co.com.proco.services.ProcoFacade;

public class PostulanteImplLocal implements PostulanteInterface{
	
	private ApplicationContext context;

	@Override
	public List<PostulanteDTO> getPostulantes() {
		ProcoFacade postulanteFacade = new ProcoFacade();	
		List<PostulanteDTO> postulanteDTOList = postulanteFacade.getFirstPostulanteDTO();	
		List<PostulanteDTO> postulanteList = new ArrayList<PostulanteDTO>();	
			
		for (PostulanteDTO postulantesDTO : postulanteDTOList){	
			PostulanteDTO postulantesDTOJPA = new PostulanteDTO();
			postulantesDTOJPA.setSiSeleccionado(postulantesDTO.getSiSeleccionado());
			postulantesDTOJPA.setFechaPostulacion(postulantesDTO.getFechaPostulacion());
			postulanteList.add(postulantesDTOJPA);	
		}	
		return postulanteList;	


	}

}
