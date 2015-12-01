package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.VersionamientoDTO;
import co.com.proco.services.ProcoFacade;

public class VersionamientoImplLocal implements VersionamientoInterface{

	private ApplicationContext context;
	
	@Override
	public List<VersionamientoDTO> getVersionamiento() {
		ProcoFacade versionamientoFacade = new ProcoFacade();
		List<VersionamientoDTO> versionamientoDTOList = versionamientoFacade.getFirstVersionamientoDTO();
		List<VersionamientoDTO> versionamientoList = new ArrayList<VersionamientoDTO>();

		for (VersionamientoDTO versionamientoDTO : versionamientoDTOList){
		VersionamientoDTO versionamientoDTOJPA = new VersionamientoDTO();
		versionamientoDTOJPA.setNombre(versionamientoDTO.getNombre());
		versionamientoDTOJPA.setDescripcion(versionamientoDTO.getDescripcion());
		versionamientoDTOJPA.setFechaRegistro(versionamientoDTO.getFechaRegistro());
		versionamientoDTOJPA.setModificadoPor(versionamientoDTO.getModificadoPor());
		versionamientoDTOJPA.setFechaModificacion(versionamientoDTO.getFechaModificacion());
		versionamientoList.add(versionamientoDTOJPA);
		}
		return versionamientoList;

	}

}
