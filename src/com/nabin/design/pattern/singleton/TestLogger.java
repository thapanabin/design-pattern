package com.nabin.design.pattern.singleton;

public class TestLogger {

	public static void main(String[] args) {
		
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
		
		System.out.println("--- Singleton class--------------------------");
		System.out.println(obj1.hashCode());//having same hashcode means there is only one instance althogh looks obj1 and obj2
		System.out.println(obj2.hashCode());
		
		
		System.out.println("-----------------------Non Singleton class-------------------------");
		TestLogger t1 = new TestLogger();//two different class have different hashcode
		TestLogger t2 = new TestLogger();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
	}

}
