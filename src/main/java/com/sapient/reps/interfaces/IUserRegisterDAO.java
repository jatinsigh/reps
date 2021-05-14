package com.sapient.reps.interfaces;

import java.util.List;

import com.sapient.reps.entity.UserRegister;

public interface IUserRegisterDAO {

	public boolean insertUser(UserRegister user);

	public List<UserRegister> getAllUserRegisterInfo();

	public List<UserRegister> getUser(int uid);

	public List<UserRegister> getUserByEmailAndPwd(String email, String Pwd);
}