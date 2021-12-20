package cls;

public class ChildClass extends ParentClass{

	/*
		Over Ride:	부모 클래스에서 상속받은 메소드를 고쳐 기입하는 것
		조건
		이름과 메소드의 이름과 매개변수, 리턴값이 동일해야한다.
		만약 매개변수가 다르면 오버로드.
		1. 상속받은 함수를 고쳐 작성하여 사용.
		2. class 관리
		
	*/
	//OverRide
	@Override	// == name space -> 주석, 표시
	public void pMethod() {
	//	super.pMethod();	슈퍼를 적고 쓰면 오버라이딩이 안된 부모 메소드를 호출함.
		
		System.out.println("ChildClass pMethod()");
		
	}
	
		
	public void func() {
		pMethod();	//그냥 호출하면 this 가 생략되어있다고 생각하면됨.
		method();	// 상속
	}
	
}
