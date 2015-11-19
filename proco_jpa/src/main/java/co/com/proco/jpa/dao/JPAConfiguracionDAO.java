package co.com.proco.jpa.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.ConfiguracionDAO;
import co.com.proco.jpa.entities.TbConfiguracion;
import co.com.proco.model.ConfiguracionDTO;

@Repository
public class JPAConfiguracionDAO implements ConfiguracionDAO {

	@PersistenceContext
	private EntityManager em = null;
	
	public boolean insert(TbConfiguracion tbConfiguracion) {
		// TODO Auto-generated method stub
		return false;
	}

	public ConfiguracionDTO findConfiguracionById(int idConfiguracion) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ConfiguracionDTO> getConfiguracionList() {
		List<ConfiguracionDTO> configuracionList = null;
		configuracionList = em.createQuery(queryBuilder("o.imagenConfiguracion", "o.nombreConfiguracion", "o.paginaDestinoConfiguracion")).getResultList();
		return configuracionList;
	}
	
	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.ConfiguracionDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM TbConfiguracion o");
	    query = sb.toString();
	    return query;
	  }

	public boolean insert(ConfiguracionDTO tbConfiguracion) {
		// TODO Auto-generated method stub
		return false;
	}

}
