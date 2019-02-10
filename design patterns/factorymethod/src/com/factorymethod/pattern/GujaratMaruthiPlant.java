package com.factorymethod.pattern;

import com.factorymethod.bean.AltoCar;
import com.factorymethod.bean.Car;
import com.factorymethod.bean.SwiftCar;

public class GujaratMaruthiPlant extends MaruthiPlant {
	@Override
	protected Car createCar(String model) {
		Car car = null;

		if (model.equals("alto")) {
			car = new AltoCar();
		} else if (model.equals("swift")) {
			car = new SwiftCar();
		}
		return car;
	}

}
