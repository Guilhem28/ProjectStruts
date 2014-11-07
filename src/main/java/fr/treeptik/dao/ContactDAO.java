package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.pojo.Contact;


public interface ContactDAO extends JpaRepository<Contact, Integer> {
    
    @Query("select e from Contact e where e.mail=:mail")
    public Contact findOneByEmail(@Param("mail") String mail);

    @Query("select e from Contact e where e.nom=:nom")
    public List<Contact> findAllByNom(@Param("nom") String nom);
    
}
