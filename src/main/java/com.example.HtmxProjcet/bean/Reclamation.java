package com.example.HtmxProjcet.bean;

import javax.persistence.*;

@Entity

public class Reclamation {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id ;
	private String contenu ;
	@ManyToOne
	private Client client ;

	// Constructeur par défaut
	public Reclamation() {
	}

	public Reclamation(String contenu, Client client) {
		this.contenu = contenu;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}