package com.project.sapient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.sapient.utils.DbConnect;
import com.sapient.reps.entity.UserProfile;
import com.sapient.reps.interfaces.IUserProfileDAO;

public class UserProfileDOO implements IUserProfileDAO {

	@Override
	public boolean addProfile(UserProfile user) {
		String sql = "Insert into UserProfile values(?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, user.getProfileId());
			ps.setString(2, user.getContactNo());
			ps.setInt(3, user.getAge());
			ps.setInt(4, user.getWeight());
			ps.setInt(5, user.getHeight());
			ps.setInt(6, user.getGender());
			ps.setInt(7, user.getWeightGoal());
			ps.setInt(8, user.getWorkoutPlanForDays());
			ps.setString(9, user.getUserType());
			ps.setBigDecimal(10, user.getStars());
			ps.setInt(11, user.getUserId());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<UserProfile> getAllUserProfileInfo() {
		String sql = "select profileId,contactNo,age,weight,height,gender,weightgoal,workOutPlanForDays,userType,stars,userId from UserProfile";
		List<UserProfile> userProfiles = new ArrayList<UserProfile>();
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				UserProfile profile = new UserProfile();
				profile.setProfileId(rs.getInt(1));
				profile.setContactNo(rs.getString(2));
				profile.setAge(rs.getInt(3));
				profile.setWeight(rs.getInt(4));
				profile.setHeight(rs.getInt(5));
				profile.setGender(rs.getString(6).charAt(0));
				profile.setWeightGoal(rs.getInt(7));
				profile.setWorkoutPlanForDays(rs.getInt(8));
				profile.setUserType(rs.getString(9));
				profile.setStars(rs.getBigDecimal(10));
				profile.setUserId(rs.getInt(11));
				userProfiles.add(profile);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userProfiles;
	}

	@Override
	public List<UserProfile> getUserProfile(int pid) {
		String sql = "select profileId,contactNo,age,weight,height,gender,weightgoal,workOutPlanForDays,userType,stars,userId from UserRegister where ProfileId = ?";
		List<UserProfile> userProfiles = new ArrayList<>();
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, pid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				UserProfile profile = new UserProfile();
				profile.setProfileId(rs.getInt(1));
				profile.setContactNo(rs.getString(2));
				profile.setAge(rs.getInt(3));
				profile.setWeight(rs.getInt(4));
				profile.setHeight(rs.getInt(5));
				profile.setGender(rs.getString(6).charAt(0));
				profile.setWeightGoal(rs.getInt(7));
				profile.setWorkoutPlanForDays(rs.getInt(8));
				profile.setUserType(rs.getString(9));
				profile.setStars(rs.getBigDecimal(10));
				profile.setUserId(rs.getInt(11));
				userProfiles.add(profile);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userProfiles;
	}

}
