package com.nabin.design.pattern.factory;

public class CalculateFactory {

	public Calculate getCalculation(String type) {

		Calculate obj = null;
		if (type.toLowerCase().equals("add")) {
			obj = new Add();
		} else if (type.toLowerCase().equals("subtract")) {
			obj = new Subtract();
		} else if (type.toLowerCase().equals("divide")) {
			obj = new Divide();
		}else {
			System.out.println("We dont do that");
		}
		return obj;
	}

}
