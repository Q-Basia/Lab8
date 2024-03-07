package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * this gets size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    /**
     * This checks if the list has the city being specified
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity("Estevan"));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.getCount(), listSize + 1);
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize);
        assertFalse(list.hasCity("Estevan"));
    }

}