package com.project.sapient.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sapient.dao.UserRegisterDOO;
import com.project.sapient.entity.UserRegister;
import com.project.sapient.interfaces.IUserRegisterDAO;

@RestController
public class LoginApi {
	IUserRegisterDAO dao = new UserRegisterDOO();

	@PostMapping("/api/login")
	public Boolean userLogin(@RequestBody UserRegister user) {
		String email = user.getEmailId(), password = user.getPassword();
		return dao.getUserByEmailAndPwd(email, password).size() == 1;
	}
}