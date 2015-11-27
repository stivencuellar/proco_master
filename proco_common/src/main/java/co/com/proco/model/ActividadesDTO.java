package co.com.proco.model;

import java.io.Serializable;
import java.sql.Date;

public class ActividadesDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String imagen;
	
	private String titulo;
	
	private String descripcion;
	
	private Integer requeridos;
	
	private Integer recompenza;

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getRequeridos() {
		return requeridos;
	}

	public void setRequeridos(Integer requeridos) {
		this.requeridos = requeridos;
	}

	public Integer getRecompenza() {
		return recompenza;
	}

	public void setRecompenza(Integer recompenza) {
		this.recompenza = recompenza;
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

	public ActividadesDTO (String titulo, String imagen, String descripcion){
		this.titulo = titulo;
		this.imagen = imagen;
		this.descripcion = descripcion;
		//this.recompenza = recompenza;
		//this.requeridos = requeridos;
	}
	
	public ActividadesDTO (String titulo, String descripcion, String modificadoPor, Date fechaModificacion){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
	
	public ActividadesDTO(){
		
	}
}
