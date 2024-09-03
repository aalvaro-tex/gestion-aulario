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

import com.aulario.entities.Descanso;
import com.aulario.services.DescansoService;

@RestController
@RequestMapping("/descansos")
@CrossOrigin
public class DescansoController {
	
	@Autowired
	private DescansoService ds;
	
	// recupera todos los descansos
	@GetMapping
	private ResponseEntity<List<Descanso>> getAllDescansos(){
		return ResponseEntity.ok(ds.findAll());
	}
	
	// añade un descanso
	@PostMapping
	private ResponseEntity<Descanso> addDescanso(@RequestBody Descanso d){
		try {
			d.setNombre(d.getNombre().toLowerCase());
			Descanso d_guardado = ds.save(d);
			return ResponseEntity.created(new URI("/descansos/"+d_guardado.getId())).body(d_guardado);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); 
		}
	}
	
	// elimina un descanso dado su Id
	@DeleteMapping(value="delete/{Id}")
	private ResponseEntity<Boolean> deleteDescanso(@PathVariable Long Id){
		ds.deleteById(Id);
		return ResponseEntity.ok(!(ds.findById(Id)!=null));
	}

}
