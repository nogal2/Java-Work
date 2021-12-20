
public class MainClass1 {

	public static void main(String[] args) {
		/*
			loop문, 순환문, 반복문
			
			for: 지정 회수에 따라서
			
			형식:
				변수의 선언
				for(변수의(선언)초기화; 조건식; 연산식){
					처리
				}
				
				순서
				변수의 선언(1)
				
				for((3)	; (2)(6)(9)	; (5)(8)	){
					처리(4)(7)
				}
				
				(10)
		*/

		int n=0;
		
		for(; n<2; n++) {
			System.out.println("for loop " + n);
		}
		/*
		int num1;
		
		{
			int num2;
			num1 = 1;
		}
		
		num1 = 2;
		num2 = 4;
		/**/
		// 블록괄호 안에서 선언된 변수는 블록괄호 밖에서 초기화가 불가능하다. 반대로 블록괄호 밖에서 선언된 것은 블록괄호 안에서도 초기화 가능하다.
		// 그런의미에서 for문 안에서 i선언을 하면 그 i는 for문 안에서만 사용하기 위해서이다. for문 안에 i를 쓰는 이유는 바깥에 변수가 너무 많기 때문에 복잡해져서이다.
		for(int i=0; i<10; i++) {	// 0 ~ 9
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=1; i<=100; i++) { // 1 ~ 100
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=10; i>0; i--) {
			System.out.print(i + " ");
		}
		// decrement 도 가능하다.
		System.out.println();
		
		for(int i=0; i<10; i=i+2) {
			System.out.print(i + " ");
		}
		
		//endless loop 무한루프
		/*
		for(int i=0; ; i++) {
			System.out.print(i + " ");
		}
		*/
		
		// 1 ~ 10까지 숫자를 더한 합을 구하라
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println();
		System.out.println("sum: " + sum);
		
		// 학생 5명의 국어 성적의 합계와 평균
		// 90, 85, 95, 100, 85, 75
		int numArr[] = new int[6];
		numArr[0] = 90;
		numArr[1] = 85;
		numArr[2] = 95;
		numArr[3] = 100;
		numArr[4] = 85;
		numArr[5] = 75;
		
		sum = 0;
		for(int i=0;i<numArr.length; i++) {
			sum += numArr[i];
		}
		System.out.println("sum: " + sum);
		double avg = (double)sum / numArr.length;
		System.out.println("avg: " + avg);
		
		String names[] = {"홍길동", "일지매", "성춘향", "홍두께"};
		// 성춘향이 들어가 있는 부분을 꺼내보도록 하라.
		// 번호까지 찾아라.
		int number = 0;
		for(int i=0; i<names.length; i++) {
			number++;
			if(names[i].equals("성춘향")) {
				System.out.println("찾았습니다.");
				System.out.println("번호는" + number + "번 입니다");
			}
		}
		int max = numArr[0];
		// 최고 점수를 출력하라.
		for(int i=0; i<numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
			
		} 
		// i는 0이다. i는 numArr 배열의 갯수 6보다 작다. 다음순서를 진행하라. 
		// max는 numArr 첫번째 값90이다.  만약 맥스 90 이 numArr 첫번째 값보다 작으면 max에 numArr첫번째 값을 대입해라. 대입해서 max는 90이된다.
		// i를 1 증가시켜서 i는 1이다.
		// 1은 numArr 배열의 갯수 6보다 작다. 다음순서를 진행하라. 
		// max는 90인 상태이다.  만약 맥스 90 이 numArr 두번째 값 85 보다 작으면 max에 numArr첫번째 값을 대입해라. max는 90이니 대입하지 말고 i를 증가시킨다.
		// i를 1 증가시켜서 i는 2이다....
		// max 에 0을 주는 것 보다는 배열의 첫번째 값을 넣어주는게 좋다. 왜냐하면 -값이 나올 경우에 max=0; 으로 하면 0이 출력 되기 때문이다.
		System.out.println("max: " + max);
		
		
		// for each
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (int num : numArr) {	// [0] ~ [n-1]
			System.out.println(num + " ");
		}
		// num로 나오는건 보통 for문에  System.out.println(names[i]); 값이다. numArr의 배열을 num으로 넘기는 것이다.
		
		for(String name : names) {
			System.out.println(name + " ");
		}
		
		// for문 안에 for문 -> 2중 for문
		
		for(int i=0; i<10; i++) {
			System.out.println("i= " + i);
			for(int j=0; j<5; j++) { // i가 0일때 j는 5번 루프, i가 1일때 j는 5번루프... i가 10일때 j는 5번루프,, 총 j는 50번 루프한다.
				System.out.println("\tj= " + j);
			}
		}
		
		// 구구단 i*j = (i*j)
		for(int i=1; i<10; i++) {
			
			for(int j=1; j<10; j++) {
			System.out.print(i + " x " + j + " = " + (i*j) + " ");
			}
			System.out.println();
		}
		
		int array2[][] = {
				{11, 12, 13, 14},	// array2[0].length
				{21, 22, 23, 24},	// array2[1].length
				{31, 32, 33, 34},	// array2[2].length
		};
		
		for(int i=0; i < array2.length; i++) {
			
			for(int j=0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		/*인티저 i는 0으로 시작. i는 array2함수의 행의 갯수보다 작으면 다음 순서진행. 그리고 다 처리된 후 i는 1증가한다. 
		  인티저 j는 0으로 시작. j는 array2의  0행 안의 원소들의 갯수보다 작으면 다음 순서 진행. 그리고 마지막 처리가 끝나면 j는 1 증가.
		  프린트해라. array2[0][0]+"" 을. 11출력. 처리가 되었으니 j를 1 증가시켜라. j는 1이 되었다. array2의 0행의 원소 갯수들보다 작으니 다음 처리를 해라.
		  프린트해라. array2[0][1]+"" 을. 12출력. 처리가 되었으니 j를 1 증가시켜라. j는 2가 되었다. array2의 0행의 원소 갯수들보다 작으니 다음 처리를 해라.
		  프린트해라. array2[0][2]+"" 을. 13출력. 처리가 되었으니 j를 1 증가시켜라. j는 3이 되었다. array2의 0행의 원소 갯수들과 같으니 다시 바깥으로 나가라.
		  System.out.println();를 실행하고  i를 1 증가시켜라. i는 1이 되었다. 1은 행의 갯수 3보다 작으므로 다음 순서를 진행하라.
		  j는 0이다. 0은 array2의 1행의 원소들의 갯수 4보다 작다. 다음 순서를 진행하라.
		  프린트해라. array2[1][9]+""을. 21출력. 처리가 되었으니 j를 1 증가시켜라. j는 1이되었다....
		  
		 */
	
		
		
		
		
		
	}
		
}
