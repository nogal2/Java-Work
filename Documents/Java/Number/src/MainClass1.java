
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	숫자(상수)	: 지정한 숫자(변할 수 없는 숫자). 0~10
		 	숫자의종류	:
		 				2진수		: 0, 1
		 				8진수		: 0 ~ 7, 8->10, 8진수 11은 10진수로 9이다.
		 				10진수	: 우리가 사용하는 숫자 0~9
		 				16진수	: 0~9 A B C D E F(15), 10진수 = 16진수 0xF , 
		 	
		 	
		 	변수(공간)	: 어떤 값을 넣을 수 있는 공간/그릇. == variable
		 			1. 변수를 선언. 변수명을 작명.
		 			2. 자료형 지정.
		 			
		 			문자, 숫자, 문자열, 논리값.
		 			
		 			문법
		 			자료형지정 변수명;	=>변수의 선언		<- 그릇을 준비
		 			변수명 = 값;		=>변수의 값의 대입	<- 그릇에 내용물을 넣는다.
		 	
		 */
		// 정수 == integer
		int number;
		number = 123;
		
		System.out.println(number); // 출력
 
		// 변수의 작명 규칙: 대소문자를 구분한다.
		int a;
		int A;   
		// => 위 두개는 다른 변수이다. 
		
		// 변수의 작명 규칙: 예약어는 사용할 수 없다. *예약어는 프로그램에서 설정 되어 있는 단어이다.
		// int int; -> 이것은 사용할 수 없다. 왜냐하면 int는 이미 설정 되어 있는 단어이기 때문이다.
		// int 2a; -> 앞에 숫자가 오면 안돼서 사용할 수 없다.
		// int 123; -> 숫자만 사용하는것도 안된다.
		
		int num123; // => 문자 뒤에 숫자사용은 가능하다.
		
		// int +number;		=> 연산자는 사용할 수 없다.
		// int -number;		=> 연산자는 사용할 수 없다.	
		// int *number;		=> 연산자는 사용할 수 없다.
		// int /number;		=> 연산자는 사용할 수 없다.
		
		int _number; // => 언더바는 사용가능하다. 그런데 언더바는 웬만해서는 사용 안 하는게 좋다.
		
		// 변수명은 간편하게 줄이는게 좋다.
		int number_position_char;
		int numberPositionChar;
		int numPosChar;
		int iNumPosChar; // int 정수만 넣을 수 있는 데이터 변수명을 지정하면 일할 때 편리하다.
		
		int 숫자1;	// 한글도 가능하다. 하지만 웬만해서는 사용 안 하는게 좋다.
		숫자1 = 333;
		System.out.println(숫자1);
		
		// 흔한 명칭은 사용은 피하는 것이 좋다.
		// ex) length, object, size
		
		// 변수의 자료형의 종류
		
		// 1. 숫자 자료형
		// 정수
		// byte, short, int, long
		byte by;	// 1 byte == 8bit 0000 0000 -> 1111 1111 -> 256개
					// 				  맨 앞에 있는 bit는 부호를 나타낸다. 0일때 + , 1일때 -
					// 				  -128 ~ 127 => 그래서 표현할수 있는 숫자가 이정도의 범위이다.
		by = -128;
		
		short sh;	// 2 byte == 16bit
		sh = 12345; // 만 단위를 넘어가면 안 된다.
		
		int i;		// 4 byte == 32bit 특수한 경우를 제외하고는 int를 사용한다.
		i = 23212345;
		
		long l;		// 8 byte 
		l = 1231245548593484L;
		
		// 실수
		// float, double
		float f;	// 4 byte	float는 거의 안쓴다.
		f =123.45678F;
		
		double d;	// 8 byte	double을 주로 사용한다. 정확한 소수점 수치를 요구할때 사용.
		d = 12.3456789;
		
		
		// 2. 문자(열) 자료형
		// 문자
		char c;		// 2 byte character		ASCII code(한글을 제외한 영문만 들어감) < UNI code < MULTIByte code
		c = 'A'; 	// 한 문자만 집어 넣을 때는 작은 따옴표
		c = 'b'; 	// Javascript: var(let) 으로 통일되어있음. 
		c = '+';
		c = '한';
		c = ' ';		// null 문자
	//	c = '하나';
		
		// 문자열	hello, nice to meet you
		String str;		// wrapper class. 
		str = "Hello"; 
		str = "nice to meet you";
		System.out.println(str);
		
		
		
		// 3. 논리형	true/false
		boolean b;	// true(1) or false(0) 만 값이 들어감. 
		b = true;
		b = false;
		System.out.println(b);
		
		
	}

}
