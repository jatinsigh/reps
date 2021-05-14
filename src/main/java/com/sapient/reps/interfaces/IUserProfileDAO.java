package com.sapient.reps.interfaces;

import java.util.List;

import com.sapient.reps.entity.UserProfile;

public interface IUserProfileDAO {

	public boolean addProfile(UserProfile user);

	public List<UserProfile> getAllUserProfileInfo();

	public List<UserProfile> getUserProfile(int uid);
}
