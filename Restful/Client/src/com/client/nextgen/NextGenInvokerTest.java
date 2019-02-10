package com.client.nextgen;

import com.nextgen.dto.AvailableTrains;

public class NextGenInvokerTest {
	public static void main(String[] args) {
		NextGenInvoker ngInvoker = new NextGenInvoker();
		AvailableTrains aTrains = ngInvoker.getTrainsBetweenStations("hyderabad", "banglore");
		System.out.println(aTrains);
	}

}
