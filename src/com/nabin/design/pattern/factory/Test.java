package com.nabin.design.pattern.factory;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the num2: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter Calculation needed Addition, Substraction, Division");
		CalculateFactory factory = new CalculateFactory();
		Calculate obj = factory.getCalculation(sc.next());
		obj.calculate(num1, num2);
		
		sc.close();
	}

}
