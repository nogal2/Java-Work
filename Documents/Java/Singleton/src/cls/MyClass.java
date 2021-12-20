package cls;

import singleton.Singleton;

public class MyClass {
	private int number;
	private String name;
	public MyClass() {
		number = 333;
		name = "홍길동";
	}
	
	public void method() {
		Singleton s = Singleton.getInstance();
		s.number = this.number;	// this는 안넣어도 되지만 헷갈릴까봐
		s.name = this.name;
	}

	@Override
	public String toString() {
		return "MyClass [number=" + number + ", name=" + name + "]";
	}

//	public int getNumber() {
//		return number;
//	}
//
//	public String getName() {
//		return name;
//	}

	

}
