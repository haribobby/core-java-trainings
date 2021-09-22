package com.trainings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorRunner {

	public static void main(String[] args) {
		
//		
//		int arr[] = new int[5];
//		arr[0] = 98;
//		arr[1] = 56;
//		arr[2] = 96;
//		arr[3] = 1;
//		arr[4] = 7;
//		
//		System.out.println(arr[0]);
//		
//		Arrays.sort(arr);
//		
//		System.out.println(arr[0]);
		

		
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
		
		
		System.out.println(" Before Sorting.... "+ carList); // 3 4 5 4 
		
		Collections.sort(carList, new CarRatingComparator().reversed()); 
		
		System.out.println("Sorting by Rating.... "+ carList); // Desc order 5 4 4 3
		
		
		Collections.sort(carList, new CarBrandComparator()); 
		
		System.out.println("Sorting by Brand.... "+ carList); // A B M M
		
		
		Collections.sort(carList, new CarPriceComparator()); 
		
		System.out.println("Sorting by Price.... "+ carList); // A B M M
		
		
		// Sort by price and rating

		Collections.sort(carList, new CarPriceComparator().thenComparing(new CarRatingComparator()));
		
		System.out.println("Sorting by Price and rating .... "+ carList);
		
	}

}

class Car{

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


class CarPriceComparator implements Comparator<Car>
{

	@Override
	public int compare(Car car1, Car car2) {
		
		return Double.compare(car1.getPrice(), car2.getPrice());
	}
}



class CarRatingComparator implements Comparator<Car>
{

	@Override
	public int compare(Car car1, Car car2) {
		
		//return car1.getRating() - car2.getRating();
		return Integer.compare(car1.getRating(),car2.getRating());
	}
}

class CarBrandComparator implements Comparator<Car>
{

	@Override
	public int compare(Car car1, Car car2) {
			
		return car1.getBrand().compareTo(car2.getBrand());
	}
}



