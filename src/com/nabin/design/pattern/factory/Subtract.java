package com.nabin.design.pattern.factory;

public class Subtract implements Calculate {

	@Override
	public void calculate(double a, double b) {
		System.out.println("a - b =  "+(a-b));

	}

}
