package com.ssafy.food.model.dto;

public class User {
	String User_Id;
	String  User_Password;
	String User_NickName;
	int User_Cha;
	
	public User() {
	}
	
	public User(String user_Id, String user_Password, String user_NickName, int user_Cha) {
		super();
		User_Id = user_Id;
		User_Password = user_Password;
		User_NickName = user_NickName;
		User_Cha = user_Cha;
	}

	public String getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}

	public String getUser_Password() {
		return User_Password;
	}

	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}

	public String getUser_NickName() {
		return User_NickName;
	}

	public void setUser_NickName(String user_NickName) {
		User_NickName = user_NickName;
	}

	public int getUser_Cha() {
		return User_Cha;
	}

	public void setUser_Cha(int user_Cha) {
		User_Cha = user_Cha;
	}

	@Override
	public String toString() {
		return "UserDto [User_Id=" + User_Id + ", User_Password=" + User_Password + ", User_Name=" + User_NickName + ", User_Cha="
				+ User_Cha + "]";
	}

    // public Object getPassword() {
    //     return null;
    // }
	
	
	
	
}