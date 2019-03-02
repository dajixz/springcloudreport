package com.daji.weather.controller;

import com.daji.weather.service.CityClient;
import com.daji.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private CityClient cityClient;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/list")
    public void getCities(){
        try {
            List<City> citi = cityClient.listCity();
            System.out.println(citi);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
