package com.trainings.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationRunner {
	
	public static void main(String[] args) throws IOException {
		
		
		Employee e1 = new Employee(1L, "Name1", 25, 2000.0);
		Employee e2 = new Employee(2L, "Name2", 27, 3000.0);
		Employee e3 = new Employee(3L, "Name3", 21, 900.0);
		
		//Serialization (write object data into file)
		
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		System.out.println("Serialization is sucessfull...");
		
		
		
	}

}

class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private transient String name;
	private int age;
	private transient double salary;

	public Employee(Long id, String name, int age, double salary) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	

}

// Saving the data ( Seriliazation)

// new Employee (id, name, Sal) => Serliazation (convert your java obj to file/network supported form) => DB

// Retreving the data ( DeSeriliazation)

// DB => data(files) => DeSeriliazation => convert to java object