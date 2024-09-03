package com.aulario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulario.entities.EstudianteHacerDescanso;
import com.aulario.entities.PKs.EstudianteHacerDescanso_PK;

@Repository
public interface EstudianteHacerDescansoRepository extends JpaRepository<EstudianteHacerDescanso, Long>{

}
