package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.ObjetivoDAO;
import co.com.proco.model.ObjetivoDTO;

@Repository
public class JPAObjetivoDAO implements ObjetivoDAO{
	@PersistenceContext
	private EntityManager em = null;

	public List<ObjetivoDTO> getObjetivosList() {
		List<ObjetivoDTO> objetivoDTOList = null;
		objetivoDTOList = em.createQuery(queryBuilder("s.nombre","s.descripcion","s.modificadoPor","s.fechaModificacion")).getResultList();
		return objetivoDTOList;
	}
	
	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.ObjetivoDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Objetivo s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
