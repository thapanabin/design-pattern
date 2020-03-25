package com.nabin.design.pattern.templatemethod;

public class Excel extends DataProcessor {
	
	
	
	public void readData() {
		System.out.println("Read Data from Excel File");
	}
	
	public void processData() {
		System.out.println("Process Data from Excel File");
	}
	

}
