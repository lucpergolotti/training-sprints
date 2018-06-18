package com.qa.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayUtilsTest {
	
	
	@Test
	public void many() {
		int[] array = {1,2,3};
		int highest = MyArrayUtils.findHighest(array);
		assertEquals(highest, 3);
	}
	@Test
	public void empty() {
		int[] array = {};
		int highest = MyArrayUtils.findHighest(array);
		assertEquals(highest, Integer.MIN_VALUE);
	}
}
