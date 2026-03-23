package com.Registrationpage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Registrationpage.model.UserPage;
@Repository
public interface UserRepo extends JpaRepository<UserPage, Integer> {
	boolean existsByEmail(String email);


}
