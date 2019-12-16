package com.flightbook.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbook.dao.FlightBookingDao;
import com.flightbook.model.Flight;
import com.flightbook.service.FlightBookingService;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

	@Autowired
	private FlightBookingDao flightBookingDao;
	
	@Override
	public Flight getFlightDetailsById(Long id) {
		
		return flightBookingDao.getOne(id);
	}

}
