package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.RequerimientoDTO;
import co.com.proco.services.ProcoFacade;

public class RequerimientoImplLocal implements RequerimientoInterface{

	private ApplicationContext context;
	
	@Override
	public List<RequerimientoDTO> getRequerimientos() {
		ProcoFacade requerimientoFacade = new ProcoFacade();
		List<RequerimientoDTO> requerimientoDTOList = requerimientoFacade.getFirstRequerimientoDTO();
		List<RequerimientoDTO> requerimientoList = new ArrayList<RequerimientoDTO>();

		for (RequerimientoDTO requerimientosDTO : requerimientoDTOList){
		RequerimientoDTO requerimientosDTOJPA = new RequerimientoDTO();
		requerimientosDTOJPA.setModificadoPor(requerimientosDTO.getModificadoPor());
		requerimientosDTOJPA.setFechaModificacion(requerimientosDTO.getFechaModificacion());
		requerimientoList.add(requerimientosDTOJPA);
		}
		return requerimientoList;
	}

}
