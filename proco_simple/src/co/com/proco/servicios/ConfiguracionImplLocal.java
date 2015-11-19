package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.proco.dao.ConfiguracionDAO;
import co.com.proco.model.ConfiguracionDTO;
import co.com.proco.services.ProcoFacade;


public class ConfiguracionImplLocal implements ConfiguracionInterface {

	@Override
	public List<ConfiguracionDTO> recuperarConfiguracion() {
		List<ConfiguracionDTO> listaConfiguracion = new ArrayList<ConfiguracionDTO>(); 
		
//		ConfiguracionDTO objConf1 = new ConfiguracionDTO();
//		objConf1.setPaginaDestino("areasConocimientoRender.jsp");
//		objConf1.setImagen("resources/img/areasConocimiento.png");
//		objConf1.setNombreConfiguracion("Esto si funcionó :P ");
//		listaConfiguracion.add(objConf1);
//		
//		ConfiguracionDTO objConf2 = new ConfiguracionDTO();
//		objConf2.setPaginaDestino("#");
//		objConf2.setImagen("resources/img/individuo.jpg");
//		objConf2.setNombreConfiguracion("Individuos");
//		listaConfiguracion.add(objConf2);
//		
//		ConfiguracionDTO objConf3 = new ConfiguracionDTO();
//		objConf3.setPaginaDestino("#");
//		objConf3.setImagen("resources/img/proyectos.jpg");
//		objConf3.setNombreConfiguracion("Proyectos");
//		listaConfiguracion.add(objConf3);		
		
		return listaConfiguracion;
	}

	@Override
	public List<ConfiguracionDTO> recuperarConfiguracionBD() {
		ProcoFacade procoFacade = new ProcoFacade();
		List<ConfiguracionDTO> configuracionList = procoFacade.obtenerConfiguracion();
		
	//		for (ConfiguracionDTO configuracionDTO : configuracionList) {
	//			ConfiguracionDTO configuracionDTOJPA = new ConfiguracionDTO();
	//			configuracionDTOJPA.setImagenConfiguracion(configuracionDTO.getImagenConfiguracion());
	//			configuracionDTOJPA.setNombreConfiguracion(configuracionDTO.getNombreConfiguracion());
	//			configuracionDTOJPA.setPaginaDestinoConfiguracion(configuracionDTO.getPaginaDestinoConfiguracion());
	//			
	//			configuracionList.add(configuracionDTOJPA);
	//		}
			
		return configuracionList;
		
	}

}
