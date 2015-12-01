package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.VinculoDAO;
import co.com.proco.model.VinculoDTO;

@Repository
public class JPAVinculoDAO implements VinculoDAO {
	
	@PersistenceContext
	private EntityManager em = null;

	public List<VinculoDTO> getVinculoList() {
		List<VinculoDTO> vinculoDTOList = null;
		vinculoDTOList = em.createQuery(queryBuilder("s.rol", "s.modificadoPor", "s.fechaModificacion")).getResultList();
		return vinculoDTOList;
	}
	
	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.VinculoDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Vinculo s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
