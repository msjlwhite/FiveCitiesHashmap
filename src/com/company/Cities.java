package com.company;

public class Cities {

    // Class Variables
    String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String displayCity(){
        return "City: " + getCityName() + "\n";
    }

}// end of Cities class
