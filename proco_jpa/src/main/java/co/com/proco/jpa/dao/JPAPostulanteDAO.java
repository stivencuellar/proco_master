package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.PostulanteDAO;
import co.com.proco.model.PostulanteDTO;

@Repository
public class JPAPostulanteDAO implements PostulanteDAO{
	
	@PersistenceContext
	private EntityManager em = null;

	public List<PostulanteDTO> getPostulantesList() {
		List<PostulanteDTO> postulanteDTOList = null;
		postulanteDTOList = em.createQuery(queryBuilder("s.siSeleccionado", "s.fechaPostulacion")).getResultList();
		return postulanteDTOList;
	}

	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.PostulanteDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Postulante s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
