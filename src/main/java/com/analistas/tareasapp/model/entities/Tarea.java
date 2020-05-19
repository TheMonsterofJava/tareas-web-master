package com.analistas.tareasapp.model.entities;

import java.time.LocalDate;

public class Tarea {

	private int nro;
	private String nombre;
	private LocalDate fecha;
	private String estado;
	
	//Constructor
	public Tarea() {}


	public Tarea(int nro, String nombre,String estado, LocalDate fecha) {
		
		this.nro = nro;
		this.nombre = nombre;
		this.estado = estado;
		this.fecha = fecha;
		
	}

	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}	


	@Override
	public String toString() {
		return " " + nombre + " " + " Estado de la Tarea: " + "" + estado + " Fecha del Trabajo: " + fecha;
	} 
	
}
