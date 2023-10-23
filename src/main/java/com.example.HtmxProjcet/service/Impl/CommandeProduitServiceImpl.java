package com.example.HtmxProjcet.service.Impl;

import com.example.HtmxProjcet.bean.CommandeProduit;

import com.example.HtmxProjcet.dao.CommandeProduitDao;

import com.example.HtmxProjcet.service.Facade.CommandeProduitService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.*;

import java.math.*;

import java.util.*;

import com.example.HtmxProjcet.bean.Commande;


import com.example.HtmxProjcet.bean.Produit;


@Service

public class CommandeProduitServiceImpl implements CommandeProduitService {

	@Autowired 
	private CommandeProduitDao commandeProduitDao;

	@Override 
	public CommandeProduit findById(Long id){ return commandeProduitDao.findById(id).get(); }

	@Override 
	public 	List<CommandeProduit> findByCommandeId(Long id) { return commandeProduitDao.findByCommandeId(id);} 

	@Override 
	public 	List<CommandeProduit> findByCommandeTotal(double total) { return commandeProduitDao.findByCommandeTotal(total);} 

	@Override 
	public 	List<CommandeProduit> findByProduitId(Long id) { return commandeProduitDao.findByProduitId(id);} 

	@Override 
	public 	List<CommandeProduit> findByProduitCode(String code) { return commandeProduitDao.findByProduitCode(code);} 

	@Override 
	public 	List<CommandeProduit> findByProduitPrix(double prix) { return commandeProduitDao.findByProduitPrix(prix);} 

	@Override 
	public List<CommandeProduit> findAll() { return commandeProduitDao.findAll(); }

	@Override 
	@Transactional
	public int deleteById(Long id){ commandeProduitDao.deleteById(id);
	 return 1; }

	@Override 
	@Transactional
	public 	int deleteByCommandeId(Long id) { return commandeProduitDao.deleteByCommandeId(id);} 

	@Override 
	@Transactional
	public 	int deleteByCommandeTotal(double total) { return commandeProduitDao.deleteByCommandeTotal(total);} 

	@Override 
	@Transactional
	public 	int deleteByProduitId(Long id) { return commandeProduitDao.deleteByProduitId(id);} 

	@Override 
	@Transactional
	public 	int deleteByProduitCode(String code) { return commandeProduitDao.deleteByProduitCode(code);} 

	@Override 
	@Transactional
	public 	int deleteByProduitPrix(double prix) { return commandeProduitDao.deleteByProduitPrix(prix);} 

	@Override 
	public CommandeProduit save(CommandeProduit commandeProduit) { 

		return commandeProduitDao.save(commandeProduit);
	}

	@Override 
	public CommandeProduit update(CommandeProduit commandeProduit) { 
		CommandeProduit commandeProduit1 = findById(commandeProduit.getId());

		if (commandeProduit1 == null) return save(commandeProduit);

		commandeProduit1.setCommande(commandeProduit.getCommande());
		commandeProduit1.setProduit(commandeProduit.getProduit());
		return save(commandeProduit1);
	}
}