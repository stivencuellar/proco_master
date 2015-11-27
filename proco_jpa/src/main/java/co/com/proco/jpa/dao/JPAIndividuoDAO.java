package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.IndividuoDAO;
import co.com.proco.model.IndividuoDTO;

@Repository
public class JPAIndividuoDAO implements IndividuoDAO{

	@PersistenceContext
	private EntityManager em = null;
	
	public List<IndividuoDTO> getIndividuoList() {
		List<IndividuoDTO> individuoDTOList = null;
		individuoDTOList = em.createQuery(queryBuilder("s.primerNombre", "s.segundoNombre", "s.primerApellido", "s.segundoApellido", "s.numeroDocumento","s.email")).getResultList();
		return individuoDTOList;
	}

	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.IndividuoDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Individuo s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
