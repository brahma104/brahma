package com.factorymethod.pattern;

import com.factorymethod.bean.BalenoCar;
import com.factorymethod.bean.Car;
import com.factorymethod.bean.CiazCar;

public class GurgoanMaruthiPlant extends MaruthiPlant {

	@Override
	protected Car createCar(String model) {
		Car car = null;

		if (model.equals("baleno")) {
			car = new BalenoCar();
		} else if (model.equals("ciaz")) {
			car = new CiazCar();
		}
		return car;
	}

}
