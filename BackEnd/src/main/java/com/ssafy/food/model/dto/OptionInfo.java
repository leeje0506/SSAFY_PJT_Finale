package com.ssafy.food.model.dto;

public class OptionInfo {
    String food;
    String address;
    String option1;
    String option2;
    
    public OptionInfo() {
    }

    public OptionInfo(String food, String address, String option1, String option2) {
        this.food = food;
        this.address = address;
        this.option1 = option1;
        this.option2 = option2;
    }

    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getOption1() {
        return option1;
    }
    public void setOption1(String option1) {
        this.option1 = option1;
    }
    public String getOption2() {
        return option2;
    }
    public void setOption2(String option2) {
        this.option2 = option2;
    }

    @Override
    public String toString() {
        return "OptionInfo [food=" + food + ", address=" + address + ", option1=" + option1 + ", option2=" + option2
                + "]";
    }

}
