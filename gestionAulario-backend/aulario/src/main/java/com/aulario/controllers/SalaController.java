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

import com.aulario.entities.Sala;
import com.aulario.services.SalaService;

@RestController
@RequestMapping("/salas")
@CrossOrigin
public class SalaController {

	@Autowired
	private SalaService ss;
	
	// recupera todas las salas
	@GetMapping
	private ResponseEntity<List<Sala>> getAllSalas(){
		return ResponseEntity.ok(ss.findAll());
	}
	
	// añade una sala
	@PostMapping
	private ResponseEntity<Sala> addSala(@RequestBody Sala s){
		try {
			Sala s_guardado = ss.save(s);
			return ResponseEntity.created(new URI("/salas/"+s_guardado.getNum_sala())).body(s_guardado);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); 
		}
	}
	
	// elimina una sala dado su numero de sala
	@DeleteMapping(value="delete/{numSala}")
	private ResponseEntity<Boolean> deleteSala(@PathVariable Long numSala){
		ss.deleteById(numSala);
		return ResponseEntity.ok(!(ss.findById(numSala)!=null));
	}
}
