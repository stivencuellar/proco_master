package co.com.proco.model;

import java.io.Serializable;

public class ProyectosDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String imagen;
	
	private String titulo;
	
	private String descripcion;

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ProyectosDTO(String imagen, String titulo, String descripcion) {
		this.imagen = imagen;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	public ProyectosDTO() {
	}
	
}
