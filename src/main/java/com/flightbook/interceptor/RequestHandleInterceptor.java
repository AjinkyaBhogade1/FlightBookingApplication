package com.flightbook.interceptor;

import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.flightbook.exception.InvalidInputException;

@Component
public class RequestHandleInterceptor extends HandlerInterceptorAdapter {
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		final Map<String, String> pathVariables = (Map<String, String>) request
                    .getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

		String id=pathVariables.get("id");
		if(!Pattern.matches("(FL_)[a-zA-Z]{1,}(_)[0-9]{1}",id)) {
			throw new InvalidInputException("Flight Id does not match");
		}
		
		return super.preHandle(request, response, handler);
	}

}
