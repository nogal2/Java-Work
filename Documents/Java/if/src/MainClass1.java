
public class MainClass1 {

	public static void main(String[] args) {
		/*
			if	: 조건문
			
			형식	: if(조건){    // 조건 true/false 조건이 true면 처리하고 조건이 false면 처리하지 않고 넘어간다.
					처리
				}
		  	
		  	조건	: ==(같다), >(크다), <(작다), >=(크거나 같다), <=(작거나 같다), !=(같지 않다)
		  	
		  	다수의 조건: 논리 연산자와 같이 사용
		  				&&(AND), ||(OR), !(NOT)
		  			
		  			if( 조건1 && 조건2 ){
		  				
		  			}
		  					  					 
		*/
		/*
		int number = 5;
		if(number > 0) { // <- true
			System.out.println("number는 0보다 큽니다");
		}
		
		if(number == 5) {
			System.out.println("number는 5입니다.");
		}
		
		if(number >= 5) {
			System.out.println("number는 5보다 크거나 같습니다.");
		}
		
		boolean b = true;
		if( b == true) { // <- boolean은 생략 가능 아래식과 같다.
			System.out.println("b는 true입니다.");
		} 
		
		if (b) {
			System.out.println("if( b )는 true입니다");
		}
		
		b= false;
		if(b == false ) {
			System.out.println("b는 false입니다");
		}
		
		if(!b) { // <- 위에 b==false 와 같다. boolean 만 가능하다.
			System.out.println("if( b )는 false입니다");
		} 
		
		if(number > 0 && number < 10) {
			System.out.println("number는 0보다 크고 10보다 작다.");
		}
		
		if(number > 0 && number < 10 && b == false ) {
			System.out.println("number는 0보다 크고 10보다 작고 b는 false입니다.");
		}
		
		if(number > 0 || number > 10) {
			System.out.println("number는 0보다 크거나 10보다 크다");
		}
		*/
		//============================
		/*  if else
		  	if (조건) {
		  		처리1
		  	}else {
		  		처리2
		  	}
		  	
		  	삼항 연산자
		  	값 = ( 조건 ) ? 값1 : 값2     값이 참이면 값1 거짓이면 값2
		  	
		  	
		*/
		/*
		int number = 69;
		
		if(number >= 70) {
			System.out.println("통과입니다");
		}
		else {
			System.out.println("재시험입니다");
		}
		
		String result = (number >= 70) ? "통과입니다":"재시험입니다";
		System.out.println(result);
		
		int num = (number > 60) ? 10:5;
		System.out.println(num);
		*/
		
		/*
			조건분기
			if( 조건1 ) {
				처리1
			}
			else if( 조건2 ) {
				처리2
			}
			else if( 조건3 ) {
				처리3
			}
			else { <- 해도 되고 안해도 됨
				처리4
			}
		  
		*/
		/*
		int number = 90;
		if(number == 100) {
			System.out.println("A+ 입니다");
		}
		else if(number >= 90) {
			System.out.println("A 입니다");
		}
		else if(number >= 80) {
			System.out.println("B 입니다");
		}
		else if(number >= 70) {
			System.out.println("C 입니다");
		}
		else {
			System.out.println("재시험 입니다");
		}
		// => 이렇게 점수와같은 비교해야할것이 있을때는 가장 높은것 부터 배열한다.
        */
		
		// 조건문 안에 조건문
		/*
		  	if(조건1) {
		  		if(조건2) {
		  			처리1
		  		}
		  		else{
		  			처리2
		  		}
		  	}
		 
		*/
		
		int number = 95;
		// 95 이상 A+
		// 95 이하 A
		
		if(number >= 90) {
			if(number >= 95) {
				System.out.print("A+");
			}
			else {
				System.out.print("A");
			}
			System.out.println(" 입니다.");
		}
		
		// String
		String str1 = "안녕하세요";
		String str2 = "안녕";
		str2 = str2 + "하세요";
		
		if(str1 == str2) {
			System.out.println("같은 문자열입니다");
		}
		else {
			System.out.println("다른 문자열입니다");
		}
		
		// 문자열을 비교할때는 위와 같이 하면 안되고 아래와 같이 equals 를 써야한다.
		
		// equals 비교하는 함수
		if(str1.equals(str2)) { // str1의 문자열과 str2의 문자열이 같다.
			System.out.println("equals 같은 문자열입니다");
		}
		else {
			System.out.println("equals 다른 문자열입니다");
		}
		
		
		
		
	}

}
