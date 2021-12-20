package main;

import mycls.MyClass;

public class MainClass {

	public static void main(String[] args) {
		MyClass cls = new MyClass();
	//	cls.number = 1;
		cls.name="";		// 이런 접근은 지양함.
	//	cls.height= 171.2;
		
		cls.getNumber(123);
		
	}

}
