package com.trainings.java8.functionalprogramming;

public class A_FunctionalProgRunner2 {

	public static void main(String[] args) {

		IStringsConcat stringsConcatImpl = new IStringsConcat() {

			@Override
			public String stringConcat(String s1, String s2) {

				return s1 + s2;
			}

		};
		String constr = stringsConcatImpl.stringConcat("java", "world");

		System.out.println(constr);

		IStringsConcat stringsConcatImplLambs = (s1, s2) -> s1 + s2;

		String constrlamb = stringsConcatImplLambs.stringConcat("java", "world");

		System.out.println(constrlamb);

	}
}

@FunctionalInterface
interface IStringsConcat {
	public String stringConcat(String s1, String s2);
}

//
//class StringsConcat implements IStringsConcat {
//
//	@Override
//	public String stringConcat(String s1, String s2) {
//		
//		return s1+s2;
//	}
//}
