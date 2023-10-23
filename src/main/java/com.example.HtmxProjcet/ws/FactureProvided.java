package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Facture;
import com.example.HtmxProjcet.service.Facade.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.math.*;
import java.util.*;
import com.example.HtmxProjcet.bean.Commande;


import com.example.HtmxProjcet.bean.Client;


@RestController
@RequestMapping("api/v1/facture")
public class FactureProvided {

	@Autowired
	private FactureService factureService;

	@GetMapping("/id/{id}")
	public Facture findById(@PathVariable Long id) {
		return factureService.findById(id);
	}

	@GetMapping("/commandeId/{id}")
	public 	List<Facture> findByCommandeId(@PathVariable Long id) {
		return factureService.findByCommandeId(id);
	}

	@GetMapping("/commandeTotal/{total}")
	public 	List<Facture> findByCommandeTotal(@PathVariable double total) {
		return factureService.findByCommandeTotal(total);
	}

	@GetMapping("/clientId/{id}")
	public 	List<Facture> findByClientId(@PathVariable Long id) {
		return factureService.findByClientId(id);
	}

	@GetMapping("/clientNom/{nom}")
	public 	List<Facture> findByClientNom(@PathVariable String nom) {
		return factureService.findByClientNom(nom);
	}

	@GetMapping("/clientPrenom/{prenom}")
	public 	List<Facture> findByClientPrenom(@PathVariable String prenom) {
		return factureService.findByClientPrenom(prenom);
	}

	@GetMapping("/total/{total}")
	public 	List<Facture> findByTotal(@PathVariable BigDecimal total) {
		return factureService.findByTotal(total);
	}

	@GetMapping("/dateFcature/{dateFcature}")
	public 	List<Facture> findByDateFcature(@PathVariable LocalDateTime dateFcature) {
		return factureService.findByDateFcature(dateFcature);
	}

	@GetMapping("/")
	public List<Facture> findAll() {
		return factureService.findAll();
	}

	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return factureService.deleteById(id);
	}

	@DeleteMapping("/commandeId/{id}")
	public 	int deleteByCommandeId(@PathVariable Long id) {
		return factureService.deleteByCommandeId(id);
	}

	@DeleteMapping("/commandeTotal/{total}")
	public 	int deleteByCommandeTotal(@PathVariable double total) {
		return factureService.deleteByCommandeTotal(total);
	}

	@DeleteMapping("/clientId/{id}")
	public 	int deleteByClientId(@PathVariable Long id) {
		return factureService.deleteByClientId(id);
	}

	@DeleteMapping("/clientNom/{nom}")
	public 	int deleteByClientNom(@PathVariable String nom) {
		return factureService.deleteByClientNom(nom);
	}

	@DeleteMapping("/clientPrenom/{prenom}")
	public 	int deleteByClientPrenom(@PathVariable String prenom) {
		return factureService.deleteByClientPrenom(prenom);
	}

	@DeleteMapping("/total/{total}")
	public 	int deleteByTotal(@PathVariable BigDecimal total) {
		return factureService.deleteByTotal(total);
	}

	@DeleteMapping("/dateFcature/{dateFcature}")
	public 	int deleteByDateFcature(@PathVariable LocalDateTime dateFcature) {
		return factureService.deleteByDateFcature(dateFcature);
	}

	@PostMapping("/")
	public Facture save(@RequestBody Facture facture) {
		return factureService.save(facture);
	}

	@PutMapping("/")
	public Facture update(@RequestBody Facture facture) {
		return factureService.update(facture);
	}

}
