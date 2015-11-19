package co.com.proco.model;

import java.io.Serializable;

/**
 * Calse que contiene la información de las sesiones de la portada
 * @author SCuellar
 *
 */
public class SesionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 292407813194348828L;

	/**
	 * Titulo de la sesion
	 */
	private String titulo;
	
	/**
	 * Imagena asociada a la sesion
	 */
	private String imagen;
	
	private String nombre;
	
	private String descripcion;

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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public SesionDTO (String titulo, String imagen, String nombre, String descripcion) {
		  this.titulo = titulo;
		  this.imagen = imagen;
		  this.nombre = nombre;
		  this.descripcion = descripcion;
		}
	
	public SesionDTO (String titulo) {
		  this.titulo = titulo;
		}

	public SesionDTO() {
		// TODO Auto-generated constructor stub
	}	
}
