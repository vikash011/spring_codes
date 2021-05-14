package com.nit.service;

public class ShowRoom {

	public String sellCar(String custName, String model, double price) {
		System.out.println("ShowRoom.sellCar()--started");

		if (model.equalsIgnoreCase("baleno")) {
			return custName + " buys car of model " + model + " of " + price;
		} else {
			return custName + " buys car of model " + model + " of " + price;
		}

	}

}
