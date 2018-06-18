package com.qa.tests;

public class MyArrayUtils {
	public static int findHighest(int[] numbers) {
		int max  = 0;
		if(numbers.length == 0) {
			max = Integer.MIN_VALUE;
		}
		if(numbers.length > 2) {
			max = numbers[0];
			for(int i =1; i<numbers.length; i++) {
				if(numbers[i]> max) {
					max= numbers[i];
				}
			}
		}
		return max;
	}
}
