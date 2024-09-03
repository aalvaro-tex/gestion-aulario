package com.aulario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulario.entities.Descanso;
import com.aulario.entities.Estudiante;

@Repository
public interface DescansoRepository extends JpaRepository<Descanso, Long>{

}
