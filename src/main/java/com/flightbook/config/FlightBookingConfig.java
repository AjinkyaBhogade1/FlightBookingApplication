package com.flightbook.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.flightbook.interceptor.RequestHandleInterceptor;

@Configuration
public class FlightBookingConfig implements WebMvcConfigurer {
	
	@Autowired
	private RequestHandleInterceptor requestHandleInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestHandleInterceptor);
	}

}
