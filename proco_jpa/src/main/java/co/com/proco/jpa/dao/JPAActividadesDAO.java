package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.ActividadesDAO;
import co.com.proco.model.ActividadesDTO;

@Repository
public class JPAActividadesDAO implements ActividadesDAO{

	@PersistenceContext
	  private EntityManager em = null;
	
	public List<ActividadesDTO> getActividadesList() {
		List<ActividadesDTO> actividadesDTOList = null;
		//actividadesDTOList = em.createQuery(queryBuilder("s.titulo", "s.imagen", "s.descripcion", "s.requeridos", "s.recompenza")).getResultList();
		actividadesDTOList = em.createQuery(queryBuilderAct("s.titulo", "s.descripcion", "s.modificadoPor", "s.fechaModificacion")).getResultList();
		return actividadesDTOList;
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
}
