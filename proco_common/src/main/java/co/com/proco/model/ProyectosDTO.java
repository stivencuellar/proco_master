package co.com.proco.model;

import java.io.Serializable;
import java.sql.Date;

public class ProyectosDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String imagen;
	
	private String titulo;
	
	private String nivelMadurez;
	
	private String descripcion;

	private String modificadoPor;

	private Date fechaModificacion;
	

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNivelMadurez() {
		return nivelMadurez;
	}

	public void setNivelMadurez(String nivelMadurez) {
		this.nivelMadurez = nivelMadurez;
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

	public ProyectosDTO(String titulo, String nivelMadurez, String descripcion, String modificadoPor, Date fechaModificacion) {
		this.titulo = titulo;
		this.nivelMadurez = nivelMadurez;
		this.descripcion = descripcion;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}

	public ProyectosDTO(String imagen, String titulo, String descripcion) {
		super();
		this.imagen = imagen;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	public ProyectosDTO() {
	}
	
}
