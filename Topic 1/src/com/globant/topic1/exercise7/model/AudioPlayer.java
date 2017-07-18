package com.globant.topic1.exercise7.model;

import com.globant.topic1.exercise7.state.PauseStateAudioPlayer;
import com.globant.topic1.exercise7.state.PlayStateAudioPlayer;
import com.globant.topic1.exercise7.state.StateAudioPlayer;
import com.globant.topic1.exercise7.state.StopStateAudioPlayer;

public class AudioPlayer {

	// Fields
	private StateAudioPlayer currentState;
	private PlayList playlist;
	private Song currentSong;

	// Constructors
	public AudioPlayer() {
		this.currentState = new StopStateAudioPlayer();
	}

	public AudioPlayer(PlayList playlist) {
		this.playlist = playlist;
		this.currentState = new StopStateAudioPlayer();
	}

	// Getters and Setters
	public PlayList getPlaylist() {
		return playlist;
	}

	public void setPlaylist(PlayList playlist) {
		this.playlist = playlist;
	}

	public Song getCurrentSong() {
		return currentSong;
	}

	public void setCurrentSong(Song currentSong) {
		this.currentSong = currentSong;
	}

	public StateAudioPlayer getCurrentState() {
		return currentState;
	}

	public void setCurrentState(StateAudioPlayer currentState) {
		this.currentState = currentState;
	}
	// End of getters and setters

	// If the audio player is in pause state, resume the current song
	// else try to play a song or a playlist added to the AP
	public void play() {
		if (currentState.getState().equals(PauseStateAudioPlayer.PAUSE_STATE)) {
			System.out.println("Playing " + currentSong);
			setCurrentState(new PlayStateAudioPlayer());
		} else {
			if (currentSong != null) {
				System.out.println("Playing " + currentSong);
				setCurrentState(new PlayStateAudioPlayer());
			} else if (playlist != null && !playlist.getSongs().isEmpty()) {
				playlist.getSongs().forEach(song -> System.out.println("Playing " + song));
				setCurrentState(new PlayStateAudioPlayer());
			} else {
				System.out.println("You need to add a playlist or a song to the AudioPlayer");
				setCurrentState(new StopStateAudioPlayer());
			}
		}
	}

	public void pause() {
		System.out.println("AudioPlayer is paused in song: " + currentSong);
		setCurrentState(new PauseStateAudioPlayer());
	}

	public void stop() {
		System.out.println("AudioPlayer is stopped");
		setCurrentState(new StopStateAudioPlayer());
		setCurrentSong(null);
	}

}
