package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.EvidenciaDAO;
import co.com.proco.model.EvidenciaDTO;

@Repository
public class JPAEvidenciaDAO implements EvidenciaDAO{

	@PersistenceContext
	private EntityManager em = null;
	
	public List<EvidenciaDTO> getEvidenciasList() {
		List<EvidenciaDTO> evidenciaDTOList = null;
		evidenciaDTOList = em.createQuery(queryBuilder("s.urlEvidencia", "s.modificadoPor",	"s.fechaModificacion")).getResultList();
		return evidenciaDTOList;
	}

	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.EvidenciaDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Evidencia s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
