package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.proco.dao.SesionDAO;
import co.com.proco.model.SesionDTO;
import co.com.proco.services.ProcoFacade;

/**
 * Recuperar la informacion de los objetos sesion que se muestran en la pantalla
 * 
 * @author SCuellar
 */
public class SesionServicesImplLocal implements SesionServicesInterface {

	private ApplicationContext context;
	
	public List<SesionDTO> getSesiones() {
	  
		ProcoFacade procoFacade = new ProcoFacade();
		List<SesionDTO> sesionDTOList = procoFacade.obtenerSesiones();

		// Crear la lista con los DTO
		List<SesionDTO> sesionList = new ArrayList<SesionDTO>();

		for (SesionDTO sesionDTO : sesionDTOList) {
			SesionDTO sesionDTOJPA = new SesionDTO();
			sesionDTOJPA.setTitulo(sesionDTO.getTitulo());
			sesionDTOJPA.setImagen(sesionDTO.getImagen());
			sesionDTOJPA.setNombre(sesionDTO.getNombre());
			sesionDTOJPA.setDescripcion(sesionDTO.getDescripcion());
			sesionList.add(sesionDTOJPA);
		}

    return sesionList;
  }
	
//	public List<SesionDTO> getSesiones() {
//
//		context = new ClassPathXmlApplicationContext("Spring-Module.xml");
//
//		// Se obtiene el servicio que implementa los servicios de la base de
//		// datos
//		SesionDAO sesionDAO = (SesionDAO) context.getBean("sesionDAO");
//
//		// Crear la lista con los DTO
//		List<SesionDTO> sesionList = new ArrayList<SesionDTO>();
//		List<Sesion> sesions = sesionDAO.getSesionList();
//		for (Sesion sesion : sesions) {
//			// Creando un objeto de la lista de tipo sesionDTO
//			SesionDTO sesionDTO = new SesionDTO();
//			sesionDTO.setTitulo(sesion.getTitulo());
//			sesionDTO.setImagen(sesion.getImagen());
//			// Adicionando el objeto a la lista
//			sesionList.add(sesionDTO);
//		}
//		return sesionList;
//	}
}
