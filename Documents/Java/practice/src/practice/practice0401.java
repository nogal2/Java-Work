package practice;

import java.util.Scanner;

public class practice0401 {

	public static void main(String[] args) {
		// 변수의 문자가 숫자로만 되어 있는지 아니면 다른 문자인지를 판별하는 코드를 작성한다.
		char c = 'A';
		System.out.println((int)c);  
		
		int asccode = (int)c; //캐스트변환을 통해 아스키 코드로 변환
		boolean numberOK = true;
		if (asccode < 48 || asccode > 57) {
			numberOK = false;
		}
		// 숫자입니다.
		if(numberOK)  {
			System.out.println("숫자입니다");
		}// 숫자가 아닙니다.
		else {
			System.out.println("숫자가 아닙니다");
		}
		

		// 입력된 문자열이 모두 숫자로 되어 있는지 아닌지 판정할수 있는 코드.
		// (아스키코드)
		// 123 123a 1s23
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number = ");
		String strNum = sc.next();		// 문자열로 입력하게 되면 일단 배열이 된다. char[]. 숫자로 입력해도 배열이다.
		
		numberOK = true;
		for(int i=0; i < strNum.length(); i++) { // String에 있는 길이는 함수이기 때문에 length에 ()가 붙는다.
			char ch = strNum.charAt(i);
			int n = (int)ch;
			if(n < 48 || n > 57) {
				numberOK = false;
				break;
			} 
		}
		
		if (numberOK) {
			System.out.println("모두 숫자입니다.");
		}
		else {
			System.out.println("숫자가 아닌 문자가 포함되어 있습니다.");
		}
		
		// 영어 단어를 입력 -> 입력한 것을 toUppercase 나 toLowercase를 사용하지 않고, 모두 대문자로 바꾸라.
		String eng = "hello";
		String result = "";
		char bh;
		for(int i=0; i<eng.length(); i++) {
			bh=eng.charAt(i);
			int k = (int)bh;
			if(k > 97 || k < 123) {  // 97보다 컸을때 만 하면됨.
				k = k-32;
				
			
			}	
			result = result + (char)k;
			
		}
		System.out.println(result);
				
		
		
		
	}

}
