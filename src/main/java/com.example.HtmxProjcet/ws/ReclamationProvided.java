package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Reclamation;
import com.example.HtmxProjcet.service.Facade.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.math.*;
import java.util.*;
import com.example.HtmxProjcet.bean.Client;


@RestController
@RequestMapping("api/v1/reclamation")
public class ReclamationProvided {

	@Autowired
	private ReclamationService reclamationService;

	@GetMapping("/id/{id}")
	public Reclamation findById(@PathVariable Long id) {
		return reclamationService.findById(id);
	}

	@GetMapping("/contenu/{contenu}")
	public 	List<Reclamation> findByContenu(@PathVariable String contenu) {
		return reclamationService.findByContenu(contenu);
	}

	@GetMapping("/clientId/{id}")
	public 	List<Reclamation> findByClientId(@PathVariable Long id) {
		return reclamationService.findByClientId(id);
	}

	@GetMapping("/clientNom/{nom}")
	public 	List<Reclamation> findByClientNom(@PathVariable String nom) {
		return reclamationService.findByClientNom(nom);
	}

	@GetMapping("/clientPrenom/{prenom}")
	public 	List<Reclamation> findByClientPrenom(@PathVariable String prenom) {
		return reclamationService.findByClientPrenom(prenom);
	}

	@GetMapping("/")
	public List<Reclamation> findAll() {
		return reclamationService.findAll();
	}

	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return reclamationService.deleteById(id);
	}

	@DeleteMapping("/contenu/{contenu}")
	public 	int deleteByContenu(@PathVariable String contenu) {
		return reclamationService.deleteByContenu(contenu);
	}

	@DeleteMapping("/clientId/{id}")
	public 	int deleteByClientId(@PathVariable Long id) {
		return reclamationService.deleteByClientId(id);
	}

	@DeleteMapping("/clientNom/{nom}")
	public 	int deleteByClientNom(@PathVariable String nom) {
		return reclamationService.deleteByClientNom(nom);
	}

	@DeleteMapping("/clientPrenom/{prenom}")
	public 	int deleteByClientPrenom(@PathVariable String prenom) {
		return reclamationService.deleteByClientPrenom(prenom);
	}

	@PostMapping("/")
	public Reclamation save(@RequestBody Reclamation reclamation) {
		return reclamationService.save(reclamation);
	}

	@PutMapping("/")
	public Reclamation update(@RequestBody Reclamation reclamation) {
		return reclamationService.update(reclamation);
	}

}
