package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Client;
import com.example.HtmxProjcet.service.Facade.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.math.*;
import java.util.*;
import com.example.HtmxProjcet.bean.Commande;


import com.example.HtmxProjcet.bean.Reclamation;


@RestController
@RequestMapping("api/v1/client")
public class ClientProvided {

	@Autowired
	private ClientService clientService;

	@GetMapping("/id/{id}")
	public Client findById(@PathVariable Long id) {
		return clientService.findById(id);
	}

	@GetMapping("/nom/{nom}")
	public 	List<Client> findByNom(@PathVariable String nom) {
		return clientService.findByNom(nom);
	}

	@GetMapping("/prenom/{prenom}")
	public 	List<Client> findByPrenom(@PathVariable String prenom) {
		return clientService.findByPrenom(prenom);
	}

	@GetMapping("/commandesId/{id}")
	public 	List<Client> findByCommandesId(@PathVariable Long id) {
		return clientService.findByCommandesId(id);
	}

	@GetMapping("/commandesTotal/{total}")
	public 	List<Client> findByCommandesTotal(@PathVariable double total) {
		return clientService.findByCommandesTotal(total);
	}

	@GetMapping("/reclamationsId/{id}")
	public 	List<Client> findByReclamationsId(@PathVariable Long id) {
		return clientService.findByReclamationsId(id);
	}

	@GetMapping("/reclamationsContenu/{contenu}")
	public 	List<Client> findByReclamationsContenu(@PathVariable String contenu) {
		return clientService.findByReclamationsContenu(contenu);
	}

	@GetMapping("/")
	public List<Client> findAll() {
		return clientService.findAll();
	}

	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return clientService.deleteById(id);
	}

	@DeleteMapping("/nom/{nom}")
	public 	int deleteByNom(@PathVariable String nom) {
		return clientService.deleteByNom(nom);
	}

	@DeleteMapping("/prenom/{prenom}")
	public 	int deleteByPrenom(@PathVariable String prenom) {
		return clientService.deleteByPrenom(prenom);
	}

	@DeleteMapping("/commandesId/{id}")
	public 	int deleteByCommandesId(@PathVariable Long id) {
		return clientService.deleteByCommandesId(id);
	}

	@DeleteMapping("/commandesTotal/{total}")
	public 	int deleteByCommandesTotal(@PathVariable double total) {
		return clientService.deleteByCommandesTotal(total);
	}

	@DeleteMapping("/reclamationsId/{id}")
	public 	int deleteByReclamationsId(@PathVariable Long id) {
		return clientService.deleteByReclamationsId(id);
	}

	@DeleteMapping("/reclamationsContenu/{contenu}")
	public 	int deleteByReclamationsContenu(@PathVariable String contenu) {
		return clientService.deleteByReclamationsContenu(contenu);
	}

	@PostMapping("/")
	public Client save(@RequestBody Client client) {
		return clientService.save(client);
	}

	@PutMapping("/")
	public Client update(@RequestBody Client client) {
		return clientService.update(client);
	}

}
