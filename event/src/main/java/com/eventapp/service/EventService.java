package com.eventapp.service;
import java.time.LocalDate;
import java.util.*;

import com.eventapp.entities.BookingResponse;
import com.eventapp.entities.Event;
import com.eventapp.entities.TicketBooking;
import com.eventapp.entities.TicketCancelResponse;
import com.eventapp.entities.TicketCancelling;
public interface EventService {

	
	public List<Event> getAllEvents();
	public Event getEventById(int eId);
	public Event getEventByName(String eName);
	public Event addEvent(Event event);
	public Event updateEvent(int eId,Event event);
	public Event deleteEvent(int eId);
	public BookingResponse bookTickets(TicketBooking request);
	public TicketCancelResponse canceltickets(TicketCancelling cancel);
	public List<Event> findByEventName(String eName);

}

