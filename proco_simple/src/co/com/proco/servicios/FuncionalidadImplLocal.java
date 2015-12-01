package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.FuncionalidadDTO;
import co.com.proco.services.ProcoFacade;

public class FuncionalidadImplLocal implements FuncionalidadInterface{
	
	private ApplicationContext context;

	@Override
	public List<FuncionalidadDTO> getFuncionalidades() {
		ProcoFacade funcionalidadFacade = new ProcoFacade();	
		List<FuncionalidadDTO> funcionalidadDTOList = funcionalidadFacade.getFirstFuncionalidadDTO();	
		List<FuncionalidadDTO> funcionalidadList = new ArrayList<FuncionalidadDTO>();	
			
		for (FuncionalidadDTO funcionalidadesDTO : funcionalidadDTOList){	
			FuncionalidadDTO funcionalidadesDTOJPA = new FuncionalidadDTO();
			funcionalidadesDTOJPA.setNombre(funcionalidadesDTO.getNombre());
			funcionalidadesDTOJPA.setUrlControl(funcionalidadesDTO.getUrlControl());
			funcionalidadesDTOJPA.setModificadoPor(funcionalidadesDTO.getModificadoPor());
			funcionalidadesDTOJPA.setFechaModificacion(funcionalidadesDTO.getFechaModificacion());
			funcionalidadList.add(funcionalidadesDTOJPA);
		}	
		return funcionalidadList;	

	}

}
