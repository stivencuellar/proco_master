package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.PermisoDAO;
import co.com.proco.model.PermisoDTO;

@Repository
public class JPAPermisoDAO implements PermisoDAO{
	
	@PersistenceContext
	private EntityManager em = null;

	public List<PermisoDTO> getPermisosList() {
		List<PermisoDTO> permisoDTOList = null;
		permisoDTOList = em.createQuery(queryBuilder("s.modificadoPor","s.fechaModificacion")).getResultList();
		return permisoDTOList;
	}

	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.PermisoDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Permiso s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
