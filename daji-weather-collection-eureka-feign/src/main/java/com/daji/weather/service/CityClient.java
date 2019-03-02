package com.daji.weather.service;

import java.util.List;

import com.daji.weather.vo.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * City Client.
 * 
 * @since 1.0.0 2017年11月28日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@FeignClient("daji-weather-city-eureka")
public interface CityClient {
	
	@GetMapping("/cities")
	List<City> listCity() throws Exception;
}
