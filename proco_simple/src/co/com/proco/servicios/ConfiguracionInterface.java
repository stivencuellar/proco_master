package co.com.proco.servicios;

import java.util.List;

import co.com.proco.model.ConfiguracionDTO;

public interface ConfiguracionInterface {
	
	public List<ConfiguracionDTO> recuperarConfiguracion();
	
	public List<ConfiguracionDTO> recuperarConfiguracionBD();
	
	public List<ConfiguracionDTO> obtenerConfiguracionWS();

}
