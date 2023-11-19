package com.ssafy.food.model.dto;

public class Restaurant {
    int Res_Id;
	String Res_Name;
    String Res_Region;
    String Res_Contury;
    double Res_Lati;
    double Res_Longi;
    String Res_Address;
    String Res_Tel;
    String Res_WDay;
    String Res_WEnd;
    int Res_Park;
    int Res_Kid;
    int Res_Wheel;
    int Res_Pet;
	int Res_Vegi;
    int Res_Halal;
    int Res_GFree;
    

    public Restaurant() {
        
    }
    public Restaurant(int res_Id, String res_Name, String res_Region, String res_Contury, double res_Lati,
            double res_Longi, String res_Address, String res_Tel, String res_WDay, String res_WEnd, int res_Park,
            int res_Kid, int res_Wheel, int res_Pet, int res_Vegi, int res_Halal, int res_GFree) {
        Res_Id = res_Id;
        Res_Name = res_Name;
        Res_Region = res_Region;
        Res_Contury = res_Contury;
        Res_Lati = res_Lati;
        Res_Longi = res_Longi;
        Res_Address = res_Address;
        Res_Tel = res_Tel;
        Res_WDay = res_WDay;
        Res_WEnd = res_WEnd;
        Res_Park = res_Park;
        Res_Kid = res_Kid;
        Res_Wheel = res_Wheel;
        Res_Pet = res_Pet;
        Res_Vegi = res_Vegi;
        Res_Halal = res_Halal;
        Res_GFree = res_GFree;
    }
    public int getRes_Id() {
        return Res_Id;
    }
    public void setRes_Id(int res_Id) {
        Res_Id = res_Id;
    }
    public String getRes_Name() {
        return Res_Name;
    }
    public void setRes_Name(String res_Name) {
        Res_Name = res_Name;
    }
    public String getRes_Region() {
        return Res_Region;
    }
    public void setRes_Region(String res_Region) {
        Res_Region = res_Region;
    }
    public String getRes_Contury() {
        return Res_Contury;
    }
    public void setRes_Contury(String res_Contury) {
        Res_Contury = res_Contury;
    }
    public double getRes_Lati() {
        return Res_Lati;
    }
    public void setRes_Lati(double res_Lati) {
        Res_Lati = res_Lati;
    }
    public double getRes_Longi() {
        return Res_Longi;
    }
    public void setRes_Longi(double res_Longi) {
        Res_Longi = res_Longi;
    }
    public String getRes_Address() {
        return Res_Address;
    }
    public void setRes_Address(String res_Address) {
        Res_Address = res_Address;
    }
    public String getRes_Tel() {
        return Res_Tel;
    }
    public void setRes_Tel(String res_Tel) {
        Res_Tel = res_Tel;
    }
    public String getRes_WDay() {
        return Res_WDay;
    }
    public void setRes_WDay(String res_WDay) {
        Res_WDay = res_WDay;
    }
    public String getRes_WEnd() {
        return Res_WEnd;
    }
    public void setRes_WEnd(String res_WEnd) {
        Res_WEnd = res_WEnd;
    }
    public int getRes_Park() {
        return Res_Park;
    }
    public void setRes_Park(int res_Park) {
        Res_Park = res_Park;
    }
    public int getRes_Kid() {
        return Res_Kid;
    }
    public void setRes_Kid(int res_Kid) {
        Res_Kid = res_Kid;
    }
    public int getRes_Wheel() {
        return Res_Wheel;
    }
    public void setRes_Wheel(int res_Wheel) {
        Res_Wheel = res_Wheel;
    }
    public int getRes_Pet() {
        return Res_Pet;
    }
    public void setRes_Pet(int res_Pet) {
        Res_Pet = res_Pet;
    }
    public int getRes_Vegi() {
        return Res_Vegi;
    }
    public void setRes_Vegi(int res_Vegi) {
        Res_Vegi = res_Vegi;
    }
    public int getRes_Halal() {
        return Res_Halal;
    }
    public void setRes_Halal(int res_Halal) {
        Res_Halal = res_Halal;
    }
    public int getRes_GFree() {
        return Res_GFree;
    }
    public void setRes_GFree(int res_GFree) {
        Res_GFree = res_GFree;
    }
    
    @Override
	public String toString() {
		return "RestaurantDto [Res_Id=" + Res_Id + ", Res_Name=" + Res_Name + ", Res_Region=" + Res_Region
				+ ", Res_Contury=" + Res_Contury + ", Res_Lati=" + Res_Lati + ", Res_Longi=" + Res_Longi
				+ ", Res_Address=" + Res_Address + ", Res_Tel=" + Res_Tel + ", Res_WDay=" + Res_WDay + ", Res_WEnd="
				+ Res_WEnd + ", Res_Park=" + Res_Park + ", Res_Kid=" + Res_Kid + ", Res_Wheel=" + Res_Wheel
				+ ", Res_Pet=" + Res_Pet + ", Res_Vegi=" + Res_Vegi + ", Res_Halal=" + Res_Halal + ", Res_GFree="
				+ Res_GFree + "]";
	}
	
}
