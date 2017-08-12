package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="meeting")
public class Meeting {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	// Each meeting may have no, one or many Attendee entities
	@OneToMany(mappedBy="meeting", cascade={CascadeType.ALL})
	@JsonManagedReference // to avoid infinite recursion
	private List<Attendee> attendees;
	
	// many meetings -> one room. One room can have many meetings
	@ManyToOne
	@JoinColumn(name="room_id")
	@JsonBackReference // to avoid infinite recursion
	private Room room;
	
	@Column(name="time_slot")
	private String timeSlot;
	
	@Column(name="description")
	private String description;

	public Meeting(Room room, String timeSlot, String description) {
		this.room = room;
		this.timeSlot = timeSlot;
		this.description = description;
	}

	public Meeting() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Attendee> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", attendees=" + attendees + ", room=" + room + ", timeSlot=" + timeSlot
				+ ", description=" + description + "]";
	}
	
	
	
	
	
	
}
