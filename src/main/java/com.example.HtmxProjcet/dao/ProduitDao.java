package com.example.HtmxProjcet.dao;

import com.example.HtmxProjcet.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProduitDao extends JpaRepository<Produit , Long> {

	List<Produit> findByCode(String code);

	List<Produit> findByPrix(double prix);

	int deleteByCode(String code);

	int deleteByPrix(double prix);

}