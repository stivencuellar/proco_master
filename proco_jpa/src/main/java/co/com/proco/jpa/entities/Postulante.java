package co.com.proco.jpa.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbpostulante")
public class Postulante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="siSeleccionado")
	private String siSeleccionado;
	
	@Column(name="fechaPostulacion")
	private Date fechaPostulacion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSiSeleccionado() {
		return siSeleccionado;
	}

	public void setSiSeleccionado(String siSeleccionado) {
		this.siSeleccionado = siSeleccionado;
	}

	public Date getFechaPostulacion() {
		return fechaPostulacion;
	}

	public void setFechaPostulacion(Date fechaPostulacion) {
		this.fechaPostulacion = fechaPostulacion;
	}
	
}
