package co.com.proco.model;

import java.sql.Date;

public class PermisoDTO {
	private String modificadoPor;

	private Date fechaModificacion;

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

	public PermisoDTO(String modificadoPor, Date fechaModificacion) {
		super();
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
	
	
}
