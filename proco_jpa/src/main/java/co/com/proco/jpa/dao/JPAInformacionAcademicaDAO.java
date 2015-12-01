package co.com.proco.jpa.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.proco.dao.InformacionAcademicaDAO;
import co.com.proco.model.InformacionAcademicaDTO;

@Repository
public class JPAInformacionAcademicaDAO implements InformacionAcademicaDAO{

	@PersistenceContext
	private EntityManager em = null;
	
	public List<InformacionAcademicaDTO> getInformacionAcademicaList() {
		List<InformacionAcademicaDTO> infoAcademicaDTOList = null;
		infoAcademicaDTOList = em.createQuery(queryBuilder("s.institucion","s.programa","s.tipo","s.semestre","s.modificadoPor", "s.fechaModificacion")).getResultList();
		return infoAcademicaDTOList;
	}
	
	private String queryBuilder(String... parametros){
	    String query = "";
	    StringBuilder sb = new StringBuilder("SELECT new co.com.proco.model.InformacionAcademicaDTO(");
	    for (String parametro : parametros) {
	      sb.append(parametro);
	      
	      sb.append(", ");
	    }
	    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
	    sb.append(") FROM InformacionAcademica s ORDER BY s.id");
	    query = sb.toString();
	    return query;
	}
}
