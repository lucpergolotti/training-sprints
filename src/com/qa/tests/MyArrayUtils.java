package com.qa.tests;

public class MyArrayUtils {

	public static int findHighest(int[] nums) {
		int max  = 0;
		if(nums.length == 0) {
			max = Integer.MIN_VALUE;
		}
		if(nums.length > 2) {
			max = nums[0];
			for(int i =1; i<nums.length; i++) {
				if(nums[i]> max) {
					max= nums[i];
				}
			}
		}
		if(nums.length == 1) {
			return nums[0];
		}
		if(nums.length == 2) {
			if(nums[0] > nums[1]) {
				return nums[0];
			} else {
				return nums[1];
			}
		}
		return max;

	}
	
	public static String stringReverse(String s) {
		if (s.length() == 1) {
			return s;
		}
		if (s.length() > 1) {
			String reverse = "";
			for(int i = (s.length()-1); i >= 0 ; i-- ){
				reverse += s.charAt(i);
			}
			return reverse;
		}
		return null;
	}
}
