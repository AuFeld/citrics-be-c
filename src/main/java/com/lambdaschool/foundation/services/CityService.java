package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.DSCity;

import java.util.List;

public interface CityService
{
    /**
     * Find all cities
     * @return list of cities
     */
    List<City> findAll();

    /**
     * Finds city by cityid
     * @param id cityid
     * @return City matching id
     */
    City findCityById(long id);

    /**
     * Saves new city
     * @param city new city to be saved
     * @return newly saved City
     */
    City save(City city);

    /**
     * Saves new city from DS API schema
     * @param city new city to be saved
     * @return newly saved city
     */
    City saveDs(DSCity city);

    /**
     * Finds city by citynamestate field
     * @param name citystatename
     * @return City object matching name
     */
    City findByName(String name);
}
