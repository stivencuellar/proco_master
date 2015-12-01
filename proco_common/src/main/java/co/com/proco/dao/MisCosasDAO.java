package co.com.proco.dao;

import java.util.List;
import co.com.proco.model.ActividadesDTO;
import co.com.proco.model.ProyectosDTO;

public interface MisCosasDAO {
	
	public List<ActividadesDTO> getActividadesDTOList();

	public List<ProyectosDTO> getProyectosDTOList();
} 