package co.com.proco.dao;

import java.util.List;

import co.com.proco.model.SesionDTO;

/**
 * Se definen los servicios para acceder a la base de datos
 * @author SCuellar
 */
public interface SesionDAO {

	/**
	 * Obtiene un registro de la base ded atos asociado al identificador
	 * @param sesionId
	 * @return
	 */
	public SesionDTO findSesionById(int sesionId);
	
	/**
	 * Obtiene todas las sesiones que se mostraran
	 * @return
	 */
	public List<SesionDTO> getSesionList();
	
	 /**
   * Obtiene todas las sesiones que se mostraran
   * @return
   */
  public List<SesionDTO> getSesionDTOList();
  
  /**
  * Obtiene todas las sesiones que se mostraran
  * @return
  */
 public List<SesionDTO> getTitulosSesionDTOList();

}
