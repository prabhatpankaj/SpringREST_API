package com.example.dao;

import java.util.List;

import com.example.objects.User;

public interface IUserDAO {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    boolean userExists(String frist_name, String last_name , String email_id);
} 

