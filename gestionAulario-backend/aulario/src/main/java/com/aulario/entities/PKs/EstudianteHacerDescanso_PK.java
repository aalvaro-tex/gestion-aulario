package com.aulario.entities.PKs;

import java.io.Serializable;

public class EstudianteHacerDescanso_PK implements Serializable {
	
	private String nie;
	private Long id;
	public EstudianteHacerDescanso_PK(String nie, Long id) {
		super();
		this.nie = nie;
		this.id = id;
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
	
	

}
