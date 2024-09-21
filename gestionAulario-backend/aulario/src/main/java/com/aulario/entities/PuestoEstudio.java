package com.aulario.entities;

import com.aulario.entities.PKs.PuestoEstudio_PK;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="PUESTO_ESTUDIO")
public class PuestoEstudio {

	// PK 
	@Id
	private Long id;
	// Atributos
	private Long num_puesto;
	private Long num_sala;
	private boolean tiene_enchufe;
	private boolean tiene_ventana;
	public PuestoEstudio(Long num_puesto, Long num_sala, boolean tiene_enchufe, boolean tiene_ventana) {
		super();
		this.num_puesto = num_puesto;
		this.num_sala = num_sala;
		this.tiene_enchufe = tiene_enchufe;
		this.tiene_ventana = tiene_ventana;
	}
	public PuestoEstudio() {
		super();
	}
	public Long getNum_puesto() {
		return num_puesto;
	}
	public void setNum_puesto(Long num_puesto) {
		this.num_puesto = num_puesto;
	}
	public Long getNum_sala() {
		return num_sala;
	}
	public void setNum_sala(Long num_sala) {
		this.num_sala = num_sala;
	}
	public boolean isTiene_enchufe() {
		return tiene_enchufe;
	}
	public void setTiene_enchufe(boolean tiene_enchufe) {
		this.tiene_enchufe = tiene_enchufe;
	}
	public boolean isTiene_ventana() {
		return tiene_ventana;
	}
	public void setTiene_ventana(boolean tiene_ventana) {
		this.tiene_ventana = tiene_ventana;
	}
	
}
