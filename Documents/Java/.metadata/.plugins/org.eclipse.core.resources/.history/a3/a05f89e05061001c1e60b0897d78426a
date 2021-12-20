package cls;

public class MyClass {
	// 변수의 종류
	private int number;			// 멤버변수, 저장영역: heap
	public static int staticNumber;	// 정적변수, 저장영역: static		프로그램을 끄면 이 메모리 영역이 사라진다(프로그램의 시작과 끝을 같이함).
									// global 변수로도 사용하는 경우가 있다. global variable
	public void method(int number) {	// 매개변수	저장역역: stack	해당 메소드의 마지막 중괄호가 닫힐때 매개변수가 사라짐.
		int localnumber;				// 지역변수	저장영역: stack	해당 메소드의 마지막 중괄호가 닫힐때 매개변수가 사라짐.
		
	}
	
	public void func() {
		int localnumber = 0;
		localnumber++; 		
		number++;			// 멤버 변수와 정적변수는 자동적으로 0으로 초기화됨. 그래서 문제가 안생긴다.
		staticNumber++;		// 
		
		System.out.println("local변수:" + localnumber);
		System.out.println("멤버변수:" + number);
		System.out.println("정적변수:" + staticNumber);
		
		YouClass.swap(null, localnumber, localnumber);
		
	}
	
}

