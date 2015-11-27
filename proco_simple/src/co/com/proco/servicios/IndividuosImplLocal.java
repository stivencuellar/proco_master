package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.IndividuoDTO;
import co.com.proco.services.ProcoFacade;

public class IndividuosImplLocal implements IndividuosInterface{

	private ApplicationContext context;
	
	public List<IndividuoDTO> getIndividuos() {
		ProcoFacade individuosFacade = new ProcoFacade();
		List<IndividuoDTO> individuoDTOList = individuosFacade.getFirstIndividuoDTO();
		List<IndividuoDTO> individuoList = new ArrayList<IndividuoDTO>();
		
		for (IndividuoDTO individuoDTO : individuoDTOList) {
			IndividuoDTO individuoDTOJPA = new IndividuoDTO();
			individuoDTOJPA.setPrimerNombre(individuoDTO.getPrimerNombre());
			individuoDTOJPA.setSegundoNombre(individuoDTO.getSegundoNombre());
			individuoDTOJPA.setPrimerApellido(individuoDTO.getPrimerApellido());
			individuoDTOJPA.setSegundoApellido(individuoDTO.getSegundoApellido());
			individuoDTOJPA.setNumeroDocumento(individuoDTO.getNumeroDocumento());
			individuoDTOJPA.setEmail(individuoDTO.getEmail());
			individuoList.add(individuoDTOJPA);
		}
		return individuoList;
	}

}
