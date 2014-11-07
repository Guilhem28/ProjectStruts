package fr.treeptik.service;

import java.util.List;

import fr.treeptik.pojo.User;

public interface UserService {

	User getOneByNamePassword(String name, String password);
    public void add(User user);
    public List<User> getAll();
    public User get(Integer id);
    public void delete(Integer userId);
}
