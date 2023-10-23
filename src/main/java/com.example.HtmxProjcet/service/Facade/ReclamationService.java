package com.example.HtmxProjcet.service.Facade;

import com.example.HtmxProjcet.bean.Reclamation;

import java.util.List;

public interface ReclamationService {

	Reclamation findById(Long id);

	List<Reclamation> findByContenu(String contenu);

	List<Reclamation> findByClientId(Long id);

	List<Reclamation> findByClientNom(String nom);

	List<Reclamation> findByClientPrenom(String prenom);

	List<Reclamation> findAll();

	 int deleteById(Long id);

	int deleteByContenu(String contenu);

	int deleteByClientId(Long id);

	int deleteByClientNom(String nom);

	int deleteByClientPrenom(String prenom);

	Reclamation save(Reclamation reclamation) ;

	Reclamation update(Reclamation reclamation);

}