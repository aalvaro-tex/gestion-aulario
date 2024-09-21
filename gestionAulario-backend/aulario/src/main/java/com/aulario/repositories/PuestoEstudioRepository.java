package com.aulario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulario.entities.PuestoEstudio;
import com.aulario.entities.PKs.PuestoEstudio_PK;

public interface PuestoEstudioRepository extends JpaRepository<PuestoEstudio, Long>{

}
