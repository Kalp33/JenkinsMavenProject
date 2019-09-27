package com.kk.study.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalculatorTest {
	
	private JenkinsCalculator calc;

	@Test
	public void addTest() {
		calc = new JenkinsCalculator();
		assertEquals(10, calc.add(5, 5));
	}
	
	@Test
	public void subtractTest(){
		calc = new JenkinsCalculator();
		assertEquals(15, calc.substract(20, 5));
	}

}
