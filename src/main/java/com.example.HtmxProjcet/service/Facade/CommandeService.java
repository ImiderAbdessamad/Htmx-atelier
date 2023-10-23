package com.example.HtmxProjcet.service.Facade;

import com.example.HtmxProjcet.bean.Commande;

import java.time.*;

import java.math.*;

import java.util.*;

public interface CommandeService {

	Commande findById(Long id);

	List<Commande> findByTotal(double total);

	List<Commande> findByClientId(Long id);

	List<Commande> findByClientNom(String nom);

	List<Commande> findByClientPrenom(String prenom);

	List<Commande> findAll();

	 int deleteById(Long id);

	int deleteByTotal(double total);

	int deleteByClientId(Long id);

	int deleteByClientNom(String nom);

	int deleteByClientPrenom(String prenom);

	Commande save(Commande commande) ;

	Commande update(Commande commande);

}