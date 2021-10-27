package com.trainings.java8.functionalprogramming;

import java.util.function.BiConsumer;

public class ConsumerRunner {

	public static void main(String[] args) {

//		Consumer<T> // take the data but wont give any data

//		Consumer<String> consumer = new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//
//			}
//
//		};

//		consumer.accept("Hello consumer!!!");
//		
//		Consumer<String> consumerLambda = s -> System.out.println(s);
//		consumerLambda.accept("Hello lambda consumer!!!");

//		Consumer<String> consumerLambda2 = s -> new StringBuilder(s);
//		consumerLambda2.accept("Hello stringbuilder");
//		

		BiConsumer<String, Integer> biConsumerLambda = (s, i) -> System.out.println(s + i);

		biConsumerLambda.accept("Hello ", 20);

	}

}
