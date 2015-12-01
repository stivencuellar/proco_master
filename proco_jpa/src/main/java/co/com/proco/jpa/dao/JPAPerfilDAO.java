package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.PerfilDAO;
import co.com.proco.model.PerfilDTO;

@Repository
public class JPAPerfilDAO implements PerfilDAO{
	
	@PersistenceContext
	private EntityManager em = null;

	public List<PerfilDTO> getPerfilesList() {
		List<PerfilDTO> perfilDTOList = null;
		perfilDTOList = em.createQuery(queryBuilder("s.nombre","s.descripcion","s.modificadoPor","s.fechaModificacion")).getResultList();
		return perfilDTOList;
	}
	
	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.PerfilDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Perfil s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }

}
