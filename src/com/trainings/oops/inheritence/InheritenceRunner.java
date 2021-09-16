package com.trainings.oops.inheritence;

abstract class Vehicle {
	

	private String registrationNumber;
	private double price;
	private String color;
	private String engine; // petrol/diesel/automatic


	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public abstract void start();

	public abstract void accelerate();

	public abstract void applyBreak();


	

}


abstract class Car extends Vehicle { // Car is vehice

	
	private int numberOfDoors;
	private String steering;
	private String airConditioner;
	private String musicSystem;
	
	public String getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(String airConditioner) {
		this.airConditioner = airConditioner;
	}

	

	public abstract void reverse();

}

abstract class MotorBike extends Vehicle { // Bike is a vechicle

	private String handle;

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}
	
	

}

class TataHarrier extends Car {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void start() {
		System.out.println("The" + name + " is starting");

	}

	@Override
	public void accelerate() {
		System.out.println("the car is accelerating.");
	}


	@Override
	public void reverse() {
		System.out.println("Reversing this car...");

	}

	@Override
	public void applyBreak() {
		System.out.println("Slow done the car...");

	}


}

class Scooty extends MotorBike {

	private String name;

	public Scooty(String name) {
		this.name = name;
	}

	@Override
	public void start() {
		System.out.println("The" + name + " is starting");

	}

	@Override
	public void accelerate() {
		System.out.println(name + " is accelerating.");
	}

	@Override
	public void applyBreak() {
		System.out.println("Slow done the Bike...");

	}

}

public class InheritenceRunner {

	public static void main(String[] args) {

		Car th = new TataHarrier();
		th.setColor("White");
		th.setEngine("Petrol");
//		th.start();
//		th.accelerate();
		
		
		System.out.println(th);
		System.out.println("color is : " +th.getColor());
		System.out.println("Engine is : " +th.getEngine());
		System.out.println("MS is : " +th.getMusicSystem());
		
		
//		MotorBike bike = new Scooty("Duo");
//		bike.start();
//		bike.accelerate();
		

	}

}

//
//class Engine {
//  public void start() {}
//  public void rev() {}
//  public void stop() {}
//}
