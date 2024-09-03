package com.aulario.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DESCANSO")
public class Descanso {

	// PK
	@Id
	private Long id;
	// Atributos
	private String nombre;
	private int duracion;
	public Descanso(Long id, String nombre, int duracion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
	}
	public Descanso() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
}
