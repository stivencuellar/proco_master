package co.com.proco.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name="tbactividades")
public class Actividades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="requeridos")
	private String requeridos;
	
	@Column(name="recompenza")
	private String recompenza;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRequeridos() {
		return requeridos;
	}

	public void setRequeridos(String requeridos) {
		this.requeridos = requeridos;
	}

	public String getRecompenza() {
		return recompenza;
	}

	public void setRecompenza(String recompenza) {
		this.recompenza = recompenza;
	}
}
