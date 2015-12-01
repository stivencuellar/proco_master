package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.TareaDTO;
import co.com.proco.services.ProcoFacade;

public class TareaImplLocal implements TareaInterface{
	
	private ApplicationContext context;

	@Override
	public List<TareaDTO> getTareas() {
		ProcoFacade tareaFacade = new ProcoFacade();
		List<TareaDTO> tareaDTOList = tareaFacade.getFirstTareaDTO();
		List<TareaDTO> tareaList = new ArrayList<TareaDTO>();

		for (TareaDTO tareasDTO : tareaDTOList){
		TareaDTO tareasDTOJPA = new TareaDTO();
		tareasDTOJPA.setResumen(tareasDTO.getResumen());
		tareasDTOJPA.setDetalle(tareasDTO.getDetalle());
		tareasDTOJPA.setModificadoPor(tareasDTO.getModificadoPor());
		tareasDTOJPA.setFechaModificacion(tareasDTO.getFechaModificacion());

		tareaList.add(tareasDTOJPA);
		}
		return tareaList;

	}

}
