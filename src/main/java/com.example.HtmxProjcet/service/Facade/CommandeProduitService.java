package com.example.HtmxProjcet.service.Facade;

import com.example.HtmxProjcet.bean.CommandeProduit;

import java.time.*;

import java.math.*;

import java.util.*;

public interface CommandeProduitService {

	CommandeProduit findById(Long id);

	List<CommandeProduit> findByCommandeId(Long id);

	List<CommandeProduit> findByCommandeTotal(double total);

	List<CommandeProduit> findByProduitId(Long id);

	List<CommandeProduit> findByProduitCode(String code);

	List<CommandeProduit> findByProduitPrix(double prix);

	List<CommandeProduit> findAll();

	 int deleteById(Long id);

	int deleteByCommandeId(Long id);

	int deleteByCommandeTotal(double total);

	int deleteByProduitId(Long id);

	int deleteByProduitCode(String code);

	int deleteByProduitPrix(double prix);

	CommandeProduit save(CommandeProduit commandeProduit) ;

	CommandeProduit update(CommandeProduit commandeProduit);

}