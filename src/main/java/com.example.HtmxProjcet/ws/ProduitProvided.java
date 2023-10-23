package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Produit;
import com.example.HtmxProjcet.service.Facade.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.math.*;
import java.util.*;
import com.example.HtmxProjcet.bean.CommandeProduit;


@RestController
@RequestMapping("api/v1/produit")
public class ProduitProvided {

	@Autowired
	private ProduitService produitService;

	@GetMapping("/id/{id}")
	public Produit findById(@PathVariable Long id) {
		return produitService.findById(id);
	}

	@GetMapping("/code/{code}")
	public 	List<Produit> findByCode(@PathVariable String code) {
		return produitService.findByCode(code);
	}

	@GetMapping("/prix/{prix}")
	public 	List<Produit> findByPrix(@PathVariable double prix) {
		return produitService.findByPrix(prix);
	}

	@GetMapping("/")
	public List<Produit> findAll() {
		return produitService.findAll();
	}

	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return produitService.deleteById(id);
	}

	@DeleteMapping("/code/{code}")
	public 	int deleteByCode(@PathVariable String code) {
		return produitService.deleteByCode(code);
	}

	@DeleteMapping("/prix/{prix}")
	public 	int deleteByPrix(@PathVariable double prix) {
		return produitService.deleteByPrix(prix);
	}

	@PostMapping("/")
	public Produit save(@RequestBody Produit produit) {
		return produitService.save(produit);
	}

	@PutMapping("/")
	public Produit update(@RequestBody Produit produit) {
		return produitService.update(produit);
	}

}
