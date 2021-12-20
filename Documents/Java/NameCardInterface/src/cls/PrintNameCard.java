package cls;

import inter.PrintInterface;

public class PrintNameCard implements PrintInterface {	// PrintInterface를 상속받는다.

	@Override
	public void print(NameCard nc) {	// NameCard를 nc라는 매개변수로 호출한다.
		System.out.println("이름:" + nc.name);	//nc에 있는(NameCard) name변수를 가져와서 프린트한다.
		
	}
	
}
