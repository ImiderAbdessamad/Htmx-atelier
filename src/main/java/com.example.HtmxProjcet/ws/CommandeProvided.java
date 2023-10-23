package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Commande;
import com.example.HtmxProjcet.service.Facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.math.*;
import java.util.*;
import com.example.HtmxProjcet.bean.CommandeProduit;


import com.example.HtmxProjcet.bean.Client;


@RestController
@RequestMapping("api/v1/commande")
public class CommandeProvided {

	@Autowired
	private CommandeService commandeService;

	@GetMapping("/id/{id}")
	public Commande findById(@PathVariable Long id) {
		return commandeService.findById(id);
	}

	@GetMapping("/total/{total}")
	public 	List<Commande> findByTotal(@PathVariable double total) {
		return commandeService.findByTotal(total);
	}

	@GetMapping("/clientId/{id}")
	public 	List<Commande> findByClientId(@PathVariable Long id) {
		return commandeService.findByClientId(id);
	}

	@GetMapping("/clientNom/{nom}")
	public 	List<Commande> findByClientNom(@PathVariable String nom) {
		return commandeService.findByClientNom(nom);
	}

	@GetMapping("/clientPrenom/{prenom}")
	public 	List<Commande> findByClientPrenom(@PathVariable String prenom) {
		return commandeService.findByClientPrenom(prenom);
	}

	@GetMapping("/")
	public List<Commande> findAll() {
		return commandeService.findAll();
	}

	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return commandeService.deleteById(id);
	}

	@DeleteMapping("/total/{total}")
	public 	int deleteByTotal(@PathVariable double total) {
		return commandeService.deleteByTotal(total);
	}

	@DeleteMapping("/clientId/{id}")
	public 	int deleteByClientId(@PathVariable Long id) {
		return commandeService.deleteByClientId(id);
	}

	@DeleteMapping("/clientNom/{nom}")
	public 	int deleteByClientNom(@PathVariable String nom) {
		return commandeService.deleteByClientNom(nom);
	}

	@DeleteMapping("/clientPrenom/{prenom}")
	public 	int deleteByClientPrenom(@PathVariable String prenom) {
		return commandeService.deleteByClientPrenom(prenom);
	}

	@PostMapping("/")
	public Commande save(@RequestBody Commande commande) {
		return commandeService.save(commande);
	}

	@PutMapping("/")
	public Commande update(@RequestBody Commande commande) {
		return commandeService.update(commande);
	}

}
