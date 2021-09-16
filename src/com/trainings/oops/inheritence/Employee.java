package com.trainings.oops.inheritence;

public class Employee {

	private String id;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

//	@Override
//	public String toString() {
//
//		return "{ id is: " + this.id + " , name is: " + this.name + "}";
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId("1A");
		emp.setName("John");

		System.out.println(emp);
	}
}
