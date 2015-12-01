package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.ObjetivoDTO;
import co.com.proco.services.ProcoFacade;

public class ObjetivoImplLocal implements ObjetivoInterface{
	
	private ApplicationContext context;

	@Override
	public List<ObjetivoDTO> getObjetivos() {
		ProcoFacade objetivoFacade = new ProcoFacade();	
		List<ObjetivoDTO> objetivoDTOList = objetivoFacade.getFirstObjetivoDTO();	
		List<ObjetivoDTO> objetivoList = new ArrayList<ObjetivoDTO>();	
			
		for (ObjetivoDTO objetivosDTO : objetivoDTOList){	
			ObjetivoDTO objetivosDTOJPA = new ObjetivoDTO();
			objetivosDTOJPA.setNombre(objetivosDTO.getNombre());
			objetivosDTOJPA.setDescripcion(objetivosDTO.getDescripcion());
			objetivosDTOJPA.setModificadoPor(objetivosDTO.getModificadoPor());
			objetivosDTOJPA.setFechaModificacion(objetivosDTO.getFechaModificacion());
			
			
			objetivoList.add(objetivosDTOJPA);
		}	
		return objetivoList;	

	}

}
