package co.com.proco.model;

import java.util.Date;

public class PerfilDTO {

	private String nombre;
	
	private String descripcion;
	
	private String modificadoPor;
	
	private Date fechaModificacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public PerfilDTO(String nombre, String descripcion, String modificadoPor, Date fechaModificacion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
	
	public PerfilDTO(){
		
	}
}
