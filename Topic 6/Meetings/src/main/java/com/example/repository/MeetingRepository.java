package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Meeting;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
	
	public Meeting findById(Long id);
	
}
