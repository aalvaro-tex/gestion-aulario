package com.aulario.entities.PKs;

import java.io.Serializable;

public class EstudianteReservarPuesto_PK implements Serializable {
	
	private String nie;
	private Long num_sala;
	private Long num_puesto;
	
	public EstudianteReservarPuesto_PK(String nie, Long num_sala, Long num_puesto) {
		super();
		this.nie = nie;
		this.num_sala = num_sala;
		this.num_puesto = num_puesto;
	}

}
