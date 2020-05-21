package org.yanse.springbootmybatis01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yanse.springbootmybatis01.mapper.CityMapper;
import org.yanse.springbootmybatis01.model.City;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;
    public List<City> getAllCitys() {
        return cityMapper.selectAll();

    }
}
