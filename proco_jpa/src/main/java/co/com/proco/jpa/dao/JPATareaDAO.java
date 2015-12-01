package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.TareaDAO;
import co.com.proco.model.TareaDTO;

@Repository
public class JPATareaDAO implements TareaDAO{
	
	@PersistenceContext
	private EntityManager em = null;

	public List<TareaDTO> getTareasList() {
		List<TareaDTO> tareaDTOList = null;
		tareaDTOList = em.createQuery(queryBuilder("s.resumen", "s.detalle", "s.modificadoPor", "s.fechaModificacion")).getResultList();
		return tareaDTOList;
	}

	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.TareaDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Tarea s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
