package fr.treeptik.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.EntrepriseDAO;
import fr.treeptik.pojo.Entreprise;
import fr.treeptik.service.EntrepriseService;

@Service
@Transactional
public class EntrepriseServiceImpl implements EntrepriseService {

	@Autowired
	private EntrepriseDAO entrepriseDAO;
	
	@Override
	public void add(Entreprise entreprise) {
		entrepriseDAO.save(entreprise);
	}

	@Override
	public List<Entreprise> getAll() {
		return entrepriseDAO.findAll();
	}

	@Override
	public Entreprise get(Integer id) {
		return entrepriseDAO.findOne(id);
	}

	@Override
	public void delete(Integer entrepriseId) {
		entrepriseDAO.delete(entrepriseId);
	}

}
