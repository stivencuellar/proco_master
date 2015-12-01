package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.VinculoDTO;
import co.com.proco.services.ProcoFacade;

public class VinculoImplLocal implements VinculoInterface{
	
	private ApplicationContext context;

	@Override
	public List<VinculoDTO> getVinculo() {
		ProcoFacade vinculosFacade = new ProcoFacade();
		List<VinculoDTO> vinculosDTOList = vinculosFacade.getFirstVinculoDTO();
		List<VinculoDTO> vinculosList = new ArrayList<VinculoDTO>();

		for (VinculoDTO vinculoDTO : vinculosDTOList){
		VinculoDTO vinculoDTOJPA = new VinculoDTO();
		vinculoDTOJPA.setRol(vinculoDTO.getRol());
		vinculoDTOJPA.setModificadoPor(vinculoDTO.getModificadoPor());
		vinculoDTOJPA.setFechaModificacion(vinculoDTO.getFechaModificacion());

		vinculosList.add(vinculoDTOJPA);
		}
		return vinculosList;

	}
}
