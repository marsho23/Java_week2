package com.qa.arraylists;

import java.util.Collections;

public class StringManipulationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = new String("Yesterday it was raining");
		String string2 = new String("Today it is sunny");
		String string3 = new String(string2.toUpperCase() + " , "+string1.toUpperCase());
		System.out.println(string3);
		String subString1 = string2.substring(0, 11);
		String subString2 = string1.substring(16);
		System.out.println(subString1+subString2);
		
		//exercise2 
		System.out.println(getWordCount(" ferro rocher is over-rated"));
		//printWordsVertically(" ferro rocher is over-rated");
		reverseVertical(" ferro rocher is over-rated");
		//System.out.println(checkStringExists("ferro rocher is over-rated","not"));
	}
	
	//Exercise 2 methods
	
	public static int getWordCount(String string1) {
		int noOfWords=0;
		string1=string1.trim();
		for (int i =0;i<string1.length();i++) {
			if (string1.charAt(i)==' '){
				noOfWords+=1;
			}
		}
		return noOfWords+1;
	}
	
	public static void printWordsVertically(String string1) {
		string1=string1.trim();
		int previousWhiteSpaceIndex =0;
		for (int i =0;i<string1.length();i++) {
			if (string1.charAt(i)==' '){
				System.out.println(string1.substring(previousWhiteSpaceIndex, i).trim());
				previousWhiteSpaceIndex=i;
			}
		}
		
		System.out.println(string1.substring(previousWhiteSpaceIndex, string1.length()).trim());
	}
	
	public static void reverseVertical(String string1) {
		string1=string1.trim();
		String string2 = "";
		int previousWhiteSpaceIndex =0;
		for (int i =0;i<string1.length();i++) {
			if (string1.charAt(i)==' '){	
				string2 = string1.substring(previousWhiteSpaceIndex, i).trim()+" "+string2;
				//System.out.println(string1.substring(previousWhiteSpaceIndex, i).trim());
				previousWhiteSpaceIndex=i;
			}
		}
		string2=string1.substring(previousWhiteSpaceIndex, string1.length()).trim()+" "+string2;
		//System.out.println(string1.substring(previousWhiteSpaceIndex, string1.length()).trim());
		//System.out.println(string2);
		
		string2=string2.trim();
		previousWhiteSpaceIndex =0;
		for (int i =0;i<string2.length();i++) {
			if (string2.charAt(i)==' '){
				System.out.println(string2.substring(previousWhiteSpaceIndex, i).trim());
				previousWhiteSpaceIndex=i;
			}
		}
		
		System.out.println(string2.substring(previousWhiteSpaceIndex, string1.length()).trim());


	}
	
	public static boolean checkStringExists(String message, String string1) {
		if (message.contains(string1))
			return true;
		else 
			return false;
	}
	
	
	
	

}
