package com.qa.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
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


	
	
	@Test
	public void findHighestInArrayOfOne() {
		int[] a1 = new int[1];
		a1[0] = 10;
		assertThat(MyArrayUtils.findHighest(a1), is(10));
		
	}
	@Test
	public void findHighestInArrayOfTwo() {
		int[] a1 = new int[]{10, 20};
		assertThat(MyArrayUtils.findHighest(a1), is(20));
		
		
	}
}
