package com.qa.arrays;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = i;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
