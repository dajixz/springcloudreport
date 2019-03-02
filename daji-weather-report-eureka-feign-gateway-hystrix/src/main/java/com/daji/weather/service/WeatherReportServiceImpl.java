package com.daji.weather.service;

import java.util.ArrayList;
import java.util.List;

import com.daji.weather.vo.Forecast;
import com.daji.weather.vo.Weather;
import com.daji.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月26日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

	@Autowired
	private DataClient dataClient;

	@Override
	public Weather getDataByCityId(String cityId) {
        WeatherResponse resp = dataClient.getDataByCityId(cityId);
		Weather data = null;
		if (resp != null ) {
			resp.getData();
		}
		return data;
	}

}
