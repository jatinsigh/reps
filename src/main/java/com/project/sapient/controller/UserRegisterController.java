package com.project.sapient.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.sapient.dao.UserRegisterDOO;
import com.project.sapient.entity.UserRegister;
import com.project.sapient.interfaces.IUserRegisterDAO;

@RestController
@RequestMapping("/api")
public class UserRegisterController {

	IUserRegisterDAO dao = new UserRegisterDOO();

	@GetMapping
	public String Health() {
		return "Service is Up";
	}

	@GetMapping("/Registered")
	public List<UserRegister> getAllUser() {
		return dao.getAllUserRegisterInfo();
	}

	@PostMapping("/NewRegister")
	public String insertUser(@RequestBody UserRegister user) {
		return dao.insertUser(user) ? "Inserted" : "Not-Inserted";
	}

	@GetMapping("/Registered/{uId}")
	public List<UserRegister> getUser(@PathVariable int uid) {
		return dao.getUser(uid);
	}
}