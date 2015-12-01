package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.RequerimientoDAO;
import co.com.proco.model.RequerimientoDTO;

@Repository
public class JPARequerimientoDAO implements RequerimientoDAO{
	
	@PersistenceContext
	private EntityManager em = null;

	public List<RequerimientoDTO> getRequerimeintosList() {
		List<RequerimientoDTO> requerimientoDTOList = null;
		requerimientoDTOList = em.createQuery(queryBuilder("s.modificadoPor", "s.fechaModificacion")).getResultList();
		return requerimientoDTOList;
	}

	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.RequerimientoDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Requerimiento s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
