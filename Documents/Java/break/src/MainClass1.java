import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		/*
		  	break ==	탈줄 escape
		  				loop문을 멈춘다는 의미이다.
		  				
		  	switch, for, while, do while 중 for문에서 가장 많이 사용된다. 
		  	
		  	switch(variable){
		  		case value:
		  			processing;
		  			break;
		  	}
		  	
		  	for(int i=0; i<100; i++) { 0...99
		  		if(조건){
		  			break;
		  		}
		  	}
		  	
		  	while(w < 100) {
		  		if(조건){
		  			break;
		  		}
		  		w++;
		  	}
		  	
		*/
		
		for(int i=0; i<10; i++) {
			System.out.println("for loop " + i);
			if( i == 5 ) {
				break;
			} 
		}
		/* i는 0이다. 0은 10보다 작다. 아래를 처리하라. 0 출력 i는 5인가? 아니다. 그럼 i를 1 증가시킨다. i는 1이다...
		 	i를 1 증가시켜서 i는 5다. 
		  */
		
		int array[] = {1, 4, -7, 3, 8};
		for(int i=0; i<array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
			if(array[i] < 0) {
				break;
			}
		}
		
		Scanner scan = new Scanner(System.in);
		int number;
		
		while(true) {
		System.out.print("숫자를 입력해주세요(>0) = ");
		number = scan.nextInt();
		
		if(number > 0) {
			break;
		}
		System.out.println("양수를 입력해 주세요.");
		}
		
		// 2중 for문 탈출 break문 하나당 루프문 하나를 탈출한다.
		for(int i=0; i<10; i++) {
			System.out.println("i= "+ i);
			for (int j=0; j<8; j++) {
				System.out.println("\tj = " + j);
				
				if(i==5 && j==3) {
					break;	
				}
			}
		} 
		// 한번 탈출하고 더 큰 for문 부터 다시시작
		
		// 한번에 빠져나오는 방법.
		// 1. loop문의 개수에 맞게 break를 설정
		boolean b = false;
		
		for(int i=0; i<10; i++) {
			System.out.println("i= "+ i);
			for (int j=0; j<8; j++) {
				System.out.println("\tj = " + j);
				
				if(i==5 && j==3) {
					b = true;
				}
				if(b == true) {
					break;
				}
			}
			if(b == true) {
				break;
			}
		} 
		/*	i는 0이다. 0은 10보다 작다. i=0.  다음 for로 간다. j는 0이다. j는 8보다 작다. j=0. if를 처리한다. 만약 i가 5이고 j가 3이면 b는 true이다.
		 	그러니 b는 false다. j를 1 증가시킨다. ... j는 7이다. .... i를 1 증가시켜서 i는 1이다. ...
		 	i는 5다. ... j는 3이다. i는 5이고 j는 3이다. b는 true이니 두번째 for문에서 나간다. b는 true이니 첫번째 for문을 나간다.
		*/
		
		// 2. break를 셋팅
		out:for(int i=0; i<10; i++) { //  out: -> 사용자 지정 out은 자기가 알아서 지을 수 있음.
			System.out.println("i= "+ i);
			for (int j=0; j<8; j++) {
				System.out.println("\tj = " + j);
				
				if(i==4 && j==5) {
					break out;	
				}
			}
		} 
		
	
	}

}
