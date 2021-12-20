package main;

import cls.MyClass;
import cls.YouClass;
import inter.Myinterface;

public class MainClass {

	public static void main(String[] args) {
		
//		Myinterface myi = new Myinterface();
		
		MyClass mycls = new MyClass();
		mycls.method();
		
		Myinterface myi = new MyClass();
		myi.method();
		
		Myinterface myinter = new Myinterface() {
			@Override
			public void method() {
				
			}
		};
		
		YouClass ycls = new YouClass();
		ycls.func();
		ycls.method();
		
		Myinterface myinterface = new MyClass();	// 
		Myinterface myinterface = new YouClass();	//
		
		Object obj = new MyClass();					// 오브젝트 클래스는 오브젝트 주소로 모든 클래스를 담을 수 있다.
		Object youobj = new YouClass();				// 주소만 저장할 수 있다.
		Object heobj = new HeClass();				// 오브젝트는 모든 클래스를 상속하고 있다.
		
		Object array[] = new Object[3];
		
		array[0] = new YouClass();
	}

}
