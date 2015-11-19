package co.com.proco.model;

import java.sql.Date;

public class FuncionalidadDTO {

	private String nombre;
	
	private String urlControl;
	
	private String modificadoPor;
	
	private Date fechaModificacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrlControl() {
		return urlControl;
	}

	public void setUrlControl(String urlControl) {
		this.urlControl = urlControl;
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

	public FuncionalidadDTO(String nombre, String urlControl, String modificadoPor, Date fechaModificacion) {
		super();
		this.nombre = nombre;
		this.urlControl = urlControl;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
	
}
