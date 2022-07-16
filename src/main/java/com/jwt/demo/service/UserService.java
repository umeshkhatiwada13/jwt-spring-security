package com.jwt.demo.service;

import com.jwt.demo.model.Role;
import com.jwt.demo.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String role);
    User getUser(String userName);
    List<User> getAllUsers();
}
