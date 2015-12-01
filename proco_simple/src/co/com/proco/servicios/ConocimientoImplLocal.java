package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.ConocimientoDTO;
import co.com.proco.services.ProcoFacade;

public class ConocimientoImplLocal implements ConocimientoInterface{
	
	private ApplicationContext context;

	@Override
	public List<ConocimientoDTO> getConocimientos() {
		ProcoFacade conocimientoFacade = new ProcoFacade();
		List<ConocimientoDTO> conocimientoDTOList = conocimientoFacade.getFirstConocimientoDTO();
		List<ConocimientoDTO> conocimientoList = new ArrayList<ConocimientoDTO>();

		for (ConocimientoDTO conocimientosDTO : conocimientoDTOList){
		ConocimientoDTO conocimientosDTOJPA = new ConocimientoDTO();
		conocimientosDTOJPA.setNivelGusto(conocimientosDTO.getNivelGusto());
		conocimientosDTOJPA.setModificadoPor(conocimientosDTO.getModificadoPor());
		conocimientosDTOJPA.setFechaModificacion(conocimientosDTO.getFechaModificacion());
		conocimientoList.add(conocimientosDTOJPA);
		}
		return conocimientoList;

	}

}
