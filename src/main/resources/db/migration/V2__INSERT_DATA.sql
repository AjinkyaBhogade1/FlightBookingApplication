insert into flight (flight_id,flight_name,flight_source,flight_destination,flight_fare,flight_date,flight_time) 
  values(1,"Air India","Pune","Mumbai",40000,'2019-12-15','10:30'),
  (2,"Air Asia","Pune","Bali",170000,'2019-12-18','16:40');
  
  insert into passanger(passenger_id,passenger_name,passenger_email)
  values(1,"Ajinkya Bhogade","ajinkya.bhogade@gmail.com"),
  (2,"Ravina Bhogade","ravina.bhogade@gmail.com"),
  (3,"Tanmay Bhogade","tanmay.bhogade@gmail.com"),
  (4,"Ramakant Patil","Ramakant.Patil12@gmail.com"),
   (5,"Ram Dhole","ram.dhole@gmail.com"),
   (6,"Sachin patil","sachin.patil@gmail.com");
  
  insert into flight_passanger(flight_id,passenger_id)
  values(1,1),
  			(1,2),
            (1,4),
            (2,3),
            (2,5),
            (2,6);
  
  
  

