package com.trainings.oops.composition;

class Address {

	private String line1;
	private String street;
	private String hno;
	private String zipcode;	

}


class Customer {
	
	private String cname;
	//adresss
	
	Address address;
	
}
class Employee {

	private String empname;
	private int empid;
	
	Address address;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	
	
}

public class CompositionRunner {

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.setEmpid(111);
	
		
		
		System.out.println(e);

	}
}
