package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.proco.dao.AreasConocimientoDAO;
import co.com.proco.model.AreaConocimientoDTO;

@Repository
public class JPAAreaConocimientoDAO implements AreasConocimientoDAO {

	@PersistenceContext
	private EntityManager em = null;

	public boolean insert(AreaConocimientoDTO tbAreaConocimiento) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean upDate(AreaConocimientoDTO tbAreaConocimiento) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(AreaConocimientoDTO tbAreaConocimiento) {
		// TODO Auto-generated method stub
		return false;
	}

	public AreaConocimientoDTO findAreaConocimientoById(int idAreaConocimiento) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	public List<AreaConocimientoDTO> getAreasConocimientoList() {
		List<AreaConocimientoDTO> areasConocimientoList = em.createQuery(queryBuilder("o.nombreAreaConocimiento", "o.descAreaConocimiento", "o.modificadoPor","o.fechaModificacion")).getResultList();
		return areasConocimientoList;
	}
	
	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.AreaConocimientoDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM TbAreaConocimiento o");
	    query = sb.toString();
	    return query;
	  }
	

}
