package com.trainings.exceptions;

import java.util.Date;

public class CustomExceptionRunner {

	public static void main(String[] args) {

	}
}



//Model/Entity
class User {

	private long id;
	private String name;
	private Date dateOfBirth;
	
	public User(long id, String name, Date dateOfBirth) {
		
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class UserVotingRegistartionService{
	
	
	//uservote
	public void register(User user)
	{
		
		
	}
	
}