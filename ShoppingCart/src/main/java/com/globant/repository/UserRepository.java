package com.globant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globant.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findUserByName(String name);

	public User findUserByEmail(String email);
}
