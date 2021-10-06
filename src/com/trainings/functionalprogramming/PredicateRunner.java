package com.trainings.functionalprogramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateRunner {

	public static void main(String[] args) {
//
//		Predicate<String> predicateAnonymous = new Predicate<String>() {
//
//			@Override
//			public boolean test(String s) {
//
//				return s.length() > 5;
//
//			}
//		};
//		
//		System.out.println(predicateAnonymous.test("java FP"));
//		
//		
//		String s = "java";
//		if(s.length()>5)
//		{
//			return true;
//		}else
//		{
//			return false;
//		}
		
		
		Predicate<String> strPredicate = str -> str.length()>5; 
		System.out.println(strPredicate.test("java1111"));
		
		
		
//		Predicate<String> predicateLambda = s -> s.length() > 5;
//	
//		
//		System.out.println(predicateLambda.test("java"));
//		
//		
//		Predicate<Integer> predicateIntegerLambda = i -> i > 500;
//		
//		
//		System.out.println(predicateIntegerLambda.test(1000));
		
		

		
		// Two string having same length
		
//		BiPredicate<String, String> biPredicate = (s1,s2) -> s1.length()==s2.length();
//		System.out.println(biPredicate.test("java", "php1"));
		
		
//		BiPredicate<String, Integer> biPredicateSI = (s,i) -> Integer.parseInt(s)==i;
//		System.out.println(biPredicateSI.test("10",100));
//		
		
		// s1, s2 ,s3
		// s1 first character is equals to s2 first character and s2 ==s3  (T/F)
		
//		
//		TriPredicate<String,String,String> triPredicate = (s1,s2,s3) -> s1.charAt(0)==s2.charAt(0) && s2==s3;
//		System.out.println(triPredicate.test("java", "john123", "john123"));
//		
//		System.out.println(triPredicate.test("java", "Kevin", "Kevin"));
//		
		
		
		// i = i2 and i1+i2 ==i3
		
//		TriPredicate<Integer,Integer,Integer> triInegerPredicate = (i1,i2,i3) -> i1==i2 && (i1+i2==i3);
//		
//		System.out.println(triInegerPredicate.test(10,10,30));
		
		
	}

}


@FunctionalInterface
interface TriPredicate<T,U,V>{
	
	
	boolean test(T t, U u, V v);
}














