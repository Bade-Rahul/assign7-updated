package com.eventapp;



import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.eventapp.entities.Event;
import com.eventapp.entities.EventUser;
import com.eventapp.service.EventService;
import com.eventapp.service.EventUserService;

@Component
public class DataInitializer implements CommandLineRunner{

	@Autowired
	private EventService eService;
	
	@Autowired
	private EventUserService userService;
	@Override
	public void run(String... args) throws Exception {

		
		Event event1=new Event("bharanatyam", "hyderabad", 500.00, LocalDate.of(2021,Month.JANUARY,15), 15, 10);
		Event event2=new Event("Singing", "chennai", 500.00, LocalDate.of(2021,Month.JANUARY,16), 15, 25);
		Event event3=new Event("kuchapoodi", "banglore", 200.00, LocalDate.of(2021,Month.FEBRUARY,1), 10, 17);
		Event event4=new Event("ClassicalDance", "vijag", 700.00, LocalDate.of(2021,Month.MARCH,10), 15, 25);
		Event event5=new Event("kitefestival", "srikakulam", 550.00, LocalDate.of(2021,Month.APRIL,21), 10, 18);
		
		eService.addEvent(event1);
		eService.addEvent(event2);
		eService.addEvent(event3);
		eService.addEvent(event4);
		eService.addEvent(event5);
		
		
		EventUser users1=new EventUser("Rahul","rahul123",Arrays.asList("ROLE_ADMIN"));
		
		EventUser users2=new EventUser("umesh","umesh123",Arrays.asList("ROLE_CLERK"));
		
		userService.addUser(users1);
		userService.addUser(users2);
	}

}
