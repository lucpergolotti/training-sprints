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
	public static String reverseString(String s) {
		String s2 ="";
		if (s.length() == 0) {
			s2 = s;
		}
		return s2;
	}
}
