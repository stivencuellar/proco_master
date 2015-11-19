package co.com.proco.servicios;

import java.util.List;

import co.com.proco.model.ActividadesDTO;
import co.com.proco.model.ProyectosDTO;

public interface MisCosasServicesInterface {
	public List<ActividadesDTO> getActividades();
	public List<ProyectosDTO> getProyectos();
}
