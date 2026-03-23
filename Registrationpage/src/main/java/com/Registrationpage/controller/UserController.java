package com.Registrationpage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Registrationpage.exception.NotFoundException;
import com.Registrationpage.model.UserPage;
import com.Registrationpage.service.UserService;

@CrossOrigin(origins = "*") 
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/register")
	public UserPage save(@RequestBody UserPage u) {
		if (!userService.usercheckEmailExisting(u.getEmail())) throw new NotFoundException("Email already exist");
		return userService.saveUser(u);
	}
	
	@GetMapping("/display")
	public List <UserPage> showAll(){
		return userService.showAll();
	}
	@GetMapping("/display/{id}")
	public UserPage getByid(@PathVariable int id) {
		return userService.getUserpageById(id);
	}
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
         userService.delete(id);
    }
    @PatchMapping("/update/{id}")
    public UserPage patchStudent(@PathVariable int id, @RequestBody UserPage u) {
        return userService.update(id, u);
    }
}
