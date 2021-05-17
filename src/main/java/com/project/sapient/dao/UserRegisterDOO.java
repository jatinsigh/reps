package com.project.sapient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.sapient.entity.UserRegister;
import com.project.sapient.interfaces.IUserRegisterDAO;
import com.project.sapient.utils.DbConnect;

public class UserRegisterDOO implements IUserRegisterDAO {

	@Override
	public boolean insertUser(UserRegister user) {
		String sql = "insert into UserRegister values(?,?,?,?)";
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getEmailId());
			ps.setString(4, user.getPassword());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public List<UserRegister> getAllUserRegisterInfo() {
		String sql = "select UserId,UserName,EmailId,password from UserRegister";
		List<UserRegister> allUserInfo = new ArrayList<UserRegister>();
		try (PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql); ResultSet rs = ps.executeQuery();) {
			while (rs.next()) {
				UserRegister user = new UserRegister(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				allUserInfo.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allUserInfo;
	}

	@Override
	public List<UserRegister> getUser(int uid) {
		String sql = "select UserId,UserName,EmailId,password from UserRegister where userId=?";
		List<UserRegister> userList = new ArrayList<>();
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				UserRegister user = new UserRegister();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setPassword(rs.getString(4));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public List<UserRegister> getUserByEmailAndPwd(String email, String Pwd) {
		String sql = "select UserId,UserName,EmailId,password from UserRegister where EmailId = ? And password= ?";
		List<UserRegister> userList = new ArrayList<>();
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, Pwd);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				UserRegister user = new UserRegister();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setPassword(rs.getString(4));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
}