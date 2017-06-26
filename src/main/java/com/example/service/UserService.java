package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IUserDAO;
import com.example.objects.User;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUserDAO UserDAO;
    
	@Override
	public User getUserById(int id) {
		User obj = UserDAO.getUserById(id);
		return obj;
	}
	
	@Override
	public List<User> getAllUsers() {
		return UserDAO.getAllUsers();
	}


	@Override
	public synchronized boolean addUser(User user) {
		if (UserDAO.userExists(user.getFrist_name(), user.getLast_name(), user.getEmail_id())) {
            return false;
        } else {
        	UserDAO.addUser(user);
            return true;
        }
	}

	@Override
	public void updateUser(User user) {
		UserDAO.updateUser(user);
		
	}

	@Override
	public void deleteUser(int id) {
		UserDAO.deleteUser(id);
	}

}
