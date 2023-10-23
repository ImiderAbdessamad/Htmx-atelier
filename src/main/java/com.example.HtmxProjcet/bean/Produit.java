package com.example.HtmxProjcet.bean;

import javax.persistence.*;

import java.math.*;

import java.time.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

public class Produit {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id ;
	private String code ;
	private double prix ;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "produit")
	private List<CommandeProduit>  commandeProduits ;

	// Constructeur par défaut
	public Produit() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public List<CommandeProduit> getCommandeProduits() {
		return commandeProduits;
	}

	public void setCommandeProduits(List<CommandeProduit> commandeProduits) {
		this.commandeProduits = commandeProduits;
	}

}