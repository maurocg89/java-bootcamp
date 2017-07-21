package com.globant.topic1.exercise7.test;

import com.globant.topic1.exercise7.model.AudioPlayer;
import com.globant.topic1.exercise7.model.PlayList;
import com.globant.topic1.exercise7.model.Song;

public class TestAudioPlayer {
	public static void main(String[] args) {

		PlayList playlist = new PlayList();
		AudioPlayer player = new AudioPlayer();
		Song song1 = new Song("path", "Song 1", 120);
		Song song2 = new Song("path", "Song 2", 120);
		Song song3 = new Song("path", "Song 3", 120);
		Song song4 = new Song("path", "Song 4", 120);
		Song song5 = new Song("path", "Song 5", 120);
		Song song6 = new Song("path", "Song 6", 120);
		Song song7 = new Song("path", "Song 7", 120);
		Song song8 = new Song("path", "Song 8", 120);

		playlist.addSong(song1);
		playlist.addSong(song2);
		playlist.addSong(song3);
		playlist.addSong(song4);
		playlist.addSong(song5);
		playlist.addSong(song6);
		playlist.addSong(song7);
		playlist.addSong(song8);
		System.out.println(playlist);
		player.play(); // error: playlist is not added in the audio player
		player.setPlaylist(playlist);
		player.tryAudioPlayerRandom();

	}
}
