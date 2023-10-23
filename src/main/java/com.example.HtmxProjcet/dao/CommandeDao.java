package com.example.HtmxProjcet.dao;

import com.example.HtmxProjcet.bean.Commande;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.time.*;

import java.math.*;

import java.util.*;

@Repository

public interface CommandeDao extends JpaRepository<Commande , Long> {

	List<Commande> findByTotal(double total);

	List<Commande> findByClientId(Long id);

	List<Commande> findByClientNom(String nom);

	List<Commande> findByClientPrenom(String prenom);

	int deleteByTotal(double total);

	int deleteByClientId(Long id);

	int deleteByClientNom(String nom);

	int deleteByClientPrenom(String prenom);

}