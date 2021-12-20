
public class MainClass1 {

	public static void main(String[] args) {
		/*
		  	loop
		  	
		  	for(초기화;조건식;연산식) {
		  		처리
		  	}
		  	
		  	while문
		  	
		  	초기화
		  	while(조건식){	if는 한번만 하고 빠져나오는데 while은 조건이 맞을때까지 돌아감. 	// > < > =
		  		처리
		  		연산식
		  	}
		  	
		  	do while문
		  	
		  	초기화
		  	do {
		  		처리
		  		연산식
		  	}while(조건식);
		*/
		
		int w;
		w = 0;
		while(w < 10) {
			System.out.println("while loop" + w);
			w++;
		}
		// for문도 똑같이 가능함.
		
		/*
			program 작동 원리
			
			초기화 - initialize
			메인 - loop(무한루프)
			해방(메모리) - release
			
			
		*/
		
		int dw;
		dw = 110;
		do {
			System.out.println("do while loop" + dw);
			dw++;
		}while( dw < 10 );
		
		// 2중 while 문 구구단
		
		int i,j;
		i=1;
		while(i < 10) {
			j=1;
			
			while(j<10) {
				System.out.print(i + "*" + j + "=" + i*j + " ");
				j++;
			} 
			i++;
			System.out.println();
		}
		/*
			i는 1이다. 1이 10보다 작으니까 아래를 처리하라. 변수 j를 선언한다. j는 1이다.아래를 처리하라. j는 10보다 작으니까 아래를 처리하라.
			1*1=1 이 나온다. j를 증가시켜서 2가된다. 2는 10보다 작으니까 다음을 처리하라. 1*2=2 이다. j를 1 증가시켜서 3이다. ...
			j를 1 증가시켜서 10이다. j는 10과 같으니까 밖으로 나온다. i를 1 증가시켜라. 첫 조건에서 다시 처리를 시작...
		*/
		
		
		
	}

}
