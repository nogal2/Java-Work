import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) throws Exception {
		
		// 입력(console): 입력을 받을 때 변수에 저장해준다.
		Scanner scan = new Scanner(System.in); //  입력을 받을때 필요한 처리를 위한 준비작업이다.
		/*
		int iNumber;
		System.out.print("정수 = ");
		iNumber = scan.nextInt();					// 입력 받아야만 아래에서 출력해서 나타냄
		System.out.println("입력 받은 수:" + iNumber); // 입력 받은 수 확인
		*/
		
		/*
		double dNumber;
		
		System.out.print("실수= ");
		dNumber = scan.nextDouble();
		System.out.println("입력받은 실수:" + dNumber);
		*/
		
		 /*
		boolean b;
		
		System.out.print("true/false = ");
		b = scan.nextBoolean();
		System.out.println("논리형" + b);
		*/
		
		
		/*
		String str;
		
		System.out.print("string = ");
		str = scan.next(); // 이 기능은 빈 문자를 못받고 다 짤라버린다. 그래서 hello world로 입력하면 hello만 나온다.
		System.out.println("입력된 문자열: " + str);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 이건 클래스다.
		// buffer는 저장공간을 읽어주겠다는 것.  InputStreamReader는 입력에 흐름에 따른 것을 읽어주겠다는 것.
		
		String str;
		
		System.out.print("string= ");
		str = br.readLine();			//띄어쓰기는 유효
		System.out.println("입력된 문자열: " + str);
	}

}
