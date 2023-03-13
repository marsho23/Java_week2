package com.qa.iterations;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumbers();

	}

	public static void printNumbers() {
		int A = 1;
		while (A <= 10) {
			for (int i = 0; i < 10; i++) {
				System.out.println(A);
			}
			A++;
		}
	}

}
