package cls;

import inter.Myinterface;
import inter.Youinterface;

public class YouClass implements Myinterface, Youinterface {
	// 다중 상속이 가능하다.
	@Override
	public void func() {
		System.out.println("YouClass func()");
		
	}

	@Override
	public void method() {
		System.out.println("YouClass method()");
	}
	
}
