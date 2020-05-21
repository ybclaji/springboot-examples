package org.yanse.springbootmybatis01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yanse.springbootmybatis01.model.City;
import org.yanse.springbootmybatis01.service.CityService;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    CityService cityService;
    @GetMapping("/hello")
    public List<City> getAllCitys() {
        return cityService.getAllCitys();
    }
}
