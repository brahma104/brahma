package com.ai.beans;

public class StereoReceiverImpl implements IReceiver {

	@Override
	public void receive(double frequency) {
		System.out.println("Stereo receiver receiving at frequency : " + frequency);
	}

}
