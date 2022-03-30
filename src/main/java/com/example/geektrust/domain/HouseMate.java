package com.example.geektrust.domain;

import com.example.geektrust.dao.House;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author: CryptoSingh1337
 */
public class HouseMate {

    private String name;
    private final Map<String, Integer> dues;
    private final House house;

    public HouseMate(House house, String name) {
        this.house = house;
        this.name = name;
        this.dues = new HashMap<>(2);
        this.house.getHouseMates().forEach((a, b) -> dues.put(a, 0));
    }

    public String spend(Integer amount, List<String> houseMates) {
        // TODO: implement the logic to split the amount according the size of the housemates list
        return null;
    }

    public String clearDues(Integer amount, String name) {
        // TODO: implement the logic to clear all the dues of the current housemate and to the member who lent
        return null;
    }

    public String dues() {
        // TODO: display all the dues of the current member
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
