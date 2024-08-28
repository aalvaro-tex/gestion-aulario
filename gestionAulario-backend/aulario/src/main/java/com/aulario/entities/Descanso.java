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
	private String tramo;
	private String dia;
	public Descanso(Long id, String tramo, String dia) {
		super();
		this.id = id;
		this.tramo = tramo;
		this.dia = dia;
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
	public String getTramo() {
		return tramo;
	}
	public void setTramo(String tramo) {
		this.tramo = tramo;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	
}
