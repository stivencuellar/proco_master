package co.com.proco.model;

import java.sql.Date;

public class EvidenciaDTO {
	private String urlEvidencia;
	
	private String modificadoPor;
	
	private Date fechaModificacion;

	public String getUrlEvidencia() {
		return urlEvidencia;
	}

	public void setUrlEvidencia(String urlEvidencia) {
		this.urlEvidencia = urlEvidencia;
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

	public EvidenciaDTO(String urlEvidencia, String modificadoPor, Date fechaModificacion) {
		super();
		this.urlEvidencia = urlEvidencia;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
}
