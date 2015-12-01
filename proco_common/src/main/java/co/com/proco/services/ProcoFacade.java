package co.com.proco.services;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.proco.dao.ActividadesDAO;
import co.com.proco.dao.AreasConocimientoDAO;
import co.com.proco.dao.ConfiguracionDAO;
import co.com.proco.dao.ConocimientoDAO;
import co.com.proco.dao.EvidenciaDAO;
import co.com.proco.dao.FuncionalidadDAO;
import co.com.proco.dao.IndividuoDAO;
import co.com.proco.dao.InformacionAcademicaDAO;
import co.com.proco.dao.MisCosasDAO;
import co.com.proco.dao.ObjetivoDAO;
import co.com.proco.dao.PerfilDAO;
import co.com.proco.dao.PermisoDAO;
import co.com.proco.dao.PostulanteDAO;
import co.com.proco.dao.RequerimientoDAO;
import co.com.proco.dao.SesionDAO;
import co.com.proco.dao.TareaDAO;
import co.com.proco.dao.VersionamientoDAO;
import co.com.proco.dao.VinculoDAO;
import co.com.proco.model.ActividadesDTO;
import co.com.proco.model.AreaConocimientoDTO;
import co.com.proco.model.ConfiguracionDTO;
import co.com.proco.model.ConocimientoDTO;
import co.com.proco.model.EvidenciaDTO;
import co.com.proco.model.FuncionalidadDTO;
import co.com.proco.model.IndividuoDTO;
import co.com.proco.model.InformacionAcademicaDTO;
import co.com.proco.model.ObjetivoDTO;
import co.com.proco.model.PerfilDTO;
import co.com.proco.model.PermisoDTO;
import co.com.proco.model.PostulanteDTO;
import co.com.proco.model.ProyectosDTO;
import co.com.proco.model.RequerimientoDTO;
import co.com.proco.model.SesionDTO;
import co.com.proco.model.TareaDTO;
import co.com.proco.model.VersionamientoDTO;
import co.com.proco.model.VinculoDTO;

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
  
  // Actividades de Mis Cosas
  public List<ActividadesDTO> getFirstActividadesDTOFromIndex() {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    MisCosasDAO misCosasDAO = context.getBean(MisCosasDAO.class);
	    return misCosasDAO.getActividadesDTOList();
	  }
  // Actividades de Actividades
  public List<ActividadesDTO> getFirstActividadesDTO() {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    ActividadesDAO actividadesDAO = context.getBean(ActividadesDAO.class);
	    return actividadesDAO.getActividadesList();
	  }

public List<ProyectosDTO> getFirstProyectosDTOFromIndex() {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    MisCosasDAO misCosasDAO = context.getBean(MisCosasDAO.class);
	    return misCosasDAO.getProyectosDTOList();
	  }

public List<IndividuoDTO> getFirstIndividuoDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    IndividuoDAO individuoDAO = context.getBean(IndividuoDAO.class);
    return individuoDAO.getIndividuosList();
  }

public List<InformacionAcademicaDTO> getFirstInformacionAcademicaDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    InformacionAcademicaDAO infoAcademicaDAO = context.getBean(InformacionAcademicaDAO.class);
    return infoAcademicaDAO.getInformacionAcademicaList();
  }

public List<ConocimientoDTO> getFirstConocimientoDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    ConocimientoDAO conocimientoDAO = context.getBean(ConocimientoDAO.class);
    return conocimientoDAO.getConocimientosList();
  }

public List<EvidenciaDTO> getFirstEvidenciaDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    EvidenciaDAO evidenciaDAO = context.getBean(EvidenciaDAO.class);
    return evidenciaDAO.getEvidenciasList();
  }

public List<FuncionalidadDTO> getFirstFuncionalidadDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    FuncionalidadDAO funcionalidadDAO = context.getBean(FuncionalidadDAO.class);
    return funcionalidadDAO.getFuncionalidadesList();
  }

public List<ObjetivoDTO> getFirstObjetivoDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    ObjetivoDAO objetivoDAO = context.getBean(ObjetivoDAO.class);
    return objetivoDAO.getObjetivosList();
  }

public List<PerfilDTO> getFirstPerfilDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    PerfilDAO perfilDAO = context.getBean(PerfilDAO.class);
    return perfilDAO.getPerfilesList();
  }

public List<PermisoDTO> getFirstPermisoDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    PermisoDAO permisoDAO = context.getBean(PermisoDAO.class);
    return permisoDAO.getPermisosList();
  }

public List<PostulanteDTO> getFirstPostulanteDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    PostulanteDAO postulanteDAO = context.getBean(PostulanteDAO.class);
    return postulanteDAO.getPostulantesList();
  }

public List<RequerimientoDTO> getFirstRequerimientoDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    RequerimientoDAO requerimientoDAO = context.getBean(RequerimientoDAO.class);
    return requerimientoDAO.getRequerimeintosList();
  }

public List<TareaDTO> getFirstTareaDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    TareaDAO tareaDAO = context.getBean(TareaDAO.class);
    return tareaDAO.getTareasList();
  }

public List<VersionamientoDTO> getFirstVersionamientoDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    VersionamientoDAO versionamientoDAO = context.getBean(VersionamientoDAO.class);
    return versionamientoDAO.getVersionamientoList();
  }

public List<VinculoDTO> getFirstVinculoDTO() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    VinculoDAO vinculoDAO = context.getBean(VinculoDAO.class);
    return vinculoDAO.getVinculoList();
  }










}
