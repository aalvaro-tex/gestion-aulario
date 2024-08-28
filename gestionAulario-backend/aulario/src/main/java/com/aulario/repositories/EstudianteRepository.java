package com.aulario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulario.entities.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, String>{

}
