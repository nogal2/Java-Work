package cls;

import inter.PrintInterface;

public class PrintNamePhoneCard implements PrintInterface { // PrintNameCard와 부모가 동일함.

	@Override
	public void print(NameCard nc) { // NameCard 클래스를 매개변수 nc로 호출한다.
		System.out.println("이름: " + nc.name); //nc에 있는(NameCard) name변수를 가져와서 프린트한다.
		System.out.println("전화번호: " + nc.phone); //nc에 있는(NameCard) phone변수를 가져와서 프린트한다.
		
	}
	
	
}
