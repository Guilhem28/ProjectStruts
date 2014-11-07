package fr.treeptik.service;

import java.util.List;

import fr.treeptik.pojo.Entreprise;

public interface EntrepriseService {
	
    public void add(Entreprise entreprise);
    public List<Entreprise> getAll();
    public Entreprise get(Integer id);
    public void delete(Integer entrepriseId);
}
