

CREATE TABLE flight (
    flight_id INT AUTO_INCREMENT PRIMARY KEY,
    flight_name VARCHAR(255) NOT NULL,
	 flight_source VARCHAR(255),
	 flight_destination VARCHAR(255),
	 flight_fare INT,
    flight_date DATE ,  
    flight_time VARCHAR(255)   
)  ;

CREATE TABLE passanger (
    passenger_id INT AUTO_INCREMENT PRIMARY KEY,
    passenger_name VARCHAR(255) NOT NULL,
	 passenger_email VARCHAR(255) 
);

CREATE TABLE flight_passanger (
		flight_id INT,
    	passenger_id INT
   
);