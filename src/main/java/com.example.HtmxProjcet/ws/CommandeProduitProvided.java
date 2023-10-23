package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.CommandeProduit;
import com.example.HtmxProjcet.service.Facade.CommandeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class CommandeProduitProvided {

	@Autowired
	private CommandeProduitService commandeProduitService;

	@GetMapping("/commandeProduit/id/{id}")
	public CommandeProduit findById(@PathVariable Long id) {
		return commandeProduitService.findById(id);
	}

	@GetMapping("/commandeProduit/commandeId/{id}")
	public 	List<CommandeProduit> findByCommandeId(@PathVariable Long id) {
		return commandeProduitService.findByCommandeId(id);
	}

	@GetMapping("/commandeProduit/commandeTotal/{total}")
	public 	List<CommandeProduit> findByCommandeTotal(@PathVariable double total) {
		return commandeProduitService.findByCommandeTotal(total);
	}

	@GetMapping("/commandeProduit/produitId/{id}")
	public 	List<CommandeProduit> findByProduitId(@PathVariable Long id) {
		return commandeProduitService.findByProduitId(id);
	}

	@GetMapping("/commandeProduit/produitCode/{code}")
	public 	List<CommandeProduit> findByProduitCode(@PathVariable String code) {
		return commandeProduitService.findByProduitCode(code);
	}

	@GetMapping("/commandeProduit/produitPrix/{prix}")
	public 	List<CommandeProduit> findByProduitPrix(@PathVariable double prix) {
		return commandeProduitService.findByProduitPrix(prix);
	}

	@GetMapping("/commandeProduit")
	public List<CommandeProduit> findAll() {
		return commandeProduitService.findAll();
	}

	@DeleteMapping("/commandeProduit/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return commandeProduitService.deleteById(id);
	}

	@DeleteMapping("/commandeProduit/commandeId/{id}")
	public 	int deleteByCommandeId(@PathVariable Long id) {
		return commandeProduitService.deleteByCommandeId(id);
	}

	@DeleteMapping("/commandeProduit/commandeTotal/{total}")
	public 	int deleteByCommandeTotal(@PathVariable double total) {
		return commandeProduitService.deleteByCommandeTotal(total);
	}

	@DeleteMapping("/commandeProduit/produitId/{id}")
	public 	int deleteByProduitId(@PathVariable Long id) {
		return commandeProduitService.deleteByProduitId(id);
	}

	@DeleteMapping("/commandeProduit/produitCode/{code}")
	public 	int deleteByProduitCode(@PathVariable String code) {
		return commandeProduitService.deleteByProduitCode(code);
	}

	@DeleteMapping("/commandeProduit/produitPrix/{prix}")
	public 	int deleteByProduitPrix(@PathVariable double prix) {
		return commandeProduitService.deleteByProduitPrix(prix);
	}

	@PostMapping("/commandeProduit")
	public CommandeProduit save(@RequestBody CommandeProduit commandeProduit) {
		return commandeProduitService.save(commandeProduit);
	}

	@PutMapping("/commandeProduit")
	public CommandeProduit update(@RequestBody CommandeProduit commandeProduit) {
		return commandeProduitService.update(commandeProduit);
	}

}
