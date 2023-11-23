package com.ssafy.food.model.dto;

public class Review {
	String User_Id;
    int Res_Id;
    String Review_Content;
    String Review_Thumbnail;
	
    public Review() {
	}
    
    public Review(String user_Id, int res_Id, String review_Content, String review_Thumbnail) {
		super();
		User_Id = user_Id;
		Res_Id = res_Id;
		Review_Content = review_Content;
		Review_Thumbnail = review_Thumbnail;
	}

	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public int getRes_Id() {
		return Res_Id;
	}
	public void setRes_Id(int res_Id) {
		Res_Id = res_Id;
	}
	public String getReview_Content() {
		return Review_Content;
	}
	public void setReview_Content(String review_Content) {
		Review_Content = review_Content;
	}
	public String getReview_Thumbnail() {
		return Review_Thumbnail;
	}
	public void setReview_Thumbnail(String review_Thumbnail) {
		Review_Thumbnail = review_Thumbnail;
	}
	@Override
	public String toString() {
		return "ReviewDto [User_Id=" + User_Id + ", Res_Id=" + Res_Id + ", Review_Content=" + Review_Content
				+ ", Review_Thumbnail=" + Review_Thumbnail + "]";
	}
    
    
    
    
}
