package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Commande;
import com.example.HtmxProjcet.service.Facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class CommandeProvided {

	@Autowired
	private CommandeService commandeService;

	@GetMapping("/commande/id/{id}")
	public Commande findById(@PathVariable Long id) {
		return commandeService.findById(id);
	}

	@GetMapping("/commande/total/{total}")
	public 	List<Commande> findByTotal(@PathVariable double total) {
		return commandeService.findByTotal(total);
	}

	@GetMapping("/commande/clientId/{id}")
	public 	List<Commande> findByClientId(@PathVariable Long id) {
		return commandeService.findByClientId(id);
	}

	@GetMapping("/commande/clientNom/{nom}")
	public 	List<Commande> findByClientNom(@PathVariable String nom) {
		return commandeService.findByClientNom(nom);
	}

	@GetMapping("/commande/clientPrenom/{prenom}")
	public 	List<Commande> findByClientPrenom(@PathVariable String prenom) {
		return commandeService.findByClientPrenom(prenom);
	}

	@GetMapping("/commande")
	public List<Commande> findAll() {
		return commandeService.findAll();
	}

	@DeleteMapping("/commande/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return commandeService.deleteById(id);
	}

	@DeleteMapping("/commande/total/{total}")
	public 	int deleteByTotal(@PathVariable double total) {
		return commandeService.deleteByTotal(total);
	}

	@DeleteMapping("/commande/clientId/{id}")
	public 	int deleteByClientId(@PathVariable Long id) {
		return commandeService.deleteByClientId(id);
	}

	@DeleteMapping("/commande/clientNom/{nom}")
	public 	int deleteByClientNom(@PathVariable String nom) {
		return commandeService.deleteByClientNom(nom);
	}

	@DeleteMapping("/commande/clientPrenom/{prenom}")
	public 	int deleteByClientPrenom(@PathVariable String prenom) {
		return commandeService.deleteByClientPrenom(prenom);
	}

	@PostMapping("/commande")
	public Commande save(@RequestBody Commande commande) {
		return commandeService.save(commande);
	}

	@PutMapping("/commande")
	public Commande update(@RequestBody Commande commande) {
		return commandeService.update(commande);
	}

}
