package com.trainings.java8.functionalprogramming;

public class A_FunctionalProgRunner {

	public static void main(String[] args) {

		IGreet greetImpl = new GreetImpl();
		greetImpl.wishMyFriend("Hello My buddy!!!");

		IGreet greetImplA = new IGreet() {

			@Override
			public void wishMyFriend(String s) {
				System.out.println(s);

			}
		};

		greetImplA.wishMyFriend("Hi My frined!!");

		IGreet lambdaGreet =  s -> System.out.println(s);
		lambdaGreet.wishMyFriend("Hi .....");

		IString stringLength = s -> s.length();

		int strlen = stringLength.stringLength("java");

		System.out.println(strlen);

		IStringConcat strConcat = (s1, s2) -> s1 + s2;

		String scon = strConcat.stringConcat("Java", " FP");

		System.out.println(scon);

	}
}

@FunctionalInterface
interface IStringConcat {
	public String stringConcat(String s1, String s2);
}

@FunctionalInterface
interface IString {
	public int stringLength(String s);
}

@FunctionalInterface
interface IGreet {
	public void wishMyFriend(String s);
}

class GreetImpl implements IGreet {

	@Override
	public void wishMyFriend(String s) {
		System.out.println(s);

	}

}