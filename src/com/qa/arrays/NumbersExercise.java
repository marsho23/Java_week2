package com.qa.arrays;

public class NumbersExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(20));
		System.out.println(returnStringRepresentation(33));

	}

	public static int sum(int num) {
		int firstDigit = num / 10;
		int secondDigit = num % 10;
		int sum = firstDigit + secondDigit;
		return sum;
	}

	public static String returnStringRepresentation(int num) {
		int[] nums = new int[100];
		String[] numbers = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
				"twenty one", "twenty two", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine", "thirty", "thirty one", "thirty two", "thirty three",
				"thirty four", "thirty five", "thirty six", "thirty seven", "thirty eight", "thirty nine", "fourty",
				"fourty one", "fourty two", "fourty three", "fourty four", "fourty five", "fourty five", "fourty six",
				"fourty seven", "fourty eight", "fourty nine", "fifty", "fifty one", "fifty two", "fifty three",
				"fifty four", "fifty five", "fifty six", "fifty seven", "fifty eight", "fifty nine", "sixty",
				"sixty one", "sixty two", "sixty three", "sixty four", "sixty five", "sixty six", "sixty seven",
				"sixty eight", "sixty nine", "seventy", "seventy one", "seventy two", "seventy three", "seventy four",
				"seventy five", "seventy six", "seventy seven", "seventy eight", "seventy nine", "eighty", "eighty one",
				"eighty two", "eighty three", "eighty four", "eighty five", "eighty six", "eighty seven",
				"eighty eight", "eighty nine", "ninety", "ninety one", "ninety two", "ninety three", "ninety four",
				"ninety five", "ninety six", "ninety seven", "ninety eight", "ninety nine" };
		for (int i = 1; i <= 99; i++) {
			nums[i] = i;
		}

		String result = numbers[num];
		return result;

	}

	public static void returnStringRepresentation2(int num) {
		String[] tensNames = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String[] numNames = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String word = "";
		if (num / 10 == 9) {
			word += tensNames[8];
			num -= 90;
		} else if (num / 10 == 8) {
			word += tensNames[7];
			num -= 80;
		} else if (num / 10 == 7) {
			word += tensNames[6];
			num -= 70;
		} else if (num / 10 == 6) {
			word += tensNames[5];
			num -= 60;
		} else if (num / 10 == 5) {
			word += tensNames[4];
			num -= 50;
		} else if (num / 10 == 4) {
			word += tensNames[3];
			num -= 40;
		} else if (num / 10 == 3) {
			word += tensNames[2];
			num -= 30;
		} else if (num / 10 == 2) {
			word += tensNames[1];
			num -= 20;
		} else if (num / 10 == 1) {
			word += tensNames[0];
			num -= 10;
		} else if (num % 10 == 9) {
			word += numNames[8];
			num -= 9;
		} else if (num % 10 == 8) {
			word += numNames[7];
			num -= 8;
		} else if (num % 10 == 7) {
			word += numNames[6];
			num -= 7;
		} else if (num % 10 == 6) {
			word += numNames[5];
			num -= 6;
		} else if (num % 10 == 5) {
			word += numNames[4];
			num -= 5;
		} else if (num % 10 == 4) {
			word += numNames[3];
			num -= 4;
		} else if (num % 10 == 3) {
			word += numNames[2];
			num -= 3;
		} else if (num % 10 == 2) {
			word += numNames[1];
			num -= 2;
		} else if (num % 10 == 1) {
			word += numNames[0];
			num -= 1;
		}

	}
}
