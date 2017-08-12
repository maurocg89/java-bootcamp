package com.example.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.model.Meeting;
import com.example.repository.MeetingRepository;
import com.example.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService{

	private static final Log LOG = LogFactory.getLog(MeetingServiceImpl.class);
	
	@Autowired
	@Qualifier("meetingRepository")
	private MeetingRepository meetingRepository;
	
	@Override
	public Meeting addMeeting(Meeting meeting) {
		return meetingRepository.save(meeting);
	}

	@Override
	public Meeting updateMeeting(Meeting meeting) {
		LOG.info(meeting);
		return meetingRepository.save(meeting);
	}

	@Override
	public String deleteMeeting(Long id) {
		String message = "Deleted meeting id: " + id;
		try {
			meetingRepository.delete(id);
		} catch (EmptyResultDataAccessException e) {
			message = "Meeting with id " + id + " doesn't exists";
		}
		
		return message;
	}

	@Override
	public List<Meeting> getAllMeetings() {
		return meetingRepository.findAll();
	}

	@Override
	public Meeting getMeetingById(Long id) {
		return meetingRepository.findById(id);
	}
	
}
