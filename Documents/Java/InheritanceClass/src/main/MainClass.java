package main;

import cls.ChildClass;

public class MainClass {

	public static void main(String[] args) {
	//	MyClass cls = new MyClass();
	//	MyClass cls1 = new MyClass(1, "aaa");
	//	ChildClass cc = new ChildClass();	// 부모클래스의 생성자가 먼저 호출됨
		
		ChildClass cc1 = new ChildClass(11, "홍길동", 180.1);
	}

}
