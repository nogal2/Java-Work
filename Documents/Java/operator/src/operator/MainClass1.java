package operator;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		  Operator: 연산자
		  + - * / %	
		  ++		increment
		  --		decrement
		  	  
		*/
		
		int number1, number2;
		int result;
		
		number1 = 25;
		number2 = 7;
		
		result = number1 + number2; // 사칙연산은 오른쪽에서 연산이 이루어지고 왼쪽으로 들어가는 것이다. number1+number2 를 연산 후 result로 값을 받음
		System.out.println(result);
		
		result = number1 - number2;
		System.out.println(result);
		
		result = number1 * number2;
		System.out.println(result);
		
		result = number1 / number2;	// 분모가 0이 될 경우에 문제가 발생한다.
		System.out.println(result);
		
		// Arithmetic	== 산수, 연산
		
		result = number1 % number2;
		System.out.println(result);
		
		// result = (number1 * number2) / number2;
		// ++ --
		number1 = 0;
		// 자기 자신을 갱신하는 것.
		number1 = number1 + 1;
		System.out.println(number1);
		number1 += 1;
		System.out.println(number1);
		
		// increment == ++ == +1
		// decrement == -- == -1
		number1++;
		System.out.println(number1);
		number1--;
		System.out.println(number1);
		++number1;
		System.out.println(number1);
		--number1;
		System.out.println(number1);
		
		int num1, num2;
		num1 = 0;
		num2 = 0;
		
		num2 = num1++;
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		// num1, num2에 먼저 대입하고 처리가 된후 ++가 연산되어서 num1=1 num2=0 인것이다. 만약 ++가 num1 앞에 있으면 ++가 먼저 연산되고 후에 대입이 돼서 둘다 1이 나온다.
		// (num1++); 여도 똑같이 ++는 처리된 후 연산됨.
		
		
		
		
	}

}
