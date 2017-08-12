package com.example.service;

import java.util.List;

import com.example.model.Meeting;

public interface MeetingService {
	public Meeting addMeeting(Meeting meeting);
	public Meeting updateMeeting(Meeting meeting);
	public String deleteMeeting(Long id);
	public List<Meeting> getAllMeetings();
	public Meeting getMeetingById(Long id);
}
