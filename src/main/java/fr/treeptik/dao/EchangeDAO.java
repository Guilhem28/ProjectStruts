package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.treeptik.pojo.Echange;

public interface EchangeDAO extends JpaRepository<Echange, Integer> {

	@Query("select e from Echange e left join fetch e.contact c where c.id = ?")
	List<Echange> getListEchangeForOneContact(Integer idUser);

}
