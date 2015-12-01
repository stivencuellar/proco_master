package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.VersionamientoDAO;
import co.com.proco.model.VersionamientoDTO;

@Repository
public class JPAVersionamientoDAO implements VersionamientoDAO{
	
	@PersistenceContext
	private EntityManager em = null;

	public List<VersionamientoDTO> getVersionamientoList() {
		List<VersionamientoDTO> versionamientoDTOList = null;
		versionamientoDTOList = em.createQuery(queryBuilder("s.nombre", "s.descripcion", "s.fechaRegistro", "s.modificadoPor", "s.fechaModificacion")).getResultList();
		return versionamientoDTOList;
	}
	
	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.VersionamientoDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Versionamiento s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
