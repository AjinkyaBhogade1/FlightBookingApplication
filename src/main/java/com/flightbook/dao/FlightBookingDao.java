package com.flightbook.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbook.model.Flight;

@Repository
public interface FlightBookingDao extends JpaRepository<Flight,Long> {

}
