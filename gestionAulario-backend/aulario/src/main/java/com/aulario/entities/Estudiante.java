package com.aulario.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ESTUDIANTE")
public class Estudiante {
	
	//PK
	@Id
	private String nie;
	// Atributos
	private String nombre;
	
	public Estudiante(String nie, String nombre) {
		super();
		this.nie = nie;
		this.nombre = nombre;
	}
	public Estudiante() {
		super();
	}
	public String getNie() {
		return nie;
	}
	public void setNie(String nie) {
		this.nie = nie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
