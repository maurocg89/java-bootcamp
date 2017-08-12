package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Attendee;
import com.example.service.AttendeeService;

@RestController
public class AttendeeController {
	
	@Autowired
	@Qualifier("attendeeServiceImpl")
	AttendeeService attendeeService;

	@GetMapping("/attendees")
	public List<Attendee> getAllAttendees() {
		return attendeeService.getAllAttendees();
	}

	@GetMapping("/attendee/{id}")
	public Attendee getAttendee(@PathVariable("id") Long id) {
		return attendeeService.getAttendeeById(id);
	}

	@PostMapping("/attendee/add")
	public Attendee addAttendee(@RequestBody Attendee attendee) {
		return attendeeService.addAttendee(attendee);
	}
	
	@DeleteMapping("/attendee/{id}")
	public String deleteAttendee(@PathVariable("id") Long id) {
		String deleteMessage = "";
		try {
			deleteMessage = attendeeService.deleteAttendee(id);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
		return deleteMessage;	
	}
	
	@PostMapping("attendee/{id}")
	public Attendee updateAttendee(@PathVariable("id") Long id, @RequestBody Attendee attendee) {
		attendee.setId(id);
		return attendeeService.updateAttendee(attendee);
	}
	
}
