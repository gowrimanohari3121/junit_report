package com.cognizant;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestMultiply {
	@Test
	public void TestMultiply(){
			Sample obj1 = new Sample(5,7,6);
			System.out.println("Inside the unit test case method");
			Assert.assertEquals(210,obj1.multiplication());
}
}
