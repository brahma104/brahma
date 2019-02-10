package com.ai.beans;

public class MonoReceiverImpl implements IReceiver {

	@Override
	public void receive(double frequency) {
		System.out.println("mono receiver receiving at frequency : " + frequency);
	}

}
