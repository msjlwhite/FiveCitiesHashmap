package com.company;

public class States {

    // Class Variables
    String stateAbbr;

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String displayState(){
        return "State: " + getStateAbbr() + "\n";
    }

}// end of class States
