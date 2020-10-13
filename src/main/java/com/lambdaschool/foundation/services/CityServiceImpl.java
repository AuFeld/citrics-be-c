package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.CityIdName;
import com.lambdaschool.foundation.models.DSCity;
import com.lambdaschool.foundation.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Transactional
@Service(value = "cityService")
public class CityServiceImpl implements CityService
{
    /**
     * Connection to city repository
     */
    @Autowired
    private CityRepository cityrepo;

    @Autowired
    private CityService cityService;

    @Override
    public City pullCities() {

        // URL of the API we are accessing
        String requestURL = "http://citrics-ds.eba-jvvvymfn.us-east-1.elasticbeanstalk.com/7";
        //        String requestURL = "https://labs27-c-citrics-api.herokuapp.com/cities/all";
        /*
         * Creates the object that is needed to do a client side Rest API call.
         * WE are the client getting data from a remote API.
         */
        RestTemplate restTemplate = new RestTemplate();

        // telling our RestTemplate what format to expect, in this case Json
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        restTemplate.getMessageConverters()
            .add(converter);

        // create the responseType expected. In this case DSCity is the type
        ParameterizedTypeReference<DSCity> responseType = new ParameterizedTypeReference<>() {
        };
        ResponseEntity<DSCity> responseEntity = restTemplate.exchange(requestURL,
            HttpMethod.GET,
            null,
            responseType);
        DSCity ourCityData = responseEntity.getBody();
        cityService.saveDs(ourCityData);
        /**
         * Loop to fetch cities from DS API
         */
        //                for (int i = 1; i < 126; i++)
        //                {
        //                    // create responseEntity
        //                    ResponseEntity<DSCity> responseEntity = restTemplate.exchange(requestURL + i,
        //                        HttpMethod.GET,
        //                        null,
        //                        responseType);
        //
        //                    // print to the console
        //                    DSCity ourCityData = responseEntity.getBody();
        //
        ////                    cityService.saveDs(ourCityData);
        //                }
        return null;
    }

    /**
     * Find all cities in DB
     * @return list of Cities
     */
    @Override
    public List<City> findAll()
    {
        List<City> list = new ArrayList<>();

        cityrepo.findAll()
            .iterator()
            .forEachRemaining(list::add);

        return list;
    }

    /**
     * find city by cityid
     * @param id local id of city
     * @return City object matching the city id or
     * @throws ResourceNotFoundException
     */
    @Override
    public City findCityById(long id) throws ResourceNotFoundException
    {
        return cityrepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("City id " + id + " not found!"));
    }

    /**
     * Saves new city to DB
     * @param city new city to be saved
     * @return newly saved city
     */
    @Transactional
    @Override
    public City save(City city)
    {
        City newCity = new City();

        if(city.getCityid() != 0)
        {
            cityrepo.findById(city.getCityid()).orElseThrow(() -> new ResourceNotFoundException("City id " + city.getCityid() + " not found!"));
            newCity.setCityid(city.getCityid());
        }

        newCity.setCitynamestate(city.getCitynamestate());
        newCity.setPopulationdensityrating(city.getPopulationdensityrating());
        newCity.setSafteyratingscore(city.getSafteyratingscore());
        newCity.setCostoflivingscore(city.getCostoflivingscore());
        newCity.setAverageincome(city.getAverageincome());
        newCity.setAveragetemperature(city.getAveragetemperature());
        newCity.setLat(city.getLat());
        newCity.setLon(city.getLon());

        return cityrepo.save(newCity);
    }

    /**
     * Saves new city from DS API schema
     * @param city JSON City to be saved
     * @return newly saved City object
     */
    @Transactional
    @Override
    public City saveDs(DSCity city)
    {
        City c = new City();

        c.setCitynamestate(city.getCity());
        c.setPopulation(city.getPopulation());
        c.setAverageage(city.getMedian_age());
        c.setAveragehouseholdincome(city.getMedian_household_income());
        c.setAverageindividualincome(city.getMedian_individual_income());
        c.setAveragerentcost(city.getMedian_rent());
        c.setCostoflivingindex(city.getCost_of_Living_Index());

        return cityrepo.save(c);
    }

    /**
     * Find city by citynamestate
     * @param name citynamestate
     * @return city object match name or throws exception
     */
    @Override
    public City findByName(String name)
    {
        City c = cityrepo.findByCitynamestate(name);
        if (c == null)
        {
            throw new ResourceNotFoundException("City name " + name + " not found!");
        }
        return c;
    }

    @Override
    public List<CityIdName> findAllIds()
    {
        List<CityIdName> cities = new ArrayList<>();

        cityrepo.findAll().iterator().forEachRemaining((city) -> cities.add(new CityIdName(city.getCityid(), city.getCitynamestate())));

        return cities;
    }
}
