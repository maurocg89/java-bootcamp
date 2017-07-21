package com.globant.topic1.exercise7.model;

public class Song {

	private String path;
	private String name;
	private int duration;

	public Song(String path, String name, int duration) {
		this.path = path;
		this.name = name;
		this.duration = duration;
	}

	public Song(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return name;
	}

}
