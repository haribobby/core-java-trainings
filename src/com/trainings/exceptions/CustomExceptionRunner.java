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




//class Amount {
//	private String currency;
//	private int amount;
//	
//	public Amount(String currency, int amount) {
//		super();
//		this.currency = currency;
//		this.amount = amount;
//	}
//	
//	public void add(Amount that) throws CurrenciesDoNotMatchException {
//		
//		if(!this.currency.equals(that.currency)) {
//			//throw new Exception("Currencies Don't Match " + this.currency + " & " +that.currency );
//			throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " +that.currency );
//		}
//		
//		this.amount = this.amount + that.amount;
//	}
//	
//	public String toString() {
//		return amount + " " + currency; 
//	}
//}
//
//class CurrenciesDoNotMatchException extends Exception {
//	public CurrenciesDoNotMatchException(String msg) {
//		super(msg);
//	}
//}
//
//public class ThrowingExceptionRunner {
//
//	public static void main(String[] args) throws CurrenciesDoNotMatchException {
//		Amount amount1 = new Amount("USD", 10);
//		Amount amount2 = new Amount("EUR", 20);
//		amount1.add(amount2);
//		System.out.println(amount1);	
//	}
//
//}