package co.com.proco.model;

import java.sql.Date;

public class PostulanteDTO {
	private String siSeleccionado;
	
	private Date fechaPostulacion;

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

	public PostulanteDTO(String siSeleccionado, Date fechaPostulacion) {
		super();
		this.siSeleccionado = siSeleccionado;
		this.fechaPostulacion = fechaPostulacion;
	}
	
	public PostulanteDTO(){
		
	}
}
