package co.com.proco.model;

import java.util.Date;

public class AreaConocimientoDTO {

	/**
	 * Nombre del area de conocimiento
	 */
	private String nombreAreaConocimiento;
	
	/**
	 * Descripcion del area de conocimiento
	 */
	private String descAreaConocimiento;
	
	/**
	 * Ultimo usuario del sistema que modifico
	 */
	private String modificadoPor;
	
	/**
	 * Ultima fecha de modificacion
	 */
	private Date fechaModificacion;

	/**
	 * @return the nombreAreaConocimiento
	 */
	public String getNombreAreaConocimiento() {
		return nombreAreaConocimiento;
	}

	/**
	 * @param nombreAreaConocimiento the nombreAreaConocimiento to set
	 */
	public void setNombreAreaConocimiento(String nombreAreaConocimiento) {
		this.nombreAreaConocimiento = nombreAreaConocimiento;
	}

	/**
	 * @return the descAreaConocimiento
	 */
	public String getDescAreaConocimiento() {
		return descAreaConocimiento;
	}

	/**
	 * @param descAreaConocimiento the descAreaConocimiento to set
	 */
	public void setDescAreaConocimiento(String descAreaConocimiento) {
		this.descAreaConocimiento = descAreaConocimiento;
	}

	/**
	 * @return the modificadoPor
	 */
	public String getModificadoPor() {
		return modificadoPor;
	}

	/**
	 * @param modificadoPor the modificadoPor to set
	 */
	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	/**
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public AreaConocimientoDTO(String nombreAreaConocimiento, String descAreaConocimiento, String modificadoPor,
			Date fechaModificacion) {
		super();
		this.nombreAreaConocimiento = nombreAreaConocimiento;
		this.descAreaConocimiento = descAreaConocimiento;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
	
	
}
