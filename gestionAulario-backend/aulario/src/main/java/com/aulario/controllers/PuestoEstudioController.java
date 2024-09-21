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

import com.aulario.entities.PuestoEstudio;
import com.aulario.entities.PKs.PuestoEstudio_PK;
import com.aulario.services.PuestoEstudioService;

@RestController
@RequestMapping("/puestos-estudio")
@CrossOrigin
public class PuestoEstudioController {

	@Autowired
	private PuestoEstudioService pes;
	
	// recupera todos los puestos de estudios
	@GetMapping
	private ResponseEntity<List<PuestoEstudio>> getAllPuestosEstudio(){
		return ResponseEntity.ok(pes.findAll());
	}
	
	// recupera los puestos dada una sala
	@GetMapping("/find-by-sala/{sala}")
	private ResponseEntity<List<PuestoEstudio>> getPuestosBySala(@PathVariable int sala){
		return ResponseEntity.ok(pes.getPuestosBySala(sala));
	}
	
	// añade un puesto de estudio
	@PostMapping
	private ResponseEntity<PuestoEstudio> addPuestoEstudio(@RequestBody PuestoEstudio pe){
		try {
			PuestoEstudio pe_guardado = pes.save(pe);
			return ResponseEntity.created(new URI("/puestos-estudio/"+pe_guardado.getNum_sala()+":"+pe_guardado.getNum_puesto())).body(pe_guardado);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); 
		}
	}
	
	// elimina un puesto de estudio 
	@DeleteMapping(value="delete/{pk}")
	private ResponseEntity<Boolean> deletePuestoEstudio(@PathVariable Long pk){
		pes.deleteById(pk);
		return ResponseEntity.ok(!(pes.findById(pk)!=null));
	}
	
	
}
