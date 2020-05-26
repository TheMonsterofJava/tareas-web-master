package com.analistas.tareasapp.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.analistas.tareasapp.model.entities.Tarea;
import com.analistas.tareasapp.model.repository.TareaRepository;

@Service
public class ClienteServiceImpl implements ITareaService {
	
	TareaRepository repo = new TareaRepository();

	@Override
	public List<Tarea> buscarTodo() {
		
		return repo.getTareas();
	}

	@Override
	public Tarea buscarPorId(Integer id) {
	
		return null;
	}

	@Override
	public void guardar(Tarea tarea) {
	
		repo.addTarea(tarea);
		
	}

	@Override
	public void borrar(Integer id) {
		
		
	}

}
