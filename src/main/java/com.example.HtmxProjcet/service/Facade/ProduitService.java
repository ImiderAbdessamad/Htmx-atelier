package com.example.HtmxProjcet.service.Facade;

import com.example.HtmxProjcet.bean.Produit;

import java.util.List;

public interface ProduitService {

	Produit findById(Long id);

	List<Produit> findByCode(String code);

	List<Produit> findByPrix(double prix);

	List<Produit> findAll();

	 int deleteById(Long id);

	int deleteByCode(String code);

	int deleteByPrix(double prix);

	Produit save(Produit produit) ;

	Produit update(Produit produit);

}