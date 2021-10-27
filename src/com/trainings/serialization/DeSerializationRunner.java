package com.trainings.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationRunner {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		
		Employee e1  = (Employee) ois.readObject();
		Employee e2  = (Employee) ois.readObject();
		Employee e3  = (Employee) ois.readObject();
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
//		oos.writeObject(e2);
//		oos.writeObject(e3);

	}

}
