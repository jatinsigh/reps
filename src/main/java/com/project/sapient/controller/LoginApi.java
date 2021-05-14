package com.project.sapient.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.sapient.dao.UserRegisterDOO;
import com.sapient.reps.entity.UserRegister;
import com.sapient.reps.interfaces.IUserRegisterDAO;

@RestController
public class LoginApi {
	IUserRegisterDAO dao = new UserRegisterDOO();

	@GetMapping("/api/login/{email}/{password}")
	public Boolean userLogin(@PathVariable String email, @PathVariable String password) {
		List<UserRegister> userCheck = dao.getUserByEmailAndPwd(email, password);
		return userCheck.size() == 0 ? false : true;
	}
}