package com.ssafy.food.model.dto;

public class User {
	String User_Id;
	String  User_Pass;
	String User_Name;
	int User_Cha;
	
	public User() {
	}
	
	public User(String user_Id, String user_Pass, String user_Name, int user_Cha) {
		super();
		User_Id = user_Id;
		User_Pass = user_Pass;
		User_Name = user_Name;
		User_Cha = user_Cha;
	}

	public String getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}

	public String getUser_Pass() {
		return User_Pass;
	}

	public void setUser_Pass(String user_Pass) {
		User_Pass = user_Pass;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public int getUser_Cha() {
		return User_Cha;
	}

	public void setUser_Cha(int user_Cha) {
		User_Cha = user_Cha;
	}

	@Override
	public String toString() {
		return "UserDto [User_Id=" + User_Id + ", User_Pass=" + User_Pass + ", User_Name=" + User_Name + ", User_Cha="
				+ User_Cha + "]";
	}


	
	
	
	
}