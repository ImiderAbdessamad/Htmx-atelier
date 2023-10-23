package com.example.HtmxProjcet.bean;

import javax.persistence.*;

import java.math.*;

import java.time.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

public class CommandeProduit {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id ;
	@ManyToOne
	private Commande commande ;
	@ManyToOne
	private Produit produit ;

	// Constructeur par défaut
	public CommandeProduit() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}