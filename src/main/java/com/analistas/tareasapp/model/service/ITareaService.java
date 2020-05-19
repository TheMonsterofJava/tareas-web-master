package com.analistas.tareasapp.model.service;

import java.util.List;

import com.analistas.tareasapp.model.entities.Tarea;

public interface ITareaService {

	public List<Tarea> buscarTodo();
	
	public Tarea buscarPorId(Integer id);
	
	public void guardar(Tarea tarea);
	
	public void borrar(Integer id); 
	
}
