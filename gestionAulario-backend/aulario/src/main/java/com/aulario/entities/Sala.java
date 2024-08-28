package com.aulario.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SALA")
public class Sala {

	//PK
	@Id
	private Long num_sala;
	//Atributos
	private int puestos_totales;
	public Sala(Long num_sala, int puestos_totales) {
		super();
		this.num_sala = num_sala;
		this.puestos_totales = puestos_totales;
	}
	public Sala() {
		super();
	}
	public Long getNum_sala() {
		return num_sala;
	}
	public void setNum_sala(Long num_sala) {
		this.num_sala = num_sala;
	}
	public int getPuestos_totales() {
		return puestos_totales;
	}
	public void setPuestos_totales(int puestos_totales) {
		this.puestos_totales = puestos_totales;
	}
	
}
