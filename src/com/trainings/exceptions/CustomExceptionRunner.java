package com.trainings.exceptions;

public class CustomExceptionRunner {

	public static void main(String[] args) {

		User user1 = new User(1L, "John", 24);
		User user2 = new User(1L, "Jessy", 14);

		try {
			UserVotingRegistartionService userVotingService = new UserVotingRegistartionService();
			userVotingService.register(user2);
		} catch (UserNotEligibleForVoteException e) {
			System.err.println(e.getMessage());
		}
	}
}

//Model/Entity
class User {

	private long id;
	private String name;
	private int age;

	public User(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

}

class UserVotingRegistartionService {

	// uservote
	public void register(User user) throws UserNotEligibleForVoteException {

		if (user.getAge() < 18) {
			throw new UserNotEligibleForVoteException("Your age is not > 18");
		} else {
			System.out.println("User is registred Sucessfully \n" + user.getName() + " voter id is "
					+ String.valueOf(Math.random()).substring(3));

			// registation process
			// Save the data in db
			// generate id
		}

	}

}

class UserNotEligibleForVoteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7717570447797190749L;

	UserNotEligibleForVoteException(String message) {
		super(message);
	}
}