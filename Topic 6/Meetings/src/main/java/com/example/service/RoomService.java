package com.example.service;

import java.util.List;

import com.example.model.Room;

public interface RoomService {
	
	public Room addRoom(Room room);
	public List<Room> getAllRooms();
	public Room getRoomById(Long id);
	public String deleteRoom(Long id);
	public Room updateRoom(Room room);
	
}
