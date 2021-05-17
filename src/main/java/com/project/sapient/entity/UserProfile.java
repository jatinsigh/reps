package com.project.sapient.entity;

import java.math.BigDecimal;

public class UserProfile {
	private int profileId;
	private String contactNo;
	private int age;
	private int weight;
	private int height;
	private char gender;
	private int weightGoal;
	private int workoutPlanForDays;
	private String userType;
	private BigDecimal stars;
	private int userId;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int pid) {
		profileId = pid;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNumber) {
		contactNo = contactNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char string) {
		this.gender = string;
	}

	public int getWeightGoal() {
		return weightGoal;
	}

	public void setWeightGoal(int weightGoal) {
		this.weightGoal = weightGoal;
	}

	public int getWorkoutPlanForDays() {
		return workoutPlanForDays;
	}

	public void setWorkoutPlanForDays(int workoutPlanForDays) {
		this.workoutPlanForDays = workoutPlanForDays;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public BigDecimal getStars() {
		return stars;
	}

	public void setStars(BigDecimal stars) {
		this.stars = stars;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int uid) {
		userId = uid;
	}

	@Override
	public String toString() {
		return "UserProfile [Pid=" + profileId + ", UserType=" + userType + "]";
	}
}