package com.example.HtmxProjcet.dao;

import com.example.HtmxProjcet.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ClientDao extends JpaRepository<Client , Long> {

	List<Client> findByNom(String nom);

	List<Client> findByPrenom(String prenom);
	Client findByEmail(String email);
	Client findByTelephone(String telephone);


	List<Client> findByCommandesId(Long id);

	List<Client> findByCommandesTotal(double total);

	List<Client> findByReclamationsId(Long id);

	List<Client> findByReclamationsContenu(String contenu);

	int deleteByNom(String nom);

	int deleteByPrenom(String prenom);
	int deleteByEmail(String email);
	int deleteByTelephone(String telephone);

	int deleteByCommandesId(Long id);

	int deleteByCommandesTotal(double total);

	int deleteByReclamationsId(Long id);

	int deleteByReclamationsContenu(String contenu);

}