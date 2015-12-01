package co.com.proco.model;

import java.sql.Date;

public class VinculoDTO {
	private String rol;
	
	private String modificadoPor;
	
	private Date fechaModificacion;

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
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

	public VinculoDTO(String rol, String modificadoPor, Date fechaModificacion) {
		super();
		this.rol = rol;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}

	public VinculoDTO() {
		super();
	}
	
	
}
