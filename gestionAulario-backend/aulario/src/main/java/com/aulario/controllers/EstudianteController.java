package com.aulario.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulario.entities.Estudiante;
import com.aulario.services.EstudianteService;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteController {

	@Autowired
	private EstudianteService es;
	
	// recupera todos los estudiantes
	@GetMapping
	private ResponseEntity<List<Estudiante>> getAllEstudiantes(){
		return ResponseEntity.ok(es.findAll());
	}
	
	// añade un estudiante
	@PostMapping
	private ResponseEntity<Estudiante> addEstudiante(@RequestBody Estudiante e){
		try {
			e.setNombre(e.getNombre().toLowerCase());
			Estudiante e_guardado = es.save(e);
			return ResponseEntity.created(new URI("/estudiantes/"+e_guardado.getNie())).body(e_guardado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); 
		}
	}
	
	// elimina un estudiante dado su NIE
	@DeleteMapping(value="delete/{Nie}")
	private ResponseEntity<Boolean> deleteEstudiante(@PathVariable String Nie){
		es.deleteById(Nie);
		return ResponseEntity.ok(!(es.findById(Nie)!=null));
	}
}
