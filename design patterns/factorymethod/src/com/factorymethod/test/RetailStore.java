package com.factorymethod.test;

import com.factorymethod.bean.Car;
import com.factorymethod.pattern.GujaratMaruthiPlant;
import com.factorymethod.pattern.GurgoanMaruthiPlant;
import com.factorymethod.pattern.MaruthiPlant;

public class RetailStore {
	public static void main(String[] args) {
		Car car = null;
		MaruthiPlant maruthiPlant = null;
		
		maruthiPlant = new GujaratMaruthiPlant();
		car = maruthiPlant.newCar("alto");
		car.drive();
		
		maruthiPlant = new GurgoanMaruthiPlant();
		car = maruthiPlant.newCar("ciaz");
		car.drive();
	}
}
