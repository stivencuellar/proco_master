package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import co.com.proco.model.InformacionAcademicaDTO;
import co.com.proco.services.ProcoFacade;

public class InformacionAcademicaImplLocal implements InformacionAcademicaInterface{

	private ApplicationContext context;
	
	public List<InformacionAcademicaDTO> getInformacionAcademica() {
		ProcoFacade inforAcademicaFacade = new ProcoFacade();
		List<InformacionAcademicaDTO> inforAcademicaDTOList = inforAcademicaFacade.getFirstInformacionAcademicaDTO();
		List<InformacionAcademicaDTO> infoAcademicaList = new ArrayList<InformacionAcademicaDTO>();
		
		for (InformacionAcademicaDTO infoAcademicaDTO : inforAcademicaDTOList) {
			InformacionAcademicaDTO infoAcademicaDTOJPA = new InformacionAcademicaDTO();
			infoAcademicaDTOJPA.setInstitucion(infoAcademicaDTO.getInstitucion());
			infoAcademicaDTOJPA.setPrograma(infoAcademicaDTOJPA.getPrograma());
			infoAcademicaDTOJPA.setTipo(infoAcademicaDTOJPA.getTipo());
			infoAcademicaDTOJPA.setSemestre(infoAcademicaDTOJPA.getSemestre());
			infoAcademicaDTOJPA.setModificadoPor(infoAcademicaDTOJPA.getModificadoPor());
			infoAcademicaDTOJPA.setFechaModificacion(infoAcademicaDTOJPA.getFechaModificacion());
			infoAcademicaList.add(infoAcademicaDTOJPA);
		}
		return infoAcademicaList;
	}

}
