package practice;


import java.util.Scanner;

public class practice0204 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
			계산기
		 
		 
		*/
		
		// 입력 받는다.
		double first;
		double second;
		String operator;
		
		first = scan.nextDouble();
		operator = scan.next();
		second = scan.nextDouble();
			// 1번째 숫자
			// 연산자
			// 2번째 숫자
		
		
		// 연산처리
		switch(operator) {
			case "+":
					System.out.print(first + second);
					break;
			case "-":
				System.out.print(first - second);
				break;
			case "*":
				System.out.print(first * second);
				break;
			case "/":
				System.out.print(first / second);
				break;
			default:
				System.out.print("잘못 입력하셨습니다.");
				break;
		}
		
		
		// 결과 출력

		
	}

}
