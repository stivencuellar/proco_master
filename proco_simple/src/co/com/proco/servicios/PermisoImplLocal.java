package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.PermisoDTO;
import co.com.proco.services.ProcoFacade;


public class PermisoImplLocal implements PermisoInterface{
	
	private ApplicationContext context;

	@Override
	public List<PermisoDTO> getPermiso() {
		ProcoFacade permisoFacade = new ProcoFacade();	
		List<PermisoDTO> permisoDTOList = permisoFacade.getFirstPermisoDTO();	
		List<PermisoDTO> permisoList = new ArrayList<PermisoDTO>();	
			
		for (PermisoDTO permisosDTO : permisoDTOList){	
			PermisoDTO permisosDTOJPA = new PermisoDTO();
			permisosDTOJPA.setModificadoPor(permisosDTO.getModificadoPor());
			permisosDTOJPA.setFechaModificacion(permisosDTO.getFechaModificacion());
			permisoList.add(permisosDTOJPA);
		}	
		return permisoList;	

	}


}
