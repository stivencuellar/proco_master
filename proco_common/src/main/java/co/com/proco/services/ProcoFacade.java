package co.com.proco.services;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.proco.dao.AreasConocimientoDAO;
import co.com.proco.dao.ConfiguracionDAO;
import co.com.proco.dao.MisCosasDAO;
import co.com.proco.dao.SesionDAO;
import co.com.proco.model.ActividadesDTO;
import co.com.proco.model.AreaConocimientoDTO;
import co.com.proco.model.ConfiguracionDTO;
import co.com.proco.model.ProyectosDTO;
import co.com.proco.model.SesionDTO;

/**
 * Clase en donde se exponen todos los servicios ofrecidos por el backend de hobbies
 * @author SCuellar
 *
 */
public class ProcoFacade {
  
  public List<SesionDTO> obtenerSesiones() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    SesionDAO sesionDAO = context.getBean(SesionDAO.class);
    return sesionDAO.getSesionDTOList();
  }
  
  public List<ConfiguracionDTO> obtenerConfiguracion() {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    ConfiguracionDAO configuracionDAO = context.getBean(ConfiguracionDAO.class);
	    return configuracionDAO.getConfiguracionList();
	  }
  
  public List<AreaConocimientoDTO> obtenerAreasConocimiento() {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    AreasConocimientoDAO areasConocimientoDAO = context.getBean(AreasConocimientoDAO.class);
	    return areasConocimientoDAO.getAreasConocimientoList();
	  }
  public List<ActividadesDTO> getFirstActividadesDTOFromIndex() {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    MisCosasDAO misCosasDAO = context.getBean(MisCosasDAO.class);
	    return misCosasDAO.getActividadesDTOList();
	  }

public List<ProyectosDTO> getFirstProyectosDTOFromIndex() {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    MisCosasDAO misCosasDAO = context.getBean(MisCosasDAO.class);
	    return misCosasDAO.getProyectosDTOList();
	  }
}
