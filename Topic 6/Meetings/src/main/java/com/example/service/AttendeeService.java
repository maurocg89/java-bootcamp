package com.example.service;

import java.util.List;

import com.example.model.Attendee;

public interface AttendeeService {

	public List<Attendee> getAllAttendees();
	public Attendee getAttendeeById(Long id);
	public Attendee addAttendee(Attendee attendee);
	public String deleteAttendee(Long id);
	public Attendee updateAttendee(Attendee attendee);
	

}
