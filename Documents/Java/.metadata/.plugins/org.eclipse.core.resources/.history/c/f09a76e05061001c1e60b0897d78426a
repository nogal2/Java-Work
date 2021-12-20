package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;
import singleton.Singleton;

public class MainClass {

	public static void main(String[] args) {
		
		MyClass mycls = new MyClass();
		YouClass youcls = new YouClass();
		HeClass hecls = new HeClass();
		
//		youcls.setTotal(mycls.getNumber());		// youcls의 total을 mycls의 넘버를 가져온다.
//		youcls.setName(mycls.getName());
		mycls.method();
		youcls.func();
		
		System.out.println(youcls.toString());
		
		hecls.hefunc();
		youcls.func();
		
		System.out.println(youcls.toString());
	/*	
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		
		s = Singleton.getInstance();
		System.out.println(s);
	*/	
		
	}

}
