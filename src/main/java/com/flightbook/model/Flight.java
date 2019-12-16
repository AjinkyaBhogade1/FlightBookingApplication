package com.flightbook.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "flight")
public class Flight implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9002552969453318203L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flight_id")
	private Long flightId;
	
	@Column(name="flight_name")
	private String flightName;
	
	@Column(name="flight_source")
	private String flightSource;
	
	@Column(name="flight_destination")
	private String flightDestination;
	
	@Column(name="flight_date")
	private Date flightDate;
	
	@Column(name="flight_fare")
	private Double flightFare;
	
	@Column(name="flight_time")
	private String flightTime;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="flight_passanger",joinColumns = @JoinColumn(name="flight_id"),inverseJoinColumns = @JoinColumn(name="passenger_id"))
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
