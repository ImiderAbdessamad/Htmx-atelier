package com.example.HtmxProjcet.dao;

import com.example.HtmxProjcet.bean.CommandeProduit;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.time.*;

import java.math.*;

import java.util.*;

@Repository

public interface CommandeProduitDao extends JpaRepository<CommandeProduit , Long> {

	List<CommandeProduit> findByCommandeId(Long id);

	List<CommandeProduit> findByCommandeTotal(double total);

	List<CommandeProduit> findByProduitId(Long id);

	List<CommandeProduit> findByProduitCode(String code);

	List<CommandeProduit> findByProduitPrix(double prix);

	int deleteByCommandeId(Long id);

	int deleteByCommandeTotal(double total);

	int deleteByProduitId(Long id);

	int deleteByProduitCode(String code);

	int deleteByProduitPrix(double prix);

}