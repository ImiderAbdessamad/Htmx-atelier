package com.example.HtmxProjcet.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity

public class Facture {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id ;
	@ManyToOne
	private Commande commande ;
	@ManyToOne
	private Client client ;
	private BigDecimal total ;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dateFcature ;

	// Constructeur par défaut
	public Facture() {
	}

	public Facture(Commande commande, Client client, BigDecimal total, LocalDateTime dateFcature) {
		this.commande = commande;
		this.client = client;
		this.total = total;
		this.dateFcature = dateFcature;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public LocalDateTime getDateFcature() {
		return dateFcature;
	}

	public void setDateFcature(LocalDateTime dateFcature) {
		this.dateFcature = dateFcature;
	}

}