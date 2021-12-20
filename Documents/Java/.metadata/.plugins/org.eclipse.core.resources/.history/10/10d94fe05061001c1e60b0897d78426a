package main;

import cls.ChildOndClass;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		
//		ChildOndClass child = new ChildOndClass();
//		child.Method();
		
		ParentClass pc = new ChildOndClass();	// 생성된 객체는 자식 클래스(new). 근데 인스턴스(pc)는 ParentClass에 생성됨.
		pc.Method();
		pc.func();
//		pc.function();
		
		ChildOndClass coc = (ChildOndClass)pc;	// 부모클래스의 인스턴스를 자식클래스로 변환
		coc.function();
		
		
		/*
			ParentClass pc = new ChildOndClass();
ParentClass의 주소를 가진 pc를 ChildOndClass를 담고 있는 인스턴스를 생성한다.


ChildOndClass coc = (ChildOndClass)pc;
ParentClass의 주소를 가진 pc를 ChildOndClass의 주소를 가진 coc로 주소를 강제 변환시킨다.

		*/
	}

}
