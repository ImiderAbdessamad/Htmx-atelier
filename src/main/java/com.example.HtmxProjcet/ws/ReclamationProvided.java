package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Client;
import com.example.HtmxProjcet.bean.Reclamation;
import com.example.HtmxProjcet.service.Facade.ReclamationService;
import com.example.HtmxProjcet.service.Impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller

public class ReclamationProvided {

	@Autowired
	private ReclamationService reclamationService;
	@Autowired
	private ClientServiceImpl clientService;

	@GetMapping("/reclamation/id/{id}")
	public Reclamation findById(@PathVariable Long id) {
		return reclamationService.findById(id);
	}

	@GetMapping("/reclamation/contenu/{contenu}")
	public 	List<Reclamation> findByContenu(@PathVariable String contenu) {
		return reclamationService.findByContenu(contenu);
	}

	@GetMapping("/reclamation/clientId/{id}")
	public 	List<Reclamation> findByClientId(@PathVariable Long id) {
		return reclamationService.findByClientId(id);
	}

	@GetMapping("/reclamation/clientNom/{nom}")
	public 	List<Reclamation> findByClientNom(@PathVariable String nom) {
		return reclamationService.findByClientNom(nom);
	}

	@GetMapping("/reclamation/clientPrenom/{prenom}")
	public 	List<Reclamation> findByClientPrenom(@PathVariable String prenom) {
		return reclamationService.findByClientPrenom(prenom);
	}

	@GetMapping("/reclamation")
	public List<Reclamation> findAll() {
		return reclamationService.findAll();
	}

	@DeleteMapping("/reclamation/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return reclamationService.deleteById(id);
	}

	@DeleteMapping("/reclamation/contenu/{contenu}")
	public 	int deleteByContenu(@PathVariable String contenu) {
		return reclamationService.deleteByContenu(contenu);
	}

	@DeleteMapping("/reclamation/clientId/{id}")
	public 	int deleteByClientId(@PathVariable Long id) {
		return reclamationService.deleteByClientId(id);
	}

	@DeleteMapping("/clientNom/{nom}")
	public 	int deleteByClientNom(@PathVariable String nom) {
		return reclamationService.deleteByClientNom(nom);
	}

	@DeleteMapping("/reclamation/clientPrenom/{prenom}")
	public 	int deleteByClientPrenom(@PathVariable String prenom) {
		return reclamationService.deleteByClientPrenom(prenom);
	}

	@PostMapping("/reclamation")
	public Reclamation save(@RequestBody Reclamation reclamation) {
		return reclamationService.save(reclamation);
	}
	@GetMapping("/CreateNewReclamation")
	public String post() {
		return "reclamation/reclamation";
	}

	@PostMapping("/newReclamation")
	@ResponseBody
	public String create(@RequestParam("email") String email,@RequestParam("telephone") String telephone ,@RequestParam("contenu") String contenu ) {
		Client client = clientService.findByEmail(email);

		Reclamation reclamation = new Reclamation(contenu,client);

		Reclamation reclamation1 = reclamationService.save(reclamation);
		return reclamation1.getContenu();
	}

	@PutMapping("/reclamation")
	public Reclamation update(@RequestBody Reclamation reclamation) {
		return reclamationService.update(reclamation);
	}

}
