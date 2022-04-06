package com.tigerlogistics.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.auth.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	boolean existsByUsername(String username);

}
