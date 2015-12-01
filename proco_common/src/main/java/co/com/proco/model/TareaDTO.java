package co.com.proco.model;

import java.sql.Date;

public class TareaDTO {
	private String resumen;
	
	private String detalle;
	
	private String modificadoPor;
	
	private Date fechaModificacion;

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public TareaDTO(String resumen, String detalle, String modificadoPor, Date fechaModificacion) {
		super();
		this.resumen = resumen;
		this.detalle = detalle;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
	
	public TareaDTO(){
		super();
	}
}
