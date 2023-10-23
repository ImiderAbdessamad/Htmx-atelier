package com.example.HtmxProjcet.service.Impl;

import com.example.HtmxProjcet.bean.Produit;

import com.example.HtmxProjcet.dao.ProduitDao;

import com.example.HtmxProjcet.service.Facade.ProduitService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.*;

import java.math.*;

import java.util.*;

import com.example.HtmxProjcet.bean.CommandeProduit;


@Service

public class ProduitServiceImpl implements ProduitService {

	@Autowired 
	private ProduitDao produitDao;

	@Override 
	public Produit findById(Long id){ return produitDao.findById(id).get(); }

	@Override 
	public 	List<Produit> findByCode(String code) { return produitDao.findByCode(code);} 

	@Override 
	public 	List<Produit> findByPrix(double prix) { return produitDao.findByPrix(prix);} 

	@Override 
	public List<Produit> findAll() { return produitDao.findAll(); }

	@Override 
	@Transactional
	public int deleteById(Long id){ produitDao.deleteById(id);
	 return 1; }

	@Override 
	@Transactional
	public 	int deleteByCode(String code) { return produitDao.deleteByCode(code);} 

	@Override 
	@Transactional
	public 	int deleteByPrix(double prix) { return produitDao.deleteByPrix(prix);} 

	@Override 
	public Produit save(Produit produit) { 

		return produitDao.save(produit);
	}

	@Override 
	public Produit update(Produit produit) { 
		Produit produit1 = findById(produit.getId());

		if (produit1 == null) return save(produit);

		produit1.setCode(produit.getCode());
		produit1.setPrix(produit.getPrix());
		produit1.setCommandeProduits(produit.getCommandeProduits());
		return save(produit1);
	}
}