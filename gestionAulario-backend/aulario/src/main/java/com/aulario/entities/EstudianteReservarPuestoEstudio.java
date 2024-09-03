package com.aulario.entities;
import com.aulario.entities.PKs.EstudianteReservarPuesto_PK;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="ESTUDIANTE_RESERVAR_PUESTO_ESTUDIO")
@IdClass(EstudianteReservarPuesto_PK.class)
public class EstudianteReservarPuestoEstudio {
	
	// PK compuesta
	@Id
	private String nie;
	@Id
	private Long num_sala;
	@Id
	private Long num_puesto;
	// Atributos
	private String dia;
	public EstudianteReservarPuestoEstudio(String nie, Long num_sala, Long num_puesto, String dia) {
		super();
		this.nie = nie;
		this.num_sala = num_sala;
		this.num_puesto = num_puesto;
		this.dia = dia;
	}
	public EstudianteReservarPuestoEstudio() {
		super();
	}
	public String getNie() {
		return nie;
	}
	public void setNie(String nie) {
		this.nie = nie;
	}
	public Long getNum_sala() {
		return num_sala;
	}
	public void setNum_sala(Long num_sala) {
		this.num_sala = num_sala;
	}
	public Long getNum_puesto() {
		return num_puesto;
	}
	public void setNum_puesto(Long num_puesto) {
		this.num_puesto = num_puesto;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	

}
