package co.com.proco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.proco.model.AreaConocimientoDTO;
import co.com.proco.model.ConfiguracionDTO;
import co.com.proco.services.ProcoFacade;


public class AreasConocimientoImplLocal implements AreasConocimientoInterface {

	@Override
	public List<AreaConocimientoDTO> recuperarAreasConocimientoBD() {
	
		ProcoFacade procoFacade = new ProcoFacade();
		List<AreaConocimientoDTO> areasConocimientoList = procoFacade.obtenerAreasConocimiento();		
		return areasConocimientoList;
	}

}
