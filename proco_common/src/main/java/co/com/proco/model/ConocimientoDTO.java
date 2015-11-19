package co.com.proco.model;

import java.sql.Date;

public class ConocimientoDTO {
	private int nivelGusto;
	
	private String modificadoPor;
	
	private Date fechaModificacion;

	public int getNivelGusto() {
		return nivelGusto;
	}

	public void setNivelGusto(int nivelGusto) {
		this.nivelGusto = nivelGusto;
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

	public ConocimientoDTO(int nivelGusto, String modificadoPor, Date fechaModificacion) {
		super();
		this.nivelGusto = nivelGusto;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
	
}
