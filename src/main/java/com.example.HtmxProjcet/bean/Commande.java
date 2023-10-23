package com.example.HtmxProjcet.bean;

import javax.persistence.*;

import java.math.*;

import java.time.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

public class Commande {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id ;
	private double total ;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "commande")
	private List<CommandeProduit>  commandeProduits ;
	@ManyToOne
	private Client client ;

	// Constructeur par défaut
	public Commande() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<CommandeProduit> getCommandeProduits() {
		return commandeProduits;
	}

	public void setCommandeProduits(List<CommandeProduit> commandeProduits) {
		this.commandeProduits = commandeProduits;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}