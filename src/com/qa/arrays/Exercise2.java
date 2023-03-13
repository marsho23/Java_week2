package com.qa.arrays;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = i + 1;
			System.out.println(nums[i]);

		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 10;
			System.out.println(nums[i]);
		}
	}

}
