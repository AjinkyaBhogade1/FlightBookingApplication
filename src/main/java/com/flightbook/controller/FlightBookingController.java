package com.flightbook.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbook.dto.FlightDTO;
import com.flightbook.exception.InvalidInputException;
import com.flightbook.model.Flight;
import com.flightbook.service.FlightBookingService;

@RestController
@RequestMapping("/flights")
public class FlightBookingController {
	
	@Autowired
	private FlightBookingService flightBookingService;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	@GetMapping("getflightDetails/{id}")
	public FlightDTO getFlightDetails(@PathVariable String id) {
		Flight flight=flightBookingService.getFlightDetailsById(Long.parseLong(id.split("_")[2]));
		
		if(flight==null) {
		 throw new InvalidInputException("Record not found");
		}
		return convertToDto(flight);
		
	}
	
	private FlightDTO convertToDto(Flight flight) {
		FlightDTO flightDTO=modelMapper.map(flight, FlightDTO.class);
		return flightDTO;
	}
	//privat fl
	/*
	 * private FlightDTO convertToDto(Flight flight) throws pasrsee {     FlightDTO
	 * flightDTO = modelMapper.map(flight, FlightDTO.class);     return flightDTO; }
	 */

}
