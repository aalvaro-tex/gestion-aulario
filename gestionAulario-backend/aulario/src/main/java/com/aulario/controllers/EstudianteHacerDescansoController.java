package com.aulario.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulario.entities.EstudianteHacerDescanso;
import com.aulario.services.EstudianteHacerDescansoService;

@RestController
@RequestMapping("/estudiante-hacer-descanso")
@CrossOrigin
public class EstudianteHacerDescansoController {

	private Logger log = Logger.getLogger(EstudianteHacerDescansoService.class.getName());
	
	@Autowired
	private EstudianteHacerDescansoService ehds;

	// añade un descanso para un estudiante
	@PostMapping
	private ResponseEntity<EstudianteHacerDescanso> addDescansoParaEstudiante(@RequestBody EstudianteHacerDescanso ehd) {
		try {
			EstudianteHacerDescanso ehd_guardado = ehds.save(ehd);
			return ResponseEntity.created(new URI("/estudiante-hacer-descanso/" + ehd_guardado.getNie()))
					.body(ehd_guardado);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	// recupera el descanaso (si existe) que aún no ha finalizado (hora entrada null)
	// recibe el nie del estudiante a buscar
	@GetMapping("/{nie}")
	private List<EstudianteHacerDescanso> getDescansoSinFinalizar(@PathVariable("nie") String nie){
		List<EstudianteHacerDescanso> all = ehds.findDescansosByNie(nie);
		List<EstudianteHacerDescanso> byNie = new ArrayList<EstudianteHacerDescanso>();
		if(all != null) {
		int index;
		for(index = 0; index < all.size(); index++) {
			System.out.print(all.get(index).getHora_entrada());
			if(all.get(index).getHora_entrada() == null) {
				log.info("El estudiante con NIE " + nie + " tiene un descanso sin terminar");
				all.get(index).setHora_entrada("Sin terminar");
				byNie.add(all.get(index));
				break;
			} 
			log.info(all.get(index).toString());
		}return byNie;
		}
		else return null;
	
	}
	
	@PutMapping("/update/{id}")
	private ResponseEntity<EstudianteHacerDescanso> updateHoraEntrada(@PathVariable Long id, @RequestBody String hora_entrada) {
			EstudianteHacerDescanso ehd_toUpdate = ehds.findById(id).
					orElseThrow();
			ehd_toUpdate.setHora_entrada(hora_entrada);
			log.info("Hora de entrada registrada: " + ehd_toUpdate.getHora_entrada());
			ehds.save(ehd_toUpdate);
			return ResponseEntity.ok(ehd_toUpdate);
		}
	
}
