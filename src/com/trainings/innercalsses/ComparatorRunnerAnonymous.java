package com.trainings.innercalsses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorRunnerAnonymous {

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

		List<Car> carList = new ArrayList<>();
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		carList.add(c4);

		System.out.println(" Before Sorting.... " + carList); // 3 4 5 4

		Collections.sort(carList, new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {

				// return car1.getRating() - car2.getRating();
				return Integer.compare(car1.getRating(), car2.getRating());
			}
		});

		
		Collections.sort(carList, new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {

				// return car1.getRating() - car2.getRating();
				return Integer.compare(car1.getRating(), car2.getRating());
			}
		});

		
		
		Collections.sort(carList, new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {

				// return car1.getRating() - car2.getRating();
				return Integer.compare(car1.getRating(), car2.getRating());
			}
		});

		Collections.sort(carList, new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {

				// return car1.getRating() - car2.getRating();
				return Integer.compare(car1.getRating(), car2.getRating());
			}
		});

		System.out.println("Sorting by Rating.... " + carList); // Asc order 3 4 45

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

//class CarRatingComparator implements Comparator<Car> {
//
//	@Override
//	public int compare(Car car1, Car car2) {
//
//		// return car1.getRating() - car2.getRating();
//		return Integer.compare(car1.getRating(), car2.getRating());
//	}
//}
