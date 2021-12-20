package main;

import abstractCls.AbstractClass;
import cls.MyClass;
import cls.YouClass;

public class MainClass {

	public static void main(String[] args) {
		
//		AbstractClass ac = new AbstractClass() {};  = > 추상클래스는 생성안됨
		
		MyClass mycls = new MyClass();
		mycls.method();
		mycls.abstractMethod();
		
		AbstractClass ac = new MyClass();
		ac.method();
		ac.abstractMethod();
		// 추상클래스도 다형성 사용 가능. 아래는 캐스트사용의 사용 유형
		((MyClass)ac).func();
		MyClass my = (MyClass)ac;
		my.func();
		
		YouClass you = new YouClass();
		you.abstractMethod();
		AbstractClass ac1 = new YouClass();
		((YouClass)ac1).abstractMethod();
		
	}	

}
