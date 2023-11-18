package com.ssafy.food.model.dto;

public class SearchCondition {
    private String word;
    private boolean con_Park;
    private boolean con_Kid;
    private boolean con_Wheel;
    private boolean con_Pet;
    private boolean con_Vegi;
    private boolean con_Halal;
    private boolean con_GFree;
   
    public SearchCondition() {
        
    }
   
    public SearchCondition(String word, boolean con_Park, boolean con_Kid, boolean con_Wheel, boolean con_Pet,
            boolean con_Vegi, boolean con_Halal, boolean con_GFree) {
        this.word = word;
        this.con_Park = con_Park;
        this.con_Kid = con_Kid;
        this.con_Wheel = con_Wheel;
        this.con_Pet = con_Pet;
        this.con_Vegi = con_Vegi;
        this.con_Halal = con_Halal;
        this.con_GFree = con_GFree;
    }
   
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public boolean isCon_Park() {
        return con_Park;
    }
    public void setCon_Park(boolean con_Park) {
        this.con_Park = con_Park;
    }
    public boolean isCon_Kid() {
        return con_Kid;
    }
    public void setCon_Kid(boolean con_Kid) {
        this.con_Kid = con_Kid;
    }
    public boolean isCon_Wheel() {
        return con_Wheel;
    }
    public void setCon_Wheel(boolean con_Wheel) {
        this.con_Wheel = con_Wheel;
    }
    public boolean isCon_Pet() {
        return con_Pet;
    }
    public void setCon_Pet(boolean con_Pet) {
        this.con_Pet = con_Pet;
    }
    public boolean isCon_Vegi() {
        return con_Vegi;
    }
    public void setCon_Vegi(boolean con_Vegi) {
        this.con_Vegi = con_Vegi;
    }
    public boolean isCon_Halal() {
        return con_Halal;
    }
    public void setCon_Halal(boolean con_Halal) {
        this.con_Halal = con_Halal;
    }
    public boolean isCon_GFree() {
        return con_GFree;
    }
    public void setCon_GFree(boolean con_GFree) {
        this.con_GFree = con_GFree;
    }
    
}
