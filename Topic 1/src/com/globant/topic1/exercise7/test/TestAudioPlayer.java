package com.globant.topic1.exercise7.test;

import com.globant.topic1.exercise7.model.AudioPlayer;
import com.globant.topic1.exercise7.model.PlayList;
import com.globant.topic1.exercise7.model.Song;

public class TestAudioPlayer {
	public static void main(String[] args) {
		
		PlayList playlist = new PlayList();
		PlayList playlist2 = new PlayList();
		AudioPlayer player = new AudioPlayer();
		Song song1 = new Song("path", "Song 1", 120);
		Song song2 = new Song("path", "Song 2", 120);
		Song song3 = new Song("path", "Song 3", 120);
		Song song4 = new Song("path", "Song 4", 120);
		
		playlist.addSong(song1);
		playlist.addSong(song2);
		playlist.addSong(song3);
		System.out.println(playlist);
		player.setCurrentSong(song4);
		player.play();
		player.pause();
		player.setPlaylist(playlist);
		player.play();
		player.stop();
		player.play();
		
	
		
	}
}
