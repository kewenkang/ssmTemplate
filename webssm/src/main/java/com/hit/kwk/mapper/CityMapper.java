package com.hit.kwk.mapper;

import com.hit.kwk.dao.City;
import org.springframework.stereotype.Repository;

@Repository("cityMapper")
public interface CityMapper {
    City getCityByID(String ID);
}
