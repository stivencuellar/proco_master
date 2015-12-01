package co.com.proco.model;

import java.sql.Date;

public class InformacionAcademicaDTO {

	private String institucion;
	
	private String programa;
	
	private String tipo;
	
	private String semestre;
	
	private int anio;
	
	private String modificadoPor;
	
	private Date fechaModificacion;

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
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

	public InformacionAcademicaDTO(String institucion, String programa, String tipo, String semestre, int anio,
			String modificadoPor, Date fechaModificacion) {
		super();
		this.institucion = institucion;
		this.programa = programa;
		this.tipo = tipo;
		this.semestre = semestre;
		this.anio = anio;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}
	
	public InformacionAcademicaDTO(String institucion, String programa, String tipo, String semestre,String modificadoPor, Date fechaModificacion) {
		super();
		this.institucion = institucion;
		this.programa = programa;
		this.tipo = tipo;
		this.semestre = semestre;
		this.modificadoPor = modificadoPor;
		this.fechaModificacion = fechaModificacion;
	}

	public InformacionAcademicaDTO() {
		super();
	}
	
}
