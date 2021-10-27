package com.trainings.oops.interfacee;

interface ICar { // Specification

	void startEngine();

	void accelerate();

	void applyBrakes();
}

interface IManualCar {
	void changeGear();
}

class BMW implements ICar, IManualCar {

	@Override
	public void startEngine() {

	}

	@Override
	public void accelerate() {

	}

	@Override
	public void applyBrakes() {

	}

	@Override
	public void changeGear() {

	}
}

class Tata implements ICar {

	@Override
	public void startEngine() {

	}

	@Override
	public void accelerate() {

	}

	@Override
	public void applyBrakes() {

	}

}