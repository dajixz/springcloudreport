/**
 * 
 */
package com.daji.weather.service;

import java.util.ArrayList;
import java.util.List;

import com.daji.weather.vo.City;
import com.daji.weather.vo.WeatherResponse;
import org.springframework.stereotype.Component;


@Component
public class DataClientFallback implements DataClient {

	@Override
	public List<City> listCity() throws Exception {
		List<City> cityList = null;
		cityList = new ArrayList<>();
		
		City city = new City();
		city.setCityId("101280601");
		city.setCityName("深圳");
		cityList.add(city);
		
		city = new City();
		city.setCityId("101280301");
		city.setCityName("惠州");
		cityList.add(city);
		
		return cityList;
	}

	@Override
	public WeatherResponse getDataByCityId(String cityId) {
		return null;
	}

}
