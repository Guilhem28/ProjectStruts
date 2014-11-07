package fr.treeptik.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import fr.treeptik.dao.UserDAO;
import fr.treeptik.pojo.User;
import fr.treeptik.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public User getOneByNamePassword(String name, String password) {
		return userDAO.getOneByNamePassword(name, password);
	}

	@Override
	public void add(User user) {
		userDAO.save(user);
	}

	@Override
	public List<User> getAll() {
		return userDAO.findAll();
	}

	@Override
	public User get(Integer id) {
		return userDAO.findOne(id);
	}

	@Override
	public void delete(Integer userId) {
		userDAO.delete(userId);
	}
	


}
