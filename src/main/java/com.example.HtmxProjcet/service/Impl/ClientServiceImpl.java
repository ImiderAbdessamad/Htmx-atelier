package com.example.HtmxProjcet.service.Impl;

import com.example.HtmxProjcet.bean.Client;
import com.example.HtmxProjcet.dao.ClientDao;
import com.example.HtmxProjcet.service.Facade.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service

public class ClientServiceImpl implements ClientService {

	@Autowired 
	private ClientDao clientDao;

	@Override 
	public Client findById(Long id){ return clientDao.findById(id).get(); }

	@Override 
	public 	List<Client> findByNom(String nom) { return clientDao.findByNom(nom);} 

	@Override 
	public 	List<Client> findByPrenom(String prenom) { return clientDao.findByPrenom(prenom);}

	@Override
	public Client findByEmail(String email) {
		return clientDao.findByEmail(email);
	}

	@Override
	public Client findByTelephone(String telephone) {
		return clientDao.findByTelephone(telephone);
	}

	@Override
	public 	List<Client> findByCommandesId(Long id) { return clientDao.findByCommandesId(id);} 

	@Override 
	public 	List<Client> findByCommandesTotal(double total) { return clientDao.findByCommandesTotal(total);} 

	@Override 
	public 	List<Client> findByReclamationsId(Long id) { return clientDao.findByReclamationsId(id);} 

	@Override 
	public 	List<Client> findByReclamationsContenu(String contenu) { return clientDao.findByReclamationsContenu(contenu);} 

	@Override 
	public List<Client> findAll() { return clientDao.findAll(); }

	@Override 
	@Transactional
	public int deleteById(Long id){ clientDao.deleteById(id);
	 return 1; }

	@Override 
	@Transactional
	public 	int deleteByNom(String nom) { return clientDao.deleteByNom(nom);} 

	@Override 
	@Transactional
	public 	int deleteByPrenom(String prenom) { return clientDao.deleteByPrenom(prenom);}

	@Override
	public int deleteByEmail(String email) {
		return clientDao.deleteByEmail(email);
	}

	@Override
	public int deleteByTelephone(String telephone) {
		return clientDao.deleteByTelephone(telephone);
	}

	@Override
	@Transactional
	public 	int deleteByCommandesId(Long id) { return clientDao.deleteByCommandesId(id);} 

	@Override 
	@Transactional
	public 	int deleteByCommandesTotal(double total) { return clientDao.deleteByCommandesTotal(total);} 

	@Override 
	@Transactional
	public 	int deleteByReclamationsId(Long id) { return clientDao.deleteByReclamationsId(id);} 

	@Override 
	@Transactional
	public 	int deleteByReclamationsContenu(String contenu) { return clientDao.deleteByReclamationsContenu(contenu);} 

	@Override 
	public Client save(Client client) { 

		return clientDao.save(client);
	}

	@Override 
	public Client update(Client client) { 
		Client client1 = findById(client.getId());

		if (client1 == null) return save(client);

		client1.setNom(client.getNom());
		client1.setPrenom(client.getPrenom());
		client1.setCommandes(client.getCommandes());
		client1.setReclamations(client.getReclamations());
		return save(client1);
	}
}