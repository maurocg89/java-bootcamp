package com.globant.service;

import java.util.List;

import com.globant.entity.User;

public interface UserService {

	List<User> getAllUsers();

	User addUser(User user);

	User updateUser(User user);

	void removeUser(Long id);

	User getUserById(Long id);

	User findUserByName(String name);

	User findUserByEmail(String email);

}
