package com.qa.iterations;

public class CoinsExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test1");

		calcChange(4.57f, 20.0f);
		System.out.println("test");
	}

	public static void calcChange(float cost, float amount) {
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int twos = 0;
		int ones = 0;
		int fiftyP = 0;
		int twentyP = 0;
		int tenP = 0;
		int fiveP = 0;
		int twoP = 0;
		int oneP = 0;
		float change = 0;
		change = amount - cost;
		while (change > 0.01) {
			if (change >= 50) {
				fifties++;
				change = change - 50f;
			} else if (change >= 20) {
				twenties++;
				change = change - 20f;
			} else if (change >= 10) {
				tens++;
				change = change - 10f;
			} else if (change >= 5) {
				fives++;
				change = change - 5f;
			} else if (change >= 2) {
				twos++;
				change = change - 2;
			} else if (change >= 1f) {
				ones++;
				change = change - 1;
			} else if (change >= 0.5) {
				fiftyP++;
				change = change - 0.5f;
			} else if (change >= 0.2) {
				twentyP++;
				change = change - 0.2f;
			} else if (change >= 0.1) {
				tenP++;
				change = change - 0.1f;
			} else if (change >= 0.05) {
				fiveP++;
				change = change - 0.05f;
			} else if (change >= 0.02) {
				twoP++;
				change = change - 0.02f;
			} else if (change >= 0.01) {
				oneP++;
				change = change - 0.01f;
			}

		}
		if (change == 0.01) {
			oneP++;
		}

		System.out.println("change: ");
		System.out.println(fifties + " fifites ");
		System.out.println(twenties + " twenties ");
		System.out.println(tens + " tens ");
		System.out.println(fives + " fives ");
		System.out.println(twos + " two pounds ");
		System.out.println(ones + " one pounds ");
		System.out.println(fiftyP + " fifty P's ");
		System.out.println(twentyP + " twenty P's ");
		System.out.println(tenP + " ten P's ");
		System.out.println(fiveP + " five P's ");
		System.out.println(twoP + " two P's ");
		System.out.println(oneP + " one P's ");

	}
}
