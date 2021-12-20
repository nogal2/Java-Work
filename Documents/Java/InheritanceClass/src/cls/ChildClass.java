package cls;

public class ChildClass extends ParentClass {
	
	private double height;
	
	public ChildClass() {
		super(123, "hello"); 		// 슈퍼는 부모 클래스에 있는 생성자를 호출. 슈퍼는 부모클래스에 있는 생성자를 알려주는 것이다. this() 는 클래스 내에 생성자 호출.
		System.out.println("ChildClass ChildClass()");
	}
	
	public ChildClass (int number, String name, double height) {
		super(number, name);		//슈퍼도 맨 위에 작성해야한다. this와 super는 같이 사용 못한다. 상속을 받을 클래스의 멤버변수를 사용할때 씀.
		this.height = height;
	}
}
