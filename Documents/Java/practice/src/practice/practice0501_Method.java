package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practice0501_Method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 아스키 코드 값을 입력하면 문자를 확인할 수 있는 함수를 작성하라.
		// static char ascToChar(int asc)

		// 두수의 나눗셈을 하는 함수를 작성하라. 하나의 함수에서 몫과 나머지를 구한다.

		// 두점 사이의 거리를 구하는 함수를 작성하라. 
		// static double distance(double x1, double y1, double x2, double y2)
		// 	root (y2 - y1)2승 + (x2 - x1)2승

		// 입력된 숫자가 정수인지 실수인지 확인할 수 있는 함수를 작성하라.
		// static boolean isDouble(String snumber)
		
	
		int a= division(11, 2);
		System.out.println(a);
		
	
	}
	// 아스키 코드 값을 입력하면 문자를 확인할 수 있는 함수를 작성하라.
	// static char ascToChar(int asc)
	static char ascToChar(int asc) {
		 
		
		
	}
	
	// 두수의 나눗셈을 하는 함수를 작성하라. 하나의 함수에서 몫과 나머지를 구한다.
	
	static int division(int a, int b) {
		
		int divi1[] = new int[2]; 
		for (int i=0; i < 2; i++) {
			if (i==0) {
				divi1[i] = a / b;
			}
			else {
				divi1[i] = a % b;
			}
			
		} 
		
	}
	
	// 두점 사이의 거리를 구하는 함수를 작성하라. 
	// static double distance(double x1, double y1, double x2, double y2)
	// 	root (y2 - y1)2승 + (x2 - x1)2승 root= Math.sqrt() / 제곱= Math.pow()
	static double distance(double x1, double y1, double x2, double y2) {
		double powy = Math.pow(y2 - y1, 2);
		double powx = Math.pow(x2 - x1, 2);
		double root = Math.sqrt(powy+powx);
		
		return root;
		
	}
	
	// 입력된 숫자가 정수인지 실수인지 확인할 수 있는 함수를 작성하라.
	// static boolean isDouble(String snumber)
	static boolean isDouble(String snumber) {
		boolean ok = true;
		for (int i=0; i < snumber.length(); i++) {
			char c = snumber.charAt(i);
			int n = (int)c;
			if(n == 46) {
				ok= false;
				break;
			}
			else {
				
			}
		}
		return ok;
	}
}
