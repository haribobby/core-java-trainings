package com.trainings.collections;

public class EqualityRunner {

	public static void main(String[] args) {
		

		// primitive equality comaprision
//		int a = 2;
//		int b = 3;
//
//		if (a == b) {
//			System.out.println("a & b are equal");
//		} else {
//			
//			System.out.println("a & b are not equal");
//		}
		
		
//		Student st3 = new Student(100, "John", "IT"); // st1 - refernece
//		Student st4 = st3;
//		Student st5 = st3;
//		
//		System.out.println(st4.equals(st5));

		Student st1 = new Student(100, "John", "IT"); // st1 - refernece
		Student st2 = new Student(100, "John", "IT"); // st2 - refernece

		if (st1.equals(st2)) {
			//not add to student list
			//System.out.println("st1 & st2 are same");
		} else {
			// add to student list
			//System.out.println("st1 & st2 are not same");
		}
		
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());

	}

}

class Student {

	private int id;
	private String name;
	private String branch;

	public Student(int id, String name, String branch) {

		this.id = id;
		this.name = name;
		this.branch = branch;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

	
	
	

}