package com.example.HtmxProjcet.service.Impl;

import com.example.HtmxProjcet.bean.Facture;

import com.example.HtmxProjcet.dao.FactureDao;

import com.example.HtmxProjcet.service.Facade.FactureService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.*;

import java.math.*;

import java.util.*;

import com.example.HtmxProjcet.bean.Commande;


import com.example.HtmxProjcet.bean.Client;


@Service

public class FactureServiceImpl implements FactureService {

	@Autowired 
	private FactureDao factureDao;

	@Override 
	public Facture findById(Long id){ return factureDao.findById(id).get(); }

	@Override 
	public 	List<Facture> findByCommandeId(Long id) { return factureDao.findByCommandeId(id);} 

	@Override 
	public 	List<Facture> findByCommandeTotal(double total) { return factureDao.findByCommandeTotal(total);} 

	@Override 
	public 	List<Facture> findByClientId(Long id) { return factureDao.findByClientId(id);} 

	@Override 
	public 	List<Facture> findByClientNom(String nom) { return factureDao.findByClientNom(nom);} 

	@Override 
	public 	List<Facture> findByClientPrenom(String prenom) { return factureDao.findByClientPrenom(prenom);} 

	@Override 
	public 	List<Facture> findByTotal(BigDecimal total) { return factureDao.findByTotal(total);} 

	@Override 
	public 	List<Facture> findByDateFcature(LocalDateTime dateFcature) { return factureDao.findByDateFcature(dateFcature);} 

	@Override 
	public List<Facture> findAll() { return factureDao.findAll(); }

	@Override 
	@Transactional
	public int deleteById(Long id){ factureDao.deleteById(id);
	 return 1; }

	@Override 
	@Transactional
	public 	int deleteByCommandeId(Long id) { return factureDao.deleteByCommandeId(id);} 

	@Override 
	@Transactional
	public 	int deleteByCommandeTotal(double total) { return factureDao.deleteByCommandeTotal(total);} 

	@Override 
	@Transactional
	public 	int deleteByClientId(Long id) { return factureDao.deleteByClientId(id);} 

	@Override 
	@Transactional
	public 	int deleteByClientNom(String nom) { return factureDao.deleteByClientNom(nom);} 

	@Override 
	@Transactional
	public 	int deleteByClientPrenom(String prenom) { return factureDao.deleteByClientPrenom(prenom);} 

	@Override 
	@Transactional
	public 	int deleteByTotal(BigDecimal total) { return factureDao.deleteByTotal(total);} 

	@Override 
	@Transactional
	public 	int deleteByDateFcature(LocalDateTime dateFcature) { return factureDao.deleteByDateFcature(dateFcature);} 

	@Override 
	public Facture save(Facture facture) { 

		return factureDao.save(facture);
	}

	@Override 
	public Facture update(Facture facture) { 
		Facture facture1 = findById(facture.getId());

		if (facture1 == null) return save(facture);

		facture1.setCommande(facture.getCommande());
		facture1.setClient(facture.getClient());
		facture1.setTotal(facture.getTotal());
		facture1.setDateFcature(facture.getDateFcature());
		return save(facture1);
	}
}