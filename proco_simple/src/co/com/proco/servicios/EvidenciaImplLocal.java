package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.EvidenciaDTO;
import co.com.proco.services.ProcoFacade;

public class EvidenciaImplLocal implements EvidenciaInterface{
	
	private ApplicationContext context;

	@Override
	public List<EvidenciaDTO> getEvidencias() {
		ProcoFacade evidenciaFacade = new ProcoFacade();	
		List<EvidenciaDTO> evidenciaDTOList = evidenciaFacade.getFirstEvidenciaDTO();	
		List<EvidenciaDTO> evidenciaList = new ArrayList<EvidenciaDTO>();	
			
		for (EvidenciaDTO evidenciasDTO : evidenciaDTOList){	
			EvidenciaDTO evidenciasDTOJPA = new EvidenciaDTO();
			evidenciasDTOJPA.setUrlEvidencia(evidenciasDTO.getUrlEvidencia());
			evidenciasDTOJPA.setModificadoPor(evidenciasDTO.getModificadoPor());
			evidenciasDTOJPA.setFechaModificacion(evidenciasDTO.getFechaModificacion());
			
			
			
			evidenciaList.add(evidenciasDTOJPA);
		}	
		return evidenciaList;	

	}

}
