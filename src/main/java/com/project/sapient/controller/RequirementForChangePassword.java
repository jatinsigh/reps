package com.project.sapient.controller;

public class RequirementForChangePassword {
	private String email;
	private String newPassword;

	public RequirementForChangePassword(String email, String presenPassword, String newPassword) {
		super();
		this.email = email;
		this.newPassword = newPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
