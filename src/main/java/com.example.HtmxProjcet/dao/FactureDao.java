package com.example.HtmxProjcet.dao;

import com.example.HtmxProjcet.bean.Facture;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.time.*;

import java.math.*;

import java.util.*;

@Repository

public interface FactureDao extends JpaRepository<Facture , Long> {

	List<Facture> findByCommandeId(Long id);

	List<Facture> findByCommandeTotal(double total);

	List<Facture> findByClientId(Long id);

	List<Facture> findByClientNom(String nom);

	List<Facture> findByClientPrenom(String prenom);

	List<Facture> findByTotal(BigDecimal total);

	List<Facture> findByDateFcature(LocalDateTime dateFcature);

	int deleteByCommandeId(Long id);

	int deleteByCommandeTotal(double total);

	int deleteByClientId(Long id);

	int deleteByClientNom(String nom);

	int deleteByClientPrenom(String prenom);

	int deleteByTotal(BigDecimal total);

	int deleteByDateFcature(LocalDateTime dateFcature);

}