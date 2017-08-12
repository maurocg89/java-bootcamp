package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.model.Attendee;
import com.example.repository.AttendeeRepository;
import com.example.service.AttendeeService;

@Service
public class AttendeeServiceImpl implements AttendeeService {

	@Autowired
	@Qualifier("attendeeRepository")
	private AttendeeRepository attendeeRepository;

	@Override
	public Attendee addAttendee(Attendee attendee) {
		return attendeeRepository.save(attendee);
	}

	@Override
	public List<Attendee> getAllAttendees() {
		return attendeeRepository.findAll();
	}

	@Override
	public Attendee getAttendeeById(Long id) {
		return attendeeRepository.findOne(id);
	}

	@Override
	public String deleteAttendee(Long id) {
		String message = "Deleted attendee id: " + id;
		try {
			attendeeRepository.delete(id);
		} catch (EmptyResultDataAccessException e) {
			message = "Attendee with id " + id + " doesn't exists";
		}
		return message;
	}

	@Override
	public Attendee updateAttendee(Attendee attendee) {
		return attendeeRepository.save(attendee);
	}

}
