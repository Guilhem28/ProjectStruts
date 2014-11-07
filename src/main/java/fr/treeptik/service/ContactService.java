package fr.treeptik.service;

import java.util.List;

import fr.treeptik.pojo.Contact;


public interface ContactService {
	
    public void add(Contact contact);
    public List<Contact> getAll();
    public Contact get(Integer id);
    public void delete(Integer contactId);
}
