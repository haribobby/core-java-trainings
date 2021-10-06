package com.trainings.functionalprogramming;

import java.util.function.Function;

public class FunctionRunner {

	public static void main(String[] args) {

		Function<Integer, String> function = (i) ->  "Sugar";

		System.out.println(function.apply(100));

	}

}
