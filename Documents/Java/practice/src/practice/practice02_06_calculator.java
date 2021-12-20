package practice;

import java.util.Scanner;

public class practice02_06_calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int number1, number2;
		String oper;
		int result= 0;
		
		
		// 1. 입력
		// 1번째 숫자
		number1 = numberInput("첫번째 수 = ");

			// 연산자
		oper = operatorInput();

		// 2번째 숫자
		number2 = numberInput("두번째 수 = ");

		// 2. 연산
		result = calculator(number1,number2,oper);
		
		// 3. 결과 출력
		resultPrint(number1, number2, oper, result);
		
	}
	
	static int numberInput(String msg) {
		Scanner sc = new Scanner(System.in);
		String numStr;
		while(true) {
			System.out.print(msg);
			numStr = sc.next();
			boolean ok = numberCheck(numStr);
			/*
			for(int i=0; i < numStr.length(); i++) {
				int k = numStr.charAt(i); 
				if(k < 48 || k > 57 ) {
					ok = false;
					break;
				}
			}
			*/
			if(ok == true) {
				break;
			}
			System.out.println("숫자를 정확히 입력해주세요.");
		}
		int number = Integer.parseInt(numStr);
		return number;
	}
	
	static boolean numberCheck(String numStr) {
		boolean ok = true;
		for(int i=0; i < numStr.length(); i++) {
			int k = numStr.charAt(i);  // 입력받은 문자열에서 한글자씩 산출하는 문장
			if(k < 48 || k > 57 ) {
				ok = false;
				break;
			}
		}
		return ok;
	}
	
	static String operatorInput() {
		Scanner sc = new Scanner(System.in);
		String oper = "";
		System.out.print("연산(+, -, *, /) = ");
		while(true) {
		oper = sc.next();
		if(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
			break;
		}
		System.out.println("연산자를 정확히 입력해 주십시오");
		}
		return oper;
	}
	
	static int calculator(int number1, int number2, String oper) {
		int result = 0;
		switch(oper) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
	}
	return result;
	}
	
	static void resultPrint(int number1, int number2, String oper, int result) {
		System.out.println(number1 + " " + oper + " " + number2 + "= " + result);
	}

}
