package com.aulario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulario.entities.EstudianteReservarPuestoEstudio;
import com.aulario.entities.PKs.EstudianteReservarPuesto_PK;

@Repository
public interface EstudianteReservarPuestoEstudioRepository extends JpaRepository<EstudianteReservarPuestoEstudio, EstudianteReservarPuesto_PK>{

}
