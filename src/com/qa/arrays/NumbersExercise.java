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
}
