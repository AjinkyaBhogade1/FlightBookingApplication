package com.flightbook.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.flightbook.model.Passanger;

public class FlightDTO {
	
	private Long flightId;
	
	
	private String flightName;
	
	private String flightSource;
	
	private String flightDestination;
	
	private Date flightDate;
	
	private Double flightFare;
	
	private String flightTime;
	
	private List<Passanger> passengerList=new ArrayList<Passanger>();

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public Double getFlightFare() {
		return flightFare;
	}

	public void setFlightFare(Double flightFare) {
		this.flightFare = flightFare;
	}

	public List<Passanger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passanger> passengerList) {
		this.passengerList = passengerList;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

}
