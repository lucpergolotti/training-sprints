package com.qa.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyArrayUtilsTest {

	
	
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
