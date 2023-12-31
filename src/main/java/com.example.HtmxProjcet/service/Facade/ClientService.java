package com.example.HtmxProjcet.service.Facade;

import com.example.HtmxProjcet.bean.Client;

import java.util.List;

public interface ClientService {

	Client findById(Long id);

	List<Client> findByNom(String nom);

	List<Client> findByPrenom(String prenom);
	Client findByEmail(String email);
	Client findByTelephone(String telephone);


	List<Client> findByCommandesId(Long id);

	List<Client> findByCommandesTotal(double total);

	List<Client> findByReclamationsId(Long id);

	List<Client> findByReclamationsContenu(String contenu);

	List<Client> findAll();

	 int deleteById(Long id);

	int deleteByNom(String nom);

	int deleteByPrenom(String prenom);

	int deleteByEmail(String email);
	int deleteByTelephone(String telephone);

	int deleteByCommandesId(Long id);

	int deleteByCommandesTotal(double total);

	int deleteByReclamationsId(Long id);

	int deleteByReclamationsContenu(String contenu);

	Client save(Client client) ;

	Client update(Client client);

}