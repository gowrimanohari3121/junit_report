package com.cognizant;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestDivision {
	@Test
	public void TestDivision() {
		Sample obj2 = new Sample(5, 7, 6);
		System.out.println("Inside the unit test case method");
		Assert.assertEquals(1, obj2.division());
	}
}