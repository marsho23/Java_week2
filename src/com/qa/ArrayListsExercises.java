package com.qa.arraylists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animals = new ArrayList<>();
		animals.add("giraffe");
		animals.add("dog");
		animals.add("elephant");
		animals.add("cat");
		
		System.out.println(animals);
		
		for (int i =0;i<animals.size();i++) {
			System.out.println( animals.get(i));
		}
		
		for(String animal:animals) {
			System.out.println(animal);
		}
		
		animals.set(1, "cow");
		System.out.println(animals);
		
		animals.remove(1);
		System.out.println(animals);
		
		Collections.sort(animals);
		System.out.println(animals);
		
		Collections.reverse(animals);
		System.out.println(animals);
		
		Collections.swap(animals, 0, 1);
		System.out.println(animals);

		animals.clear();
		System.out.println(animals);

		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(1);
		nums.add(5);
		nums.add(2);
		
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);

	}

}
