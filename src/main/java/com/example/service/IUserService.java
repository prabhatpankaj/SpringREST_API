package com.example.service;

import java.util.List;

import com.example.objects.User;

public interface IUserService {
	List<User> getAllUsers();
    User getUserById(int id);
    boolean addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);

}
