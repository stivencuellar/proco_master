package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.ActividadesDTO;
import co.com.proco.services.ProcoFacade;

public class ActividadesImplLocal implements ActividadesInterface{

	private ApplicationContext context;

	public List<ActividadesDTO> getActividades() {
		ProcoFacade actividadesFacade = new ProcoFacade();
		List<ActividadesDTO> actividadesDTOList = actividadesFacade.getFirstActividadesDTOFromIndex();
		List<ActividadesDTO> actividadesList = new ArrayList<ActividadesDTO>();
		
		for (ActividadesDTO actividadDTO : actividadesDTOList) {
			ActividadesDTO actividadDTOJPA = new ActividadesDTO();
			actividadDTOJPA.setTitulo(actividadDTO.getTitulo());
			actividadDTOJPA.setDescripcion(actividadDTO.getDescripcion());
			actividadDTOJPA.setModificadoPor(actividadDTO.getModificadoPor());
			actividadDTOJPA.setFechaModificacion(actividadDTO.getFechaModificacion());
			actividadesList.add(actividadDTOJPA);
		}
		return actividadesList;
		
//		ProcoFacade Facade = new ProcoFacade();
//		List<DTO>  DTOList = actividadesFacade.getFirstActividadesDTOFromIndex();
//		List<DTO>  List = new ArrayList<ActividadesDTO>();
//		
//		for (ActividadesDTO actividadDTO : actividadesDTOList) {
//			ActividadesDTO actividadDTOJPA = new ActividadesDTO();
//			actividadDTOJPA.setTitulo(actividadDTO.getTitulo());
//			actividadDTOJPA.setDescripcion(actividadDTO.getDescripcion());
//			actividadDTOJPA.setModificadoPor(actividadDTO.getModificadoPor());
//			actividadDTOJPA.setFechaModificacion(actividadDTO.getFechaModificacion());
//			actividadesList.add(actividadDTOJPA);
//		}
//		return actividadesList;
	}

}
