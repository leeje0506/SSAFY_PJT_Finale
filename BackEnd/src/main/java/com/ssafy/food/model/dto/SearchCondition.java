package com.ssafy.food.model.dto;

public class SearchCondition {
    private String word;
    private int con_Park;
    private int con_Kid;
    private int con_Wheel;
    private int con_Pet;
    private int con_Vegi;
    private int con_Halal;
    private int con_GFree;
   
    public SearchCondition() {
        
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCon_Park() {
        return con_Park;
    }

    public void setCon_Park(int con_Park) {
        this.con_Park = con_Park;
    }

    public int getCon_Kid() {
        return con_Kid;
    }

    public void setCon_Kid(int con_Kid) {
        this.con_Kid = con_Kid;
    }

    public int getCon_Wheel() {
        return con_Wheel;
    }

    public void setCon_Wheel(int con_Wheel) {
        this.con_Wheel = con_Wheel;
    }

    public int getCon_Pet() {
        return con_Pet;
    }

    public void setCon_Pet(int con_Pet) {
        this.con_Pet = con_Pet;
    }

    public int getCon_Vegi() {
        return con_Vegi;
    }

    public void setCon_Vegi(int con_Vegi) {
        this.con_Vegi = con_Vegi;
    }

    public int getCon_Halal() {
        return con_Halal;
    }

    public void setCon_Halal(int con_Halal) {
        this.con_Halal = con_Halal;
    }

    public int getCon_GFree() {
        return con_GFree;
    }

    public void setCon_GFree(int con_GFree) {
        this.con_GFree = con_GFree;
    }

    @Override
    public String toString() {
        return "SearchCondition [word=" + word + ", con_Park=" + con_Park + ", con_Kid=" + con_Kid + ", con_Wheel="
                + con_Wheel + ", con_Pet=" + con_Pet + ", con_Vegi=" + con_Vegi + ", con_Halal=" + con_Halal
                + ", con_GFree=" + con_GFree + "]";
    }
   
   
    
}
