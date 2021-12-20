
public class MainClass1 {

	public static void main(String[] args) {
		/*
		 	Wrapper Class(object)
		 	일반 자료형(Char, int, double...)을 사용하기 편리하도록 구현해 놓은것.
		 	"문자열": 각각의 문자가 합해져서 만들어짐. 
		 	String -> Wrapper Class  : 문자열을 쉽게 다룰수 있도록 하는 클래스다. (도구모음)
		 	char chArr[] = {'h','e','l','l','o'};   String은 내부에 이런 구조로 되어 있음.
		 	
		 	일반 자료형					Wrapper Class(object)
		 	boolean					Boolean
		 	
		 	byte					Byte
		 	short					Short
		 	int						Integer*	:
		 	long					Long
		 	
		 	float					Float
		 	double					Double*		:
		 	
		 	char					Character
		 	char[]					String*		:
		 	
		*/
		
		// Integer == int
		int i = 123;
	//	Integer iobj = 123;
		Integer iobj = new Integer(123);
		System.out.println("i= " + i);
		System.out.println("iobj= " + iobj);
		
		// class == 설계,구성 + 변수 + 함수(메소드) = 기능
		// MyClass cls = new MyClass();
		// 
		
	//	String str = "hello";
	//	String strObj = new String("hello");	//이게 정석대로 사용하는 것.
		
		// Integer 의 주요한 기능
		// 1. 숫자 -> 문자열
		Integer objNumber = 123;
		String str = objNumber.toString() + 1;
		System.out.println(str);	// 숫자를 문자열로 바꾼 것.
		//일반적으로는 사용을 잘 안함. 아래와 같이 할 수 있기 때문에.
		
		int num = 123;
		String str1 = num + "";
		System.out.println(str1);
		
		double dnum = 123.456;
		String str2 = dnum + "";
		System.out.println(str2);
		
		// 2. 문자열 -> 숫자 **
		String str3 = "12345";
		int n = Integer.parseInt(str3);
		System.out.println(n);
		
		String str4 ="1234.5678";
		double d = Double.parseDouble(str4);
		System.out.println(d);
		
		
		// 3. 2진수, 8진수, 10진수, 16진수 변경
		
		// 10진수 -> 2진수(0,1)
		int num10 = 16;
		String num2 = Integer.toBinaryString(num10);
					// Integer.toOctalString(i)		8진수
					// Integer.toHexString(i)		16진수
		System.out.println(num2);
		
		
		// 2진수 -> 10진수
		/* 
			1010 1100 
			8421 8421
			(16^1 * 8+2) + (16^0 * 8+4)  = 172
		*/
		String number2 = "10101100";
		int number10 = Integer.parseInt(number2, 2); //** 중요
		System.out.println(number10);
		
		// 10진수 -> 8진수
		int n10 = 20;
		String n8 = Integer.toOctalString(n10);
		System.out.println(n8);
		
		// 8진수 -> 10진수
		String s8 = "25";
		int s10 = Integer.parseInt(s8, 8);
		System.out.println(s10);
		
		// 10진수 -> 16진수
		int h10 = 61;
		String h16 = Integer.toHexString(h10);
		System.out.println(h16);
		
		
		// 16진수 -> 10진수
		String e16 = "3D";
		int e10 = Integer.parseInt(e16, 16);
		System.out.println(e10);
	}

}
