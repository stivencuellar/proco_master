package co.com.proco.dao;

import java.util.List;

import co.com.proco.model.ProyectosDTO;

public interface Proyectos {
	
	public boolean insert(ProyectosDTO tbProyectosDTO);
	
	public boolean upDate(ProyectosDTO tbProyectosDTO);
	
	public boolean delete(ProyectosDTO tbProyectosDTO);
	
	public ProyectosDTO findProyectoById(int idProyectosDTO);
	
	public List<ProyectosDTO> getProyectosList();
}
