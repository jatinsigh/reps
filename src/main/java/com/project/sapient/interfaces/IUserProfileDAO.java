package com.project.sapient.interfaces;

import java.util.List;

import com.project.sapient.entity.UserProfile;

public interface IUserProfileDAO {

	public boolean addProfile(UserProfile user);

	public List<UserProfile> getAllUserProfileInfo();

	public List<UserProfile> getUserProfile(int uid);
}
