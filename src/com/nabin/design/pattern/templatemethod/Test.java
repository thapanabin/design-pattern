package com.nabin.design.pattern.templatemethod;

public class Test {

	public static void main(String[] args) {

		Excel obj = new Excel();
		obj.readProcessAndSave();
//		obj.readData();
//		obj.processData();
//		obj.saveData();
		
		Text obj2 = new Text();
		obj2.readProcessAndSave();
//		obj2.readData();
//		obj2.processData();
//		obj2.saveData();
	}

}
