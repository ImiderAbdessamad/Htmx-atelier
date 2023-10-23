package com.example.HtmxProjcet.dao;

import com.example.HtmxProjcet.bean.Reclamation;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.time.*;

import java.math.*;

import java.util.*;

@Repository

public interface ReclamationDao extends JpaRepository<Reclamation , Long> {

	List<Reclamation> findByContenu(String contenu);

	List<Reclamation> findByClientId(Long id);

	List<Reclamation> findByClientNom(String nom);

	List<Reclamation> findByClientPrenom(String prenom);

	int deleteByContenu(String contenu);

	int deleteByClientId(Long id);

	int deleteByClientNom(String nom);

	int deleteByClientPrenom(String prenom);

}