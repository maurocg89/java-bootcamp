package com.globant.topic1.exercise7.state;

public class PlayStateAudioPlayer implements StateAudioPlayer {

	public static final String PLAY_STATE = "Play";

	@Override
	public String getState() {
		return PLAY_STATE;
	}

}
