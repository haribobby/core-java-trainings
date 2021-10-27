package com.trainings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableRunner {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Scott", "SE", 28);
		Employee e2 = new Employee(101, "John", "SSE", 30);
		Employee e3 = new Employee(107, "John", "SSE", 29);
		Employee e4 = new Employee(102, "Ram", "ASE", 24);
		Employee e5 = new Employee(105, "Kalyan", "ASE", 23);

		
		// Assignement : Sort by name and age combination
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
	
		System.out.println("Before Sorting.... "+employeeList);
		
		Collections.sort(employeeList);
		
		
		System.out.println("After Sorting.... "+employeeList);
		
		
		// Sort by name
		
		
		// Sort by age
		
		//Sort by id
		
		

	}

}

class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String desg;
	private int age;

	public Employee(int id, String name, String desg, int age) {

		this.id = id;
		this.name = name;
		this.desg = desg;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee employee) {

		return this.age - employee.getAge();
		// return Integer.compare(this.age,employee.getAge())
		//for string comparing by name
		//return this.name.compareTo(employee.getName());
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", age=" + age + "]";
	}
	
}