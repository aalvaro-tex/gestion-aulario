package com.aulario.entities;

import com.aulario.entities.PKs.EstudianteHacerDescanso_PK;
import com.aulario.entities.PKs.PuestoEstudio_PK;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="ESTUDIANTE_HACER_DESCANSO")
@IdClass(EstudianteHacerDescanso_PK.class)
public class EstudianteHacerDescanso {

	// PK compuesta
	@Id
	private String nie;
	@Id 
	private Long id;
	// Atributos
	private String hora_entrada;
	private String hora_salida;
	public EstudianteHacerDescanso(String nie, Long id, String hora_entrada, String hora_salida) {
		super();
		this.nie = nie;
		this.id = id;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
	}
	public EstudianteHacerDescanso() {
		super();
	}
	public String getNie() {
		return nie;
	}
	public void setNie(String nie) {
		this.nie = nie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHora_entrada() {
		return hora_entrada;
	}
	public void setHora_entrada(String hora_entrada) {
		this.hora_entrada = hora_entrada;
	}
	public String getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}
	
	
	
	
}
