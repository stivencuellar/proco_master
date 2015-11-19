package co.com.proco.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbconfiguracion")
public class TbConfiguracion {
	
	/**
	 * Llave primaria que identifica cada configuraci�n
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idConfiguracion")
	private int idConfiguracion;
	
	
	/**
	 * Imagen de la configuraci�n que se mostrar� en el sistema
	 */
	@Column(name="imagenConfiguracion")
	private String imagenConfiguracion;
	
	/***
	 * Nombre de la configuraci�n que se mostrar� en el sistema
	 */
	@Column(name="nombreConfiguracion")
	private String nombreConfiguracion;
	
	/**
	 * Pagina de configuraci�n a la cual se deber� de redireccionar.
	 */
	@Column(name="paginaDestinoConfiguracion")
	private String paginaDestinoConfiguracion;

	public int getIdConfiguracion() {
		return idConfiguracion;
	}

	public void setIdConfiguracion(int idConfiguracion) {
		this.idConfiguracion = idConfiguracion;
	}

	public String getImagenConfiguracion() {
		return imagenConfiguracion;
	}

	public void setImagenConfiguracion(String imagenConfiguracion) {
		this.imagenConfiguracion = imagenConfiguracion;
	}

	public String getNombreConfiguracion() {
		return nombreConfiguracion;
	}

	public void setNombreConfiguracion(String nombreConfiguracion) {
		this.nombreConfiguracion = nombreConfiguracion;
	}

	public String getPaginaDestinoConfiguracion() {
		return paginaDestinoConfiguracion;
	}

	public void setPaginaDestinoConfiguracion(String paginaDestinoConfiguracion) {
		this.paginaDestinoConfiguracion = paginaDestinoConfiguracion;
	}
	
	

}
