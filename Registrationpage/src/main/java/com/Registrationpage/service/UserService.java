package com.Registrationpage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Registrationpage.exception.NotFoundException;
import com.Registrationpage.model.UserPage;
import com.Registrationpage.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public UserPage saveUser(UserPage u) {
		return userRepo.save(u);
	}

	public List<UserPage> showAll() {
		return userRepo.findAll();
	}

	public UserPage getUserpageById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElseThrow(() -> new NotFoundException("User Not Found"));
	}

	public void delete(int id) {
		userRepo.deleteById(id);
		// TODO Auto-generated method stub

	}

	public UserPage update(int id, UserPage u) {
		UserPage existing = userRepo.findById(id).orElse(null);
		if (existing != null) {
			if (u.getName() != null) {
				existing.setName(u.getName());
			}
			if (u.getEmail() != null) {
				existing.setEmail(u.getEmail());
			}
			if (u.getPassword() != null) {
				existing.setPassword(u.getPassword());
			}
			return userRepo.save(existing);
		}
		return null;
	}



	public boolean usercheckEmailExisting(String email) {
		// TODO Auto-generated method stub
				if (userRepo.existsByEmail(email)) return true;
					return false;
	}
}