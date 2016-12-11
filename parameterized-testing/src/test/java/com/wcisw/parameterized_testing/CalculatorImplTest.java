package com.wcisw.parameterized_testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorImplTest {
	int num1;
	int num2;
	int expectedResult;
	
	 public CalculatorImplTest(int num1, int num2, int expectedResult ) {
		this.expectedResult = expectedResult;
		this.num1 = num1;
		this.num2 = num2;
	}

	@Test
	public void addTest() {
		Calculator calc = new CalculatorImpl();
		int result = calc.add(num1, num2);
		assertEquals(expectedResult, result);
	}
	@Parameters
	public static List<Integer[]> data() {
		
		return Arrays.asList(new Integer[] []{{10,20,30},{20,30,50}});
		
	}

}
