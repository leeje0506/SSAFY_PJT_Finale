package com.ssafy.food.model.dto;

public class User {
	String userId;
	String  userPass;
	String userName;
	int userCha;
	
	public User() {
	}

	public User(String userId, String userPass, String userName, int userCha) {
		this.userId = userId;
		this.userPass = userPass;
		this.userName = userName;
		this.userCha = userCha;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserCha() {
		return userCha;
	}

	public void setUserCha(int userCha) {
		this.userCha = userCha;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPass=" + userPass + ", userName=" + userName + ", userCha=" + userCha
				+ "]";
	}
	
	


	
	
	
	
}