package fr.treeptik.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.EchangeDAO;
import fr.treeptik.pojo.Echange;
import fr.treeptik.service.EchangeService;

@Service
@Transactional
public class EchangeServiceImpl implements EchangeService {

	@Autowired
	private EchangeDAO echangeDAO;
	
	@Override
	public void add(Echange echange) {
		echangeDAO.save(echange);
	}

	@Override
	public List<Echange> getAll() {
		return echangeDAO.findAll();
	}

	@Override
	public Echange get(Integer id) {
		return echangeDAO.findOne(id);
	}

	@Override
	public void delete(Integer echangeId) {
		echangeDAO.delete(echangeId);
	}

	@Override
	public List<Echange> getListEchangeForOneContact(Integer idUser) {
		return echangeDAO.getListEchangeForOneContact(idUser);
	}

}
