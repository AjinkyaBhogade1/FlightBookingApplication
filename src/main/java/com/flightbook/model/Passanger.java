package com.flightbook.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passanger")
public class Passanger implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4786077427930877670L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="passenger_id")
	private Long passengerId;
	
	@Column(name="passenger_name")
	private String passengerName;
	
	@Column(name="passenger_email")
	private String passengerEmail;
	
	/*
	 * @ManyToOne private Flight flight;
	 */

	public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	/*
	 * public Flight getFlight() { return flight; }
	 * 
	 * public void setFlight(Flight flight) { this.flight = flight; }
	 */

}
