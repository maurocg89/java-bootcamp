package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Room;
import com.example.service.RoomService;

@RestController
public class RoomController {

	@Autowired
	@Qualifier("roomServiceImpl")
	private RoomService roomService;

	@GetMapping("/rooms")
	public List<Room> getAllRooms() {
		return roomService.getAllRooms();
	}

	@GetMapping("/room/{id}")
	public Room getRoom(@PathVariable("id") Long id) {
		return roomService.getRoomById(id);
	}

	@PostMapping("/room/add")
	public Room addRoom(@RequestBody Room room) {
		return roomService.addRoom(room);
	}

	@DeleteMapping("/room/{id}")
	public String deleteRoom(@PathVariable("id") Long id) {
		return roomService.deleteRoom(id);

	}

	@PostMapping("room/{id}")
	public Room updateRoom(@PathVariable("id") Long id, @RequestBody Room room) {
		room.setId(id);
		return roomService.updateRoom(room);
	}

}
