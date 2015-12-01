package co.com.proco.servicios;

import java.util.List;

import co.com.proco.model.AreaConocimientoDTO;

public interface AreasConocimientoInterface {
	
	public List<AreaConocimientoDTO> recuperarAreasConocimientoBD();	
	
	public List<AreaConocimientoDTO> recuperarAreasConocimientoWS();
	
}
