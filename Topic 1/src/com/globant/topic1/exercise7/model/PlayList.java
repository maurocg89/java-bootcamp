package com.globant.topic1.exercise7.model;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	private List<Song> songs;

	public PlayList() {
		this.songs = new ArrayList<>();
	}

	public PlayList(List<Song> songs) {
		this.songs = songs;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public void addSong(Song song) {
		songs.add(song);
		System.out.println(song + " added to the playlist");
	}

	public void removeSong(Song song) {
		if (songs.isEmpty()) {
			System.out.println("The playlist is empty");
		} else if (songs.contains(song)) {
			System.out.println("The song " + song + " was removed");
		} else {
			System.out.println("The song " + song + " is not in the playlist");
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PlayList songs: \n");
		int i = 1;
		for (Song song : songs) {
			sb.append(i);
			sb.append(")");
			sb.append(song);
			sb.append("\n");
			i++;
		}
		return sb.toString();
	}

}
