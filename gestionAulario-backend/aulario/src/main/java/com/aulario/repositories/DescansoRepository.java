package com.aulario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulario.entities.Descanso;
import com.aulario.entities.Estudiante;

public interface DescansoRepository extends JpaRepository<Descanso, Long>{

}
