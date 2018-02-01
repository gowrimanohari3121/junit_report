package com.cognizant;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestAdd {
	@Test
	public void TestAdd(){
			Sample obj = new Sample(5,7,6);
			System.out.println("Inside the unit test case method");
			Assert.assertEquals(18,obj.addition());
	
		}
}
