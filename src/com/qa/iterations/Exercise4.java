package com.qa.iterations;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// flowchart1ForLoop();

		// flowchart2ForLoop();
		printNumbers();
	}

	public static void flowchart1ForLoop() {
		for (int A = 100; A < 200; A++) {
			System.out.println(A);
			A++;
		}
	}

	public static void flowchart2ForLoop() {
		for (int A = 100; A < 200; A++) {
			if (A % 2 == 0)
				System.out.println("-");
			else
				System.out.println("*");

		}
	}

	public static void printNumbers() {
		for (int A = 1; A <= 10; A++) {
			for (int i = 0; i < 10; i++) {
				System.out.println(A);
			}
		}
	}
}
