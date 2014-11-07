package fr.treeptik.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.ContactDAO;
import fr.treeptik.pojo.Contact;
import fr.treeptik.service.ContactService;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Override
	public void add(Contact contact) {
		contactDAO.save(contact);
	}

	@Override
	public List<Contact> getAll() {		
		return contactDAO.findAll();
	}

	@Override
	public Contact get(Integer id) {	
		return contactDAO.findOne(id);
	}

	@Override
	public void delete(Integer contactId) {
		contactDAO.delete(contactId);
	}

}
