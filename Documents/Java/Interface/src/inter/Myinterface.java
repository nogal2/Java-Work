package inter;

/*
	추상메소드만을 포함하는 형태(template)
	멤버변수를 포함할 수 없다.
	일반 메소드도 포함할 수 없다.
	
	상속 받은 후 메소드를 정의한 후에 사용할 수 있다.
	class의 사양을 파악할 수 있는 용도
	확장성에서 사용 
	선언 역할을 해줌.
	다중 상속이 가능하다
*/

public interface Myinterface {
	
//	private int number;		사용 못함
	
//	public void method() {}	사용 못함
	public void method();
	
}
