package com.example.HtmxProjcet.ws;

import com.example.HtmxProjcet.bean.Client;
import com.example.HtmxProjcet.service.Facade.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller

public class ClientProvided {

	@Autowired
	private ClientService clientService;

	@GetMapping("/client/id/{id}")
	public Client findById(@PathVariable Long id) {
		return clientService.findById(id);
	}

	@GetMapping("/client/nom/{nom}")
	public 	List<Client> findByNom(@PathVariable String nom) {
		return clientService.findByNom(nom);
	}

	@GetMapping("/client/prenom/{prenom}")
	public 	List<Client> findByPrenom(@PathVariable String prenom) {
		return clientService.findByPrenom(prenom);
	}

	@GetMapping("/client/email/{email}")
	public 	Client findByEmail(@PathVariable String email) {
		return clientService.findByEmail(email);
	}
	@GetMapping("/client/telephone/{telephone}")
	public 	Client findByTelephone(@PathVariable String telephone) {
		return clientService.findByTelephone(telephone);
	}

	@GetMapping("/client/commandesId/{id}")
	public 	List<Client> findByCommandesId(@PathVariable Long id) {
		return clientService.findByCommandesId(id);
	}

	@GetMapping("/client/commandesTotal/{total}")
	public 	List<Client> findByCommandesTotal(@PathVariable double total) {
		return clientService.findByCommandesTotal(total);
	}

	@GetMapping("/client/reclamationsId/{id}")
	public 	List<Client> findByReclamationsId(@PathVariable Long id) {
		return clientService.findByReclamationsId(id);
	}

	@GetMapping("/client/reclamationsContenu/{contenu}")
	public 	List<Client> findByReclamationsContenu(@PathVariable String contenu) {
		return clientService.findByReclamationsContenu(contenu);
	}

	@GetMapping("/client")
	public List<Client> findAll() {
		return clientService.findAll();
	}

	@DeleteMapping("/client/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return clientService.deleteById(id);
	}

	@DeleteMapping("/client/nom/{nom}")
	public 	int deleteByNom(@PathVariable String nom) {
		return clientService.deleteByNom(nom);
	}

	@DeleteMapping("/client/prenom/{prenom}")
	public 	int deleteByPrenom(@PathVariable String prenom) {
		return clientService.deleteByPrenom(prenom);
	}
	@DeleteMapping("/client/email/{email}")
	public int deleteByEmail(@PathVariable String email) {
		return clientService.deleteByEmail(email);
	}
	@DeleteMapping("/client/telephone/{telephone}")
	public int deleteByTelephone(@PathVariable String telephone) {
		return clientService.deleteByTelephone(telephone);
	}
	@DeleteMapping("/client/commandesId/{id}")
	public 	int deleteByCommandesId(@PathVariable Long id) {
		return clientService.deleteByCommandesId(id);
	}

	@DeleteMapping("/client/commandesTotal/{total}")
	public 	int deleteByCommandesTotal(@PathVariable double total) {
		return clientService.deleteByCommandesTotal(total);
	}

	@DeleteMapping("/client/reclamationsId/{id}")
	public 	int deleteByReclamationsId(@PathVariable Long id) {
		return clientService.deleteByReclamationsId(id);
	}

	@DeleteMapping("/client/reclamationsContenu/{contenu}")
	public 	int deleteByReclamationsContenu(@PathVariable String contenu) {
		return clientService.deleteByReclamationsContenu(contenu);
	}

	@PostMapping("/client")
	public Client save(@RequestBody Client client) {
		return clientService.save(client);
	}
	@GetMapping("/CreateNewClient")
	public String post() {
		return "client/client";
	}
	@PostMapping("/newClient")
	@ResponseBody
	public String create(@RequestParam("email") String email,@RequestParam("telephone") String telephone ,@RequestParam("password") String password ,@RequestParam("nom") String nom ,@RequestParam("prenom") String prenom) {


		Client client= new Client(nom,prenom,password,email,telephone);

		Client client1 = clientService.save(client);
		return client1.getEmail()+"\n"+client1.getPrenom()+"\n"+client1.getNom() ;
	}

	@PutMapping("/client")
	public Client update(@RequestBody Client client) {
		return clientService.update(client);
	}

}
