package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Facture;
import com.example.HtmxProjcet.service.Facade.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Controller
public class FactureProvided {

	@Autowired
	private FactureService factureService;

	@GetMapping("/facture/id/{id}")
	public Facture findById(@PathVariable Long id) {
		return factureService.findById(id);
	}

	@GetMapping("/facture/commandeId/{id}")
	public 	List<Facture> findByCommandeId(@PathVariable Long id) {
		return factureService.findByCommandeId(id);
	}

	@GetMapping("/facture/commandeTotal/{total}")
	public 	List<Facture> findByCommandeTotal(@PathVariable double total) {
		return factureService.findByCommandeTotal(total);
	}

	@GetMapping("/facture/clientId/{id}")
	public 	List<Facture> findByClientId(@PathVariable Long id) {
		return factureService.findByClientId(id);
	}

	@GetMapping("/facture/clientNom/{nom}")
	public 	List<Facture> findByClientNom(@PathVariable String nom) {
		return factureService.findByClientNom(nom);
	}

	@GetMapping("/facture/clientPrenom/{prenom}")
	public 	List<Facture> findByClientPrenom(@PathVariable String prenom) {
		return factureService.findByClientPrenom(prenom);
	}

	@GetMapping("/facture/total/{total}")
	public 	List<Facture> findByTotal(@PathVariable BigDecimal total) {
		return factureService.findByTotal(total);
	}

	@GetMapping("/facture/dateFcature/{dateFcature}")
	public 	List<Facture> findByDateFcature(@PathVariable LocalDateTime dateFcature) {
		return factureService.findByDateFcature(dateFcature);
	}

	@GetMapping("/facture")
	public List<Facture> findAll() {
		return factureService.findAll();
	}

	@DeleteMapping("/facture/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return factureService.deleteById(id);
	}

	@DeleteMapping("/facture/commandeId/{id}")
	public 	int deleteByCommandeId(@PathVariable Long id) {
		return factureService.deleteByCommandeId(id);
	}

	@DeleteMapping("/facture/commandeTotal/{total}")
	public 	int deleteByCommandeTotal(@PathVariable double total) {
		return factureService.deleteByCommandeTotal(total);
	}

	@DeleteMapping("/facture/clientId/{id}")
	public 	int deleteByClientId(@PathVariable Long id) {
		return factureService.deleteByClientId(id);
	}

	@DeleteMapping("/facture/clientNom/{nom}")
	public 	int deleteByClientNom(@PathVariable String nom) {
		return factureService.deleteByClientNom(nom);
	}

	@DeleteMapping("/facture/clientPrenom/{prenom}")
	public 	int deleteByClientPrenom(@PathVariable String prenom) {
		return factureService.deleteByClientPrenom(prenom);
	}

	@DeleteMapping("/facture/total/{total}")
	public 	int deleteByTotal(@PathVariable BigDecimal total) {
		return factureService.deleteByTotal(total);
	}

	@DeleteMapping("/facture/dateFcature/{dateFcature}")
	public 	int deleteByDateFcature(@PathVariable LocalDateTime dateFcature) {
		return factureService.deleteByDateFcature(dateFcature);
	}

	@PostMapping("/facture")
	public Facture save(@RequestBody Facture facture) {
		return factureService.save(facture);
	}

	@PutMapping("/facture")
	public Facture update(@RequestBody Facture facture) {
		return factureService.update(facture);
	}

}
