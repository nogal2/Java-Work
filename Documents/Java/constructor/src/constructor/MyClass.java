package constructor;

public class MyClass {
	// 멤버변수
	int number;
	String name;
	
	MyClass() {	//constructor. 이걸 안적어도 문제는 발생하지 않는다.
		System.out.println("MyClass 기본생성자: 기본생성자는 매개변수가 없는것.");
	}
	
	MyClass(int num) {
		System.out.println("MyClass(int num) 생성자");
	}
	
	MyClass(int number, String name) {
		this.number = number;	//this. 는 해당 클래스 안에 멤버변수를 가리킨다.	
		this.name = name;
		System.out.println("MyClass(int num, String na) 생성자");
	}
	
	// this: 자기 참조	-> 현재 객체가 저장되어 있는 주소.
	
	MyClass getThis() {
		return this;
	}
}
