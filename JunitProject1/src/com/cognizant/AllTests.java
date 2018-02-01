package com.cognizant;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAdd.class, TestDivision.class, TestMultiply.class })
public class AllTests {

}
