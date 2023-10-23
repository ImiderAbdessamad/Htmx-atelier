package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Produit;
import com.example.HtmxProjcet.service.Facade.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller

public class ProduitProvided {

	@Autowired
	private ProduitService produitService;

	@GetMapping("/produit/id/{id}")
	public Produit findById(@PathVariable Long id) {
		return produitService.findById(id);
	}

	@GetMapping("/produit/code/{code}")
	public 	List<Produit> findByCode(@PathVariable String code) {
		return produitService.findByCode(code);
	}

	@GetMapping("/produit/prix/{prix}")
	public 	List<Produit> findByPrix(@PathVariable double prix) {
		return produitService.findByPrix(prix);
	}

	@GetMapping("/produit")
	public List<Produit> findAll() {
		return produitService.findAll();
	}

	@DeleteMapping("/produit/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return produitService.deleteById(id);
	}

	@DeleteMapping("/produit/code/{code}")
	public 	int deleteByCode(@PathVariable String code) {
		return produitService.deleteByCode(code);
	}

	@DeleteMapping("/produit/prix/{prix}")
	public 	int deleteByPrix(@PathVariable double prix) {
		return produitService.deleteByPrix(prix);
	}

	@PostMapping("/produit/produit")
	public Produit save(@RequestBody Produit produit) {
		return produitService.save(produit);
	}
	@GetMapping("/Poste")
	public String post() {
		return "menu";
	}
	@GetMapping("/CreateNewProduit")
	public String post2() {
		return "produit/produit";
	}
	@PostMapping("/newProduit")
	@ResponseBody
	public String create(@RequestParam("code") String code ,@RequestParam("prix") double prix ,@RequestParam("description") String description ) {
		Produit produit = new Produit(code,description,prix);

		Produit produit1 = produitService.save(produit);
		return "code : " +produit1.getCode()+ "\nprix: "+produit1.getPrix()+"\ndescription : "+produit1.getDescription() ;
	}

	@PutMapping("/produit")
	public Produit update(@RequestBody Produit produit) {
		return produitService.update(produit);
	}

}
