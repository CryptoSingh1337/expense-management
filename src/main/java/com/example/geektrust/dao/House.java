package com.example.geektrust.dao;

import com.example.geektrust.ResultStatus;
import com.example.geektrust.domain.HouseMate;

import java.util.HashMap;
import java.util.Map;

/**
 * author: CryptoSingh1337
 */
public class House {

    private final Map<String, HouseMate> houseMates;

    public House() {
        this.houseMates = new HashMap<>(3);
    }

    /**
     * This method adds a housemate in the house only if the house is not full.
     * @param houseMate - HouseMate object which represents a housemate
     * @return ResultStatus
     */
    public ResultStatus moveIn(HouseMate houseMate) {
        if (houseMates.size() < 3) // if the house is not full then add the member
            houseMates.put(houseMate.getName(), houseMate);
        return houseMates.containsKey(houseMate.getName()) ?
                ResultStatus.SUCCESS : ResultStatus.HOUSEFUL;
    }

    /**
     * This method removes a housemate from the house only if the dues are
     * clear and the member already exists.
     * @param name - Name of the existing housemate
     * @return ResultStatus
     */
    public ResultStatus moveOut(String name) {
        HouseMate houseMate = getHouseMate(name);
        if (houseMate == null) return ResultStatus.MEMBER_NOT_FOUND;
        // TODO: implement check for dues then only remove the member
        return ResultStatus.FAILURE;
    }

    /**
     * Helper method to get the housemate with the name
     * @param name - Name of the housemate
     * @return HouseMate
     */
    public HouseMate getHouseMate(String name) {
        return houseMates.getOrDefault(name, null);
    }

    public Map<String, HouseMate> getHouseMates() {
        return houseMates;
    }
}
