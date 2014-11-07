package fr.treeptik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.treeptik.pojo.Entreprise;

public interface EntrepriseDAO extends JpaRepository<Entreprise, Integer> {

}
