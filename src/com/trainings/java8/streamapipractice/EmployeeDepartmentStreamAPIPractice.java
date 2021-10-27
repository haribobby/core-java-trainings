package com.trainings.java8.streamapipractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeDepartmentStreamAPIPractice {

	public static void main(String[] args) {

		List<Employee> employeeList = getEmployeeList(); 
		

		// 1. Print all employees
		//employeeList.stream().forEach(employee -> System.out.println(employee));
//		employeeList.stream().forEach(System.out::println);
		

		// 2.print employees whose age is greater than 30
//		employeeList.stream().filter(employee -> employee.getAge()>30).forEach(System.out::println);
		

		// 3.Print the unique name of all departments in the organization
//		employeeList.stream().map(employee -> employee.getDepartment()).distinct().forEach(System.out::println);
		
		
		
		// 4. Get the names of all employees who have joined after 2015?

		
		List<String> employeeNamesWhoJoinedAfter2015 = employeeList.stream()
				.filter(employee -> employee.getYearOfJoining()>2015)
//				.map(employee -> employee.getName())
				.map(Employee::getName)
				.collect(Collectors.toList());
		
		//System.out.println(employeeNamesWhoJoinedAfter2015);
		
		
		
		
		// 5.Print employee obj Who has the most working experience in the organization?
		//employeeList.stream().sorted((e1,e2) -> Integer.compare(e1.getYearOfJoining(),e2.getYearOfJoining())).limit(1).forEach(System.out::println);
		
		
		// 6.How many male and female employees are there in the organization?
		System.out.println(
				employeeList.stream()
							.filter(employee -> employee.getGender()!="Other")
//							.collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.counting())));
							.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
		

		
		//7.Count the number of employees in each department?
		//System.out.println(employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting())));
		

		
		//8.How many male and female employees are there in the sales and marketing team?
		//System.out.println(employeeList.stream().filter(employee -> employee.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.counting())));

		

	}

	static List<Employee> getEmployeeList() {

		List<Employee> employeeList = new ArrayList<Employee>();

//		
//		Accounts and Finance
//		HR
//		Sales and marketing (Business development)
//		Infrastructures
//		Research and development
//		Learning and development
//		IT services
//		Product development
//		Admin department
//		Security and transport.

		employeeList.add(new Employee(100, "Hari P", 29, "Male", "IT Services", 2019, 25000.0));
		employeeList.add(new Employee(200, "ADITYA KUMAR", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(300, "RANJAN KUMAR", 29, "Other", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(400, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(500, "Nirmala Roy", 27, "Female", "Learning and development", 2013, 22700.0));
		employeeList.add(new Employee(600, "Iqbal Hussain", 43, "Male", "IT Services", 2016, 10500.0));
		employeeList.add(new Employee(700, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(800, "Waheed Liu", 31, "Male", "IT Services", 2015, 34500.0));
		employeeList.add(new Employee(900, "Brettny Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(110, "Javeed Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(210, "Priya Kaur", 27, "Female", "Admin Team", 2014, 15700.0));
		employeeList.add(new Employee(310, "Nitin Joshi", 25, "Female", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(410, "Jyothi Rajan", 27, "Other", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(510, "Nicolus Roy", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(610, "Jagan Baig", 23, "Male", "Admin Team", 2018, 12700.0));
		employeeList.add(new Employee(710, "Komala Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(810, "Mukesh Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		return employeeList;
	}

}

class Employee {

	private Integer id;

	private String name;

	private Integer age;

	private String gender;

	private String department;

	private Integer yearOfJoining;

	private Double salary;

	public Employee(Integer id, String name, Integer age, String gender, String department, Integer yearOfJoining,
			Double salary) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(Integer yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
}
