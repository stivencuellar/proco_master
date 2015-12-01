package co.com.proco.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.FuncionalidadDAO;
import co.com.proco.model.FuncionalidadDTO;

@Repository
public class JPAFuncionalidadDAO implements FuncionalidadDAO{
	@PersistenceContext
	private EntityManager em = null;

	public List<FuncionalidadDTO> getFuncionalidadesList() {
		List<FuncionalidadDTO> funcionalidadDTOList = null;
		funcionalidadDTOList = em.createQuery(queryBuilder("s.nombre",	"s.urlControl",	"s.modificadoPor",	"s.fechaModificacion")).getResultList();
		return funcionalidadDTOList;
	}
	

	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.FuncionalidadDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM Funcionalidad s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	  }
}
