
public class MainClass {

	public static void main(String[] args) {
		/*
			Over Load:	함수 명은 같고 매개변수(parameter)의 자료형이나 갯수가 다른 것을 의미한다. (동명이인이라고 생각하면 된다)
			
			예)
			paint():	image drawing
			paint(int x, int y)
			paint(int z)
			paint(char c)
			paint(char c, int i)
			paint(int i, char c)
			
			paint(int n, char ch) X -> 위에것과 비교해보면 가인수만 다르다. 이건 안된다.
			int paint(int i, char c) X -> 리턴값만 다른것도 안된다.
			=> 함수는 같지만 매개변수들이 다 다름. 컴파일러에서는 다른 함수로 취급한다. 그래서 다른함수는 매개변수로 구분한다.
			
			
		*/

		method();
		
		method('A');
		
		method(10);
		
		method('B', 12);
		
		method(12, 'B');
		
		int sum = sumProc(90, 95, 100, 75, 80);
		System.out.println(sum);
		
		sum = sumProc(10, 20, 30);
		
		sumProc("성춘향", 100,90,87);
		
	}
	
	static void method() {
		System.out.println("method()");
	}
	
	static void method(char c) {
		System.out.println("method(char c)");
	}
	
	static void method(int i) {
		System.out.println("method(int i)");
	}
	
	static void method(char c, int i) {
		System.out.println("method(char c, int i)");
	}
	
	static void method(int i, char c) {
		System.out.println("method(int i, char c)");
	}
	/* 실행 안되는 함수. (가인수만 다를때)
	static void method(int n, char ch) {
		System.out.println("method(int i, char c)");
	}
	*/
	
	/* 리턴명령어만 다른 경우도 사용할 수 없다. (리턴 값을 줘도 안됨)
	static int method(char c, int i) {
		System.out.println("method(char c, int i)");
		return 1;
	}
	*/
	
	// 가변 인수 ...  => 배열로 인식함 : int num[] 일 경우에는 배열만 넣어야 되지만 ...num 은 값을 입력해도됨.
	 static int sumProc(int...num) {
		 int sum = 0;
		 for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	 }
	
	 // 가변인수를 일반 인수랑 같이 쓸 때에는 맨 뒤에 써야한다.
	 static void sumProc(String name, int...num) {
		int sum= 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(name + "님의 합계는" + sum + "입니다.");
	 }
	 
	 
}
