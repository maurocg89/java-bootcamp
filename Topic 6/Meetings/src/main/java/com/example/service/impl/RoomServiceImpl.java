package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.model.Room;
import com.example.repository.RoomRepository;
import com.example.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{

	@Autowired
	@Qualifier("roomRepository")
	private RoomRepository roomRepository;

	@Override
	public Room addRoom(Room room) {
		return roomRepository.save(room);
	}

	@Override
	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}

	@Override
	public Room getRoomById(Long id) {
		return roomRepository.findOne(id);
	}

	@Override
	public String deleteRoom(Long id) {
		String message = "Deleted room id: " + id;
		try {
			roomRepository.delete(id);
		} catch (EmptyResultDataAccessException e) {
			message = "Room with id " + id + " doesn't exists";
		}
		return message;
	}

	@Override
	public Room updateRoom(Room room) {
		return roomRepository.save(room);
	}
	

}
