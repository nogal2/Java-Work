package main;

import cls.MyClass;
import cls.YouClass;

public class MainClass {

	public static void main(String[] args) {
	
		/*
			static:	정적	<=> 동적(dynamic)
			
			variable
			method
		*/
		
		MyClass cls = new MyClass();
		
		cls.func();
		cls.func();	// local 변수는 마지막 중괄호를 벗어나면서 저장된 수가 삭제되고 다시 시작했을때 초기화된 0부터 시작해서 1이나온다.
		cls.func();
		cls.func();
		
		MyClass mycls = new MyClass();
		mycls.func();	// 정적변수는 여기서 5가 된다. 멤버변수는 위에 있는 cls 인스턴스와 mycls인스턴스는 다르기 때문에 1부터 시작하지만 정적변수는 static영역에서 계속 저장되어 있기 때문이다.
		mycls.func();	// static은 딱 하나여서 인스턴스가 10개이든 5개이든 무조건 하나이다.
		
	//	mycls.staticNumber = 12;
		MyClass.staticNumber = 14;	// 보통 이런 방식으로 접근한다.
		
		//메소드
//		YouClass yc = new YouClass();
//		yc.memberMethod();	// 멤버 메소드, 인스턴스 메소드
		
		YouClass.staticMethod();	// static 메소드, class메소드 인스턴스를 생성안해도 사용할 수 있음.
		YouClass.swap(null, 0, 0);
		
		
	}

}
