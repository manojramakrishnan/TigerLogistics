package com.tigerlogistics.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.auth.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long>{

	UserDetails findByUsername(String username);

}
