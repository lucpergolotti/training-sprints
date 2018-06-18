package com.qa.tests;

public class MyArrayUtils {
	
	public static int findHighest(int[] nums) {
		
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
		return 0;
		
		
	}
}
