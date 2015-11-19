/**
 * 
 */
package co.com.proco.dao;

import java.sql.SQLException;
import java.util.List;

import co.com.proco.model.ConfiguracionDTO;

/**
 * Interfaz donde se definiran los servicios para acceder a la base de datos y consultar la configuracion
 * @author SCuellar
 *
 */
public interface ConfiguracionDAO {
	
	/**
	 * Inserta un nuevo registro de configuración en la base de datos
	 * @param tbConfiguracion
	 * @return
	 */
	public boolean insert(ConfiguracionDTO tbConfiguracion);
	
	/**
	 * Permite buscar un una configuración por un codigo especifico
	 * @param idConfiguracion
	 * @return
	 * @throws SQLException 
	 */
	public ConfiguracionDTO findConfiguracionById(int idConfiguracion) throws SQLException;
	
	/**
	 * Retorna un listado de configuraciones
	 * @return
	 */
	public List<ConfiguracionDTO> getConfiguracionList();

}
