package co.com.proco.jpa.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.ProyectosDAO;
import co.com.proco.model.ProyectosDTO;

@Repository
public class JPAProyectosDAO implements ProyectosDAO{

	@PersistenceContext
	  private EntityManager em = null;
	
	public List<ProyectosDTO> getProyectosList() {
		List<ProyectosDTO> proyectosDTOList = null;
		proyectosDTOList = em.createQuery(queryBuilder("s.titulo", "s.nivelMadurez", "s.descripcion", "s.modificadoPor", "s.fechaModificacion")).getResultList();
		return proyectosDTOList;
	}
	private String queryBuilder(String... parametros){
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
