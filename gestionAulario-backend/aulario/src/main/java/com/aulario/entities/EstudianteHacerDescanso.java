package com.aulario.entities;

import com.aulario.entities.PKs.EstudianteHacerDescanso_PK;
import com.aulario.entities.PKs.PuestoEstudio_PK;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="ESTUDIANTE_HACER_DESCANSO")
public class EstudianteHacerDescanso {

	// PK 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// Atributos
	private String hora_entrada;
	private String hora_salida;
	private String nie;
	private Long id_descanso;

	public EstudianteHacerDescanso(Long id, String hora_entrada, String hora_salida, String nie, Long id_descanso) {
		super();
		this.id = id;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
		this.nie = nie;
		this.id_descanso = id_descanso;
	}

	public EstudianteHacerDescanso() {
		super();
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

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public Long getId_descanso() {
		return id_descanso;
	}

	public void setId_descanso(Long id_descanso) {
		this.id_descanso = id_descanso;
	}
	
	
	
	
	
}
