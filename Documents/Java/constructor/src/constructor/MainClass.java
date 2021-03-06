package constructor;

public class MainClass {

	public static void main(String[] args) {
		/*
			constructor:	생성자
							객체(instance) 생성시에 호출.
							메소드
							클래스명과 같다.
							return값이 없다.
							overload가 가능하다.
							생략이 가능하다.
							별도의 호출이 불가능하다. 딱 한번 호출됨.
							목적: 맨 첫번째 생성시 기본값을 무조건 넣어주는것. 그리고 첫번째만 가능. (초기화 하려고)
							
			destructor:		소멸자 < - X 지금은 감추어져서 사용을 안함.
			
		*/
		
		int array[] = { 11, 22, 33};	// 배열 초기화
	//	MyClass cls = {11, "홍길동"};		// 클래스에서는 초기화가 불가능. 그래서 constructor가 나왔다. 초기화하기 위해 나온 것.
		
	//	MyClass cls = new MyClass();
	//	MyClass cls = new MyClass(1);
		MyClass cls = new MyClass(2, "hello");		// cls 저장 영역은 Heap 이다.
		System.out.println(cls);
		
		MyClass t = cls.getThis();
		System.out.println(t);
		
		MyClass cls1 = new MyClass();
		System.out.println(cls1);
		MyClass t1 = cls.getThis();
		System.out.println(t1);
	}

}
