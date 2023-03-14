package com.qa.arraylists;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> chocolates = new ArrayList<>();
		chocolates.add("snickers");
		chocolates.add("ferro rocher");
		chocolates.add("milky way");
		chocolates.add("kinder bueno");
		
		for(String chocolate:chocolates) {
			System.out.println(chocolate);
		}
		
		List<Integer> nums = new ArrayList<>();
		for (int i =0;i<20;i++) {
			nums.add(i+1);
		}
		
		for(Integer num:nums) {
			System.out.println(num);
		}
		
		for (Integer num:nums) {
			boolean result;
			result = evenOrOdd(num);
			if (result==true)
				System.out.println(num*num*num);
			else 
				System.out.println(num*num);
		}
	}
	
	public static boolean evenOrOdd(int num) {
		if (num%2==0)
			return true;
		else
			return false;
	}

}
