package fr.treeptik.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.treeptik.pojo.User;

public interface UserDAO extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.name = ? and u.password = ?")
	User getOneByNamePassword(String name, String password);

}
