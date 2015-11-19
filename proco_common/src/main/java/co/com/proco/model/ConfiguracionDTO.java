package co.com.proco.model;

public class ConfiguracionDTO {
	/**
	 * Ruta  de la imagen
	 */
	private String imagenConfiguracion;
	
	/**
	 * Nombre de la configuración
	 */
	private String nombreConfiguracion;
	
	/**
	 * Pagina de destino, sirve para redireccionar.
	 */
	private String paginaDestinoConfiguracion;
	
	
	public ConfiguracionDTO(String imagenConfiguracion, String nombreConfiguracion, String paginaDestinoConfiguracion) {
		super();
		this.imagenConfiguracion = imagenConfiguracion;
		this.nombreConfiguracion = nombreConfiguracion;
		this.paginaDestinoConfiguracion = paginaDestinoConfiguracion;
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



	public ConfiguracionDTO (){
		
	}
	
			
}
