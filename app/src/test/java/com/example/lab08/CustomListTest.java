package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        // make sure the city is there
        assertTrue(list.hasCity(edmonton));
        // delete the city
        list.deleteCity(edmonton);
        // make sure the city is not there
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public  void testCountCities(){
        CustomList list = new CustomList();
        City vacouver = new City("Vancouver", "BC");
        City toronto = new City("Toronto", "ON");

        // add cities to list
        list.addCity(vacouver);
        list.addCity(toronto);

        // check that there are 2 cities in list
        assertEquals(2, list.countCities());

        // delete a city
        list.deleteCity(toronto);

        // check that it still works after deleting city
        assertEquals(1, list.countCities());
    }

}
