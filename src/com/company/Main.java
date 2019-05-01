/*
Author: J White
Date: 4/30/2019
Task: Create a HashMap that takes in a city as the key and corresponding state as its value.

Enter in a list of 5 cities you would like to visit.
Be able to get the key-value pairs individually
Be able to print the list of 5 cities and corresponding states using a loop.
Remove a key value pair
Overwrite a value using the same key.

 */

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Class object declaration
        Cities city1 = new Cities();
        Cities city2 = new Cities();
        Cities city3 = new Cities();
        Cities city4 = new Cities();
        Cities city5 = new Cities();

        States state1 = new States();
        States state2 = new States();
        States state3 = new States();
        States state4 = new States();
        States state5 = new States();

        // creating lists for City and State
        List <Cities> cityList = new ArrayList<>();
        List <States> stateList = new ArrayList<>();

        // setting city names
        city1.setCityName("New Orleans");
        city2.setCityName("Las Vegas");
        city3.setCityName("Honolulu");
        city4.setCityName("Atlanta");
        city5.setCityName("Little Rock");

        // setting states
        state1.setStateAbbr("AZ");
        state2.setStateAbbr("GA");
        state3.setStateAbbr("HI");
        state4.setStateAbbr("LA");
        state5.setStateAbbr("NV");

        // adding cities to the list
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);
        cityList.add(city5);

        // adding states to the list
        stateList.add(state1);
        stateList.add(state2);
        stateList.add(state3);
        stateList.add(state4);
        stateList.add(state5);

//        Hashmap creation -- MUST BE A CLASS "OBJECT" TO USE MAP/HASHMAP
       HashMap<Cities,States> travelMap = new HashMap<>();

        for (int i = 0; i < cityList.size(); i++) {

            travelMap.put(cityList.get((i)),stateList.get(i));
//            System.out.println(cityList);
//            System.out.println(travelMap.values());
//            System.out.println(travelMap.keySet());
//            System.out.println(travelMap.entrySet().);
        }

//        for (Cities aCity: travelMap.keySet()){
//            String key = aCity.displayCity().toString();
////            String value = travelMap.get().toString();
//            System.out.println(key); // + " " + value);
//        }
//
//        for (States aState: travelMap.values()){
//            String value = aState.displayState().toString();
////            String value = travelMap.get(aState).toString();
//            System.out.println(value); // + " " + value);
//        }

        for (Cities aCity: travelMap.keySet()){
            String key = aCity.displayCity().toString();

            for (States aState : travelMap.values()) {
                String value = aState.displayState();
                System.out.println(key + " " + value);
            }
        }


//        Be able to get the key-value pairs individually


//        Be able to print the list of 5 cities and corresponding states using a loop.
//        for (int i = 0; i < travelMap.size(); i++) {
//
//            System.out.println(city);
//
//        }



//        Remove a key value pair



//        Overwrite a value using the same key.

    }// end of Main method


}// end of class
