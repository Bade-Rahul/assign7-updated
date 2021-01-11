package com.eventapp.service;


import com.eventapp.entities.EventUser;

public interface EventUserService {
	
	public EventUser addUser(EventUser users);
	public EventUser findByUsername(String username);

}
