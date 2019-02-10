package com.factorymethod.pattern;

import com.factorymethod.bean.Car;

abstract public class MaruthiPlant {
	// factory method to standardized the procedure in creating the objects across
	// all the component family factories
	public Car newCar(String model) {
		Car car = null;
		car = createCar(model);
		System.out.println("assembling");
		System.out.println("painting");
		System.out.println("testing");
		return car;
	}

	abstract protected Car createCar(String model);

}
