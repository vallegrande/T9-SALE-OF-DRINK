package com.saleofdrink.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

import com.saleofdrink.model.Persona;
import com.saleofdrink.service.PersonaService;

/*@CrossOrigin(origins = "http://localhost:58018")*/

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/persona/")
public class PersonaRest {

	@Autowired
	private PersonaService personaService;

	/* METODO LISTAR */
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersona(Pageable pageable) {
		return ResponseEntity.ok(personaService.findAllByEstper("activo", pageable).getContent());
	}

	/* METODO GUARDAR */
	@PostMapping
	private ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
		try {
			Persona personaGuardada = personaService.save(persona);
			return ResponseEntity.created(new URI("/persona/" + personaGuardada.getIdper())).body(personaGuardada);
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}

	/* METODO ELIMINAR */
	@DeleteMapping(value = "delete/{idPer}")
	private ResponseEntity<Boolean> deletePersona(@PathVariable("idPer") Long idper) {
		personaService.deleteById(idper);
		return ResponseEntity.ok(!(personaService.findById(idper) != null));
	}

}
