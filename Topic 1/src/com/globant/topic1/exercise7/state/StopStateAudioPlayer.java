package com.globant.topic1.exercise7.state;

public class StopStateAudioPlayer implements StateAudioPlayer {

	public static final String STOP_STATE = "Stop";

	@Override
	public String getState() {
		return STOP_STATE;
	}

}
