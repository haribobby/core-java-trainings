package com.trainings.java8.functionalprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaRunner {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.setName("Swift");
		c1.setBrand("Maruti");
		c1.setPrice(1000.78);
		c1.setRating(3);

		Car c2 = new Car();
		c2.setName("Breeza");
		c2.setBrand("Maruti");
		c2.setPrice(10000.78);
		c2.setRating(4);

		Car c3 = new Car();
		c3.setName("B1");
		c3.setBrand("Benz");
		c3.setPrice(87878.78);
		c3.setRating(5);

		Car c4 = new Car();
		c4.setName("A8");
		c4.setBrand("Audi");
		c4.setPrice(68999.54);
		c4.setRating(4);

		Car c5 = new Car();
		c5.setName("A9");
		c5.setBrand("Audi XVI");
		c5.setPrice(168999.54);
		c5.setRating(1);

		List<Car> carList = new ArrayList<>();
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		carList.add(c4);
		carList.add(c5);

		System.out.println(" Before Sorting.... " + carList);
		
//		Comparator<T>

//		
		Collections.sort(carList, new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {

				return Integer.compare(car1.getRating(), car2.getRating());
			}
		});

		Collections.sort(carList, (car1, car2) -> Integer.compare(car1.getRating(), car2.getRating())); // Asc

		Collections.sort(carList, (car1, car2) -> Integer.compare(car1.getRating(), car2.getRating()));
//		Collections.sort(carList, Comparator.comparingInt(Car::getRating));

		System.out.println(" After Sorting.... " + carList);

	}

}

class Car {

	private String name;
	private String brand;
	private double price;
	private int rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", brand=" + brand + ", price=" + price + ", rating=" + rating + "]";
	}

}
