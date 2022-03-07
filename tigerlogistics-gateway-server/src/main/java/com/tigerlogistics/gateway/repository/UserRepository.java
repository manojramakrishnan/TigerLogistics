package com.tigerlogistics.gateway.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.gateway.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	Optional<User> findByUsername(String userName);
	boolean existsByUsername(String username); 
}
