package com.example.HtmxProjcet.service.Impl;

import com.example.HtmxProjcet.bean.Reclamation;
import com.example.HtmxProjcet.dao.ReclamationDao;
import com.example.HtmxProjcet.service.Facade.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service

public class ReclamationServiceImpl implements ReclamationService {

	@Autowired 
	private ReclamationDao reclamationDao;

	@Override 
	public Reclamation findById(Long id){ return reclamationDao.findById(id).get(); }

	@Override 
	public 	List<Reclamation> findByContenu(String contenu) { return reclamationDao.findByContenu(contenu);} 

	@Override 
	public 	List<Reclamation> findByClientId(Long id) { return reclamationDao.findByClientId(id);} 

	@Override 
	public 	List<Reclamation> findByClientNom(String nom) { return reclamationDao.findByClientNom(nom);} 

	@Override 
	public 	List<Reclamation> findByClientPrenom(String prenom) { return reclamationDao.findByClientPrenom(prenom);} 

	@Override 
	public List<Reclamation> findAll() { return reclamationDao.findAll(); }

	@Override 
	@Transactional
	public int deleteById(Long id){ reclamationDao.deleteById(id);
	 return 1; }

	@Override 
	@Transactional
	public 	int deleteByContenu(String contenu) { return reclamationDao.deleteByContenu(contenu);} 

	@Override 
	@Transactional
	public 	int deleteByClientId(Long id) { return reclamationDao.deleteByClientId(id);} 

	@Override 
	@Transactional
	public 	int deleteByClientNom(String nom) { return reclamationDao.deleteByClientNom(nom);} 

	@Override 
	@Transactional
	public 	int deleteByClientPrenom(String prenom) { return reclamationDao.deleteByClientPrenom(prenom);} 

	@Override 
	public Reclamation save(Reclamation reclamation) { 

		return reclamationDao.save(reclamation);
	}

	@Override 
	public Reclamation update(Reclamation reclamation) { 
		Reclamation reclamation1 = findById(reclamation.getId());

		if (reclamation1 == null) return save(reclamation);

		reclamation1.setContenu(reclamation.getContenu());
		reclamation1.setClient(reclamation.getClient());
		return save(reclamation1);
	}
}