package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.CommandeProduit;
import com.example.HtmxProjcet.service.Facade.CommandeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.math.*;
import java.util.*;
import com.example.HtmxProjcet.bean.Commande;


import com.example.HtmxProjcet.bean.Produit;


@RestController
@RequestMapping("api/v1/commandeProduit")
public class CommandeProduitProvided {

	@Autowired
	private CommandeProduitService commandeProduitService;

	@GetMapping("/id/{id}")
	public CommandeProduit findById(@PathVariable Long id) {
		return commandeProduitService.findById(id);
	}

	@GetMapping("/commandeId/{id}")
	public 	List<CommandeProduit> findByCommandeId(@PathVariable Long id) {
		return commandeProduitService.findByCommandeId(id);
	}

	@GetMapping("/commandeTotal/{total}")
	public 	List<CommandeProduit> findByCommandeTotal(@PathVariable double total) {
		return commandeProduitService.findByCommandeTotal(total);
	}

	@GetMapping("/produitId/{id}")
	public 	List<CommandeProduit> findByProduitId(@PathVariable Long id) {
		return commandeProduitService.findByProduitId(id);
	}

	@GetMapping("/produitCode/{code}")
	public 	List<CommandeProduit> findByProduitCode(@PathVariable String code) {
		return commandeProduitService.findByProduitCode(code);
	}

	@GetMapping("/produitPrix/{prix}")
	public 	List<CommandeProduit> findByProduitPrix(@PathVariable double prix) {
		return commandeProduitService.findByProduitPrix(prix);
	}

	@GetMapping("/")
	public List<CommandeProduit> findAll() {
		return commandeProduitService.findAll();
	}

	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return commandeProduitService.deleteById(id);
	}

	@DeleteMapping("/commandeId/{id}")
	public 	int deleteByCommandeId(@PathVariable Long id) {
		return commandeProduitService.deleteByCommandeId(id);
	}

	@DeleteMapping("/commandeTotal/{total}")
	public 	int deleteByCommandeTotal(@PathVariable double total) {
		return commandeProduitService.deleteByCommandeTotal(total);
	}

	@DeleteMapping("/produitId/{id}")
	public 	int deleteByProduitId(@PathVariable Long id) {
		return commandeProduitService.deleteByProduitId(id);
	}

	@DeleteMapping("/produitCode/{code}")
	public 	int deleteByProduitCode(@PathVariable String code) {
		return commandeProduitService.deleteByProduitCode(code);
	}

	@DeleteMapping("/produitPrix/{prix}")
	public 	int deleteByProduitPrix(@PathVariable double prix) {
		return commandeProduitService.deleteByProduitPrix(prix);
	}

	@PostMapping("/")
	public CommandeProduit save(@RequestBody CommandeProduit commandeProduit) {
		return commandeProduitService.save(commandeProduit);
	}

	@PutMapping("/")
	public CommandeProduit update(@RequestBody CommandeProduit commandeProduit) {
		return commandeProduitService.update(commandeProduit);
	}

}
