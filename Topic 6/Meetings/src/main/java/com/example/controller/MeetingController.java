package com.example.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Attendee;
import com.example.model.Meeting;
import com.example.service.MeetingService;

@RestController
public class MeetingController {

	private static final Log LOGGER = LogFactory.getLog(MeetingController.class);

	@Autowired
	@Qualifier("meetingServiceImpl")
	private MeetingService meetingService;

	@RequestMapping("")
	public String redirectTolist() {
		return "redirect:/meetings";
	}

	@GetMapping("/meetings")
	public List<Meeting> getAllMeetings() {
		return meetingService.getAllMeetings();
	}

	@GetMapping("/meeting/{id}")
	public Meeting getMeeting(@PathVariable("id") Long id) {
		return meetingService.getMeetingById(id);
	}

	// Values of the meeting object are in the body of the post method, in a
	// json format
	// {
	// "room": { "id": 1},
	// "timeSlot": "15 - 16",
	// "description": "desc" "
	// }
	@PostMapping("/meeting/add")
	public Meeting addMeeting(@RequestBody Meeting meeting) {
		return meetingService.addMeeting(meeting);
	}

	@DeleteMapping("/meeting/{id}")
	public String deleteMeeting(@PathVariable("id") Long id) {
		return meetingService.deleteMeeting(id);
	}

	@PostMapping("meeting/{id}")
	public Meeting updateMeeting(@PathVariable("id") Long id, @RequestBody Meeting meeting) {
		meeting.setId(id);
		LOGGER.info(meeting);
		return meetingService.updateMeeting(meeting);
	}

	@GetMapping("meeting/{id}/attendees")
	public List<Attendee> attendeesByMeeting(@PathVariable("id") Long idMeeting) {
		Meeting meeting = meetingService.getMeetingById(idMeeting);
		return meeting.getAttendees();
	}

}
