package fr.treeptik.service;

import java.util.List;

import fr.treeptik.pojo.Echange;

public interface EchangeService {
	
    public void add(Echange echange);
    public List<Echange> getAll();
    public Echange get(Integer id);
    public void delete(Integer echangeId);
	public List<Echange> getListEchangeForOneContact(Integer idUser);
}
