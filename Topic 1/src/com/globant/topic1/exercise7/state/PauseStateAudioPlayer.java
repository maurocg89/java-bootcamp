package com.globant.topic1.exercise7.state;

public class PauseStateAudioPlayer implements StateAudioPlayer {

	public static final String PAUSE_STATE = "Pause";

	@Override
	public String getState() {
		return PAUSE_STATE;
	}

}
