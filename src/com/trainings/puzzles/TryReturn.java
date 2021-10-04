package com.trainings.puzzles;

public class TryReturn {

	public static void main(String[] args) {

		System.out.println(isTryWinOrFinally());

	}

	@SuppressWarnings("finally")
	static boolean isTryWinOrFinally() {
		try {

			return false;

		} finally {

			return true;
		}

	}
}
