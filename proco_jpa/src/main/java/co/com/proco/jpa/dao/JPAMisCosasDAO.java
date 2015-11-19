package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.MisCosasDAO;
import co.com.proco.model.ActividadesDTO;
import co.com.proco.model.ProyectosDTO;

@Repository
public class JPAMisCosasDAO implements MisCosasDAO{

	@PersistenceContext
	  private EntityManager em = null;
		
	public List<ActividadesDTO> getActividadesDTOList() {
		List<ActividadesDTO> actividadesDTOList = null;
		//actividadesDTOList = em.createQuery(queryBuilder("s.titulo", "s.imagen", "s.descripcion", "s.requeridos", "s.recompenza")).getResultList();
		actividadesDTOList = em.createQuery(queryBuilderAct("s.titulo", "s.imagen", "s.descripcion")).getResultList();
		return actividadesDTOList;
	}
	
	public List<ProyectosDTO> getProyectosDTOList() {
		List<ProyectosDTO> proyectosDTOList = null;
		proyectosDTOList = em.createQuery(queryBuilderPro("s.imagen", "s.titulo", "s.descripcion")).getResultList();
		return proyectosDTOList;
	}
	
	private String queryBuilderAct(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.ActividadesDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Actividades s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
	
	private String queryBuilderPro(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.ProyectosDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Proyectos s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
