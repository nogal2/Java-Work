package main;

import cls.ChildClass;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		
		cc.parentMethod();
		cc.chileMethod();
	//	cc.name = "일지매";
		
		
		ParentClass pc = new ParentClass();
		pc.parentMethod();
	//	pc.chileMethod();  //상속은 상하관계이기 때문에, 자식쪽의 함수는 못씀.
		
	}

}
