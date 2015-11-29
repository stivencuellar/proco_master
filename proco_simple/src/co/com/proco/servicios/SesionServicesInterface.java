package co.com.proco.servicios;

import java.util.List;

import co.com.proco.model.SesionDTO;


/**
 * Interface en donde se definen los serivicios disponibles para recuperar los objetos sesion
 * @author SCuellar
 *
 */
public interface SesionServicesInterface {

	public List<SesionDTO> getSesiones();
	
	public List<SesionDTO> ObtenerSesion();
}
