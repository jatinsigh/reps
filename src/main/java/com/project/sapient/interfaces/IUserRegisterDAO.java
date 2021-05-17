package com.project.sapient.interfaces;

import java.util.List;

import com.project.sapient.entity.UserRegister;

public interface IUserRegisterDAO {

	public boolean insertUser(UserRegister user);

	public List<UserRegister> getAllUserRegisterInfo();

	public List<UserRegister> getUser(int uid);

	public List<UserRegister> getUserByEmailAndPwd(String email, String Pwd);
}