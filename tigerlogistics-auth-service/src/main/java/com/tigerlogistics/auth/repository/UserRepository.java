package com.tigerlogistics.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;
import com.tigerlogistics.auth.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	boolean existsByUsername(String username);

	User findByUsername(String username);
	
	//List<User> findAll();

	List<User> findAll();

}
