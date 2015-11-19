package co.com.proco.jpa.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbAreaConocimiento")
public class TbAreaConocimiento {

	
	/**
	 * Llave primaria de la tabla de areas de conocimiento
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAreaConocimiento")
	private int idAreaConocimiento;
	
	/**
	 * Nombre del area de conocimiento
	 */
	@Column(name="nombreAreaConocimiento")
	private String nombreAreaConocimiento;
	
	/**
	 * Descripcion del area de conocimiento
	 */
	@Column(name="descAreaConocimiento")
	private String descAreaConocimiento;
	
	/**
	 * Ultimo usuario del sistema que modifico
	 */
	@Column(name="modificadoPor")
	private String modificadoPor;
	
	/**
	 * Ultima fecha de modificacion
	 */
	@Column(name="fechaModificacion")
	private Date fechaModificacion;

	public int getIdAreaConocimiento() {
		return idAreaConocimiento;
	}

	public void setIdAreaConocimiento(int idAreaConocimiento) {
		this.idAreaConocimiento = idAreaConocimiento;
	}

	public String getNombreAreaConocimiento() {
		return nombreAreaConocimiento;
	}

	public void setNombreAreaConocimiento(String nombreAreaConocimiento) {
		this.nombreAreaConocimiento = nombreAreaConocimiento;
	}

	public String getDescAreaConocimiento() {
		return descAreaConocimiento;
	}

	public void setDescAreaConocimiento(String descAreaConocimiento) {
		this.descAreaConocimiento = descAreaConocimiento;
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
	
	
}
