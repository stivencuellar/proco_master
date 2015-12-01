package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.ConocimientoDAO;
import co.com.proco.model.ConocimientoDTO;

@Repository
public class JPAConocimientoDAO implements ConocimientoDAO{

	@PersistenceContext
	private EntityManager em = null;

	public List<ConocimientoDTO> getConocimientosList() {
		List<ConocimientoDTO> conocimeintoDTOList = null;
		conocimeintoDTOList = em.createQuery(queryBuilder("s.nivelGusto", "s.modificadoPor", "s.fechaModificacion")).getResultList();
		return conocimeintoDTOList;
	}
	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.ConocimientoDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Conocimiento s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
