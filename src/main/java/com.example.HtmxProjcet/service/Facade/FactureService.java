package com.example.HtmxProjcet.service.Facade;

import com.example.HtmxProjcet.bean.Facture;

import java.time.*;

import java.math.*;

import java.util.*;

public interface FactureService {

	Facture findById(Long id);

	List<Facture> findByCommandeId(Long id);

	List<Facture> findByCommandeTotal(double total);

	List<Facture> findByClientId(Long id);

	List<Facture> findByClientNom(String nom);

	List<Facture> findByClientPrenom(String prenom);

	List<Facture> findByTotal(BigDecimal total);

	List<Facture> findByDateFcature(LocalDateTime dateFcature);

	List<Facture> findAll();

	 int deleteById(Long id);

	int deleteByCommandeId(Long id);

	int deleteByCommandeTotal(double total);

	int deleteByClientId(Long id);

	int deleteByClientNom(String nom);

	int deleteByClientPrenom(String prenom);

	int deleteByTotal(BigDecimal total);

	int deleteByDateFcature(LocalDateTime dateFcature);

	Facture save(Facture facture) ;

	Facture update(Facture facture);

}