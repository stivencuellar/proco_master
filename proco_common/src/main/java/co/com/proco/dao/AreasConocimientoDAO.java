/**
 * 
 */
package co.com.proco.dao;

import java.util.List;

import co.com.proco.model.AreaConocimientoDTO;

/**
 * Interfaz donde se definiran los servicios para acceder a la base de datos y consultar las areas de conocimiento
 * @author SCuellar
 *
 */
public interface AreasConocimientoDAO {
	
	/**
	 * Metodo para hacer inserción de áreas de conocimiento en la base de datos
	 * @param tbAreaConocimiento
	 * @return
	 */
	public boolean insert(AreaConocimientoDTO tbAreaConocimiento);
	
	/**
	 * Metodo para hacer actualización de áreas del conocimiento en la base de datos
	 * @param tbAreaConocimiento
	 * @return falso si no se logra hacer la transacción, retorna verdadero si se completa exitosamente
	 */
	public boolean upDate(AreaConocimientoDTO tbAreaConocimiento);
	
	/**
	 * Metodo para hacer eliminación de áreas del conocimiento en la base de datos
	 * @param tbAreaConocimiento
	 * @return  falso si no se logra hacer la transacción, retorna verdadero si se completa exitosamente
	 */
	public boolean delete(AreaConocimientoDTO tbAreaConocimiento);
	
	/**
	 * Metodo para consultar un área de conocimiento con su identificador en base de datos
	 * @param idAreaConocimiento
	 * @return
	 */
	public AreaConocimientoDTO findAreaConocimientoById(int idAreaConocimiento);
	
	/**
	 * Metodo para consultar todas las áreas de conocimiento existentes
	 * @return
	 */
	public List<AreaConocimientoDTO> getAreasConocimientoList ();
	
}
