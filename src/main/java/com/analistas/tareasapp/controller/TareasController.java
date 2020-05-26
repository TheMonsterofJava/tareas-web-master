package com.analistas.tareasapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.analistas.tareasapp.model.entities.Tarea;
import com.analistas.tareasapp.model.service.ITareaService;





@Controller
@RequestMapping({"", "tareas"})
public class TareasController {

	@Autowired
	ITareaService tareaService;
	
	List<Tarea> tareas;
	
	@GetMapping({"","list"})
	public String listar(Model m) {
		
		tareas = tareaService.buscarTodo();
		
		m.addAttribute("titulo","Listado de Tareas");
		m.addAttribute("tareas", tareas);
		
		return "tareas/list";
		
	}
	
	@GetMapping({"/form"})
	public String form(Model m) {
		
		m.addAttribute("mensaje", "Segunda Página");
		
		return "tareas/form";
		
	}
	
	
}
