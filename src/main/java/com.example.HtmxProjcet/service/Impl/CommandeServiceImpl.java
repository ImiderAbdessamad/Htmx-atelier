package com.example.HtmxProjcet.service.Impl;

import com.example.HtmxProjcet.bean.Commande;
import com.example.HtmxProjcet.dao.CommandeDao;
import com.example.HtmxProjcet.service.Facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service

public class CommandeServiceImpl implements CommandeService {

	@Autowired 
	private CommandeDao commandeDao;

	@Override 
	public Commande findById(Long id){ return commandeDao.findById(id).get(); }

	@Override 
	public 	List<Commande> findByTotal(double total) { return commandeDao.findByTotal(total);} 

	@Override 
	public 	List<Commande> findByClientId(Long id) { return commandeDao.findByClientId(id);} 

	@Override 
	public 	List<Commande> findByClientNom(String nom) { return commandeDao.findByClientNom(nom);} 

	@Override 
	public 	List<Commande> findByClientPrenom(String prenom) { return commandeDao.findByClientPrenom(prenom);} 

	@Override 
	public List<Commande> findAll() { return commandeDao.findAll(); }

	@Override 
	@Transactional
	public int deleteById(Long id){ commandeDao.deleteById(id);
	 return 1; }

	@Override 
	@Transactional
	public 	int deleteByTotal(double total) { return commandeDao.deleteByTotal(total);} 

	@Override 
	@Transactional
	public 	int deleteByClientId(Long id) { return commandeDao.deleteByClientId(id);} 

	@Override 
	@Transactional
	public 	int deleteByClientNom(String nom) { return commandeDao.deleteByClientNom(nom);} 

	@Override 
	@Transactional
	public 	int deleteByClientPrenom(String prenom) { return commandeDao.deleteByClientPrenom(prenom);} 

	@Override 
	public Commande save(Commande commande) { 

		return commandeDao.save(commande);
	}

	@Override 
	public Commande update(Commande commande) { 
		Commande commande1 = findById(commande.getId());

		if (commande1 == null) return save(commande);

		commande1.setTotal(commande.getTotal());
		commande1.setCommandeProduits(commande.getCommandeProduits());
		commande1.setClient(commande.getClient());
		return save(commande1);
	}
}