package com.globant.topic1.exercise7.model;

import com.globant.topic1.exercise7.state.State;

public class AudioPlayer {

	// Fields
	private State currentState;
	private PlayList playlist;
	private Song currentSong;

	// Constructors
	public AudioPlayer() {
		this.currentState = State.STOP;
	}

	public AudioPlayer(PlayList playlist) {
		this.playlist = playlist;
		this.currentState = State.STOP;
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
		if (playlist != null && playlist.getSongs().contains(currentSong)) {
			this.currentSong = currentSong;
		} else {
			System.out.println("You need to select a song from the playlist");
		}
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	// End of getters and setters

	public void play() {
		// If there isn't a playlist added to the audio player doesn't start
		if (playlist == null || playlist.getSongs().isEmpty()) {
			System.out.println("You need to add a playlist to your audio player");
			setCurrentState(State.STOP);
			return;
		}

		// if is not set manually, set the current song to the first song in the
		// playlist
		if (currentSong == null) {
			currentSong = playlist.getSongs().get(0);
		}

		// If the audio player is in pause state, resume the current song
		// else play the current song
		if (State.PAUSE.equals(currentState)) {
			System.out.println("Resuming " + currentSong);
			setCurrentState(State.PLAY);
		} else {
			System.out.println("Playing " + currentSong);
			setCurrentState(State.PLAY);
		}
	}

	public void pause() {
		if (State.PLAY.equals(currentState)) {
			System.out.println("Paused " + currentSong);
			setCurrentState(State.PAUSE);
		} else if (State.PAUSE.equals(currentState)) {
			System.out.println("Resuming " + currentSong);
			setCurrentState(State.PLAY);
		}
	}

	public void stop() {
		System.out.println("AudioPlayer is stopped");
		setCurrentState(State.STOP);
	}
	
	public void tryAudioPlayerRandom() {
		if (hasPlaylist(playlist)) {
			boolean on = true;
			int random;
			int songNumber;
		
			while (on) {
				random = (int) (Math.random() * 20);
				if (random < 10) {
					if (!State.PAUSE.equals(getCurrentState())) {
						songNumber = (int) (Math.random() * (playlist.getSongs().size() - 1));
						currentSong = playlist.getSongs().get(songNumber);
					}
					play();

				} else if (random >= 10 && random < 17) {
					pause();

				} else {
					stop();
					on = false;
				}
			}
		}
	}

	public boolean hasPlaylist(PlayList playList) {
		return playList != null && !playList.getSongs().isEmpty(); 
	}

}
