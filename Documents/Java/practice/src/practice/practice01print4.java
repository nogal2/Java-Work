package practice;

public class practice01print4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개의 정수 값을 입력 받고 x, y 변수에 저장한 후에 x,y 값을 바꾸고 출력하도록 프로그램을 작성하라.
		
		int x, y;
		int temp;
		
		x=1;
		y=2;
		
		temp = x;
		x = y;
		y = temp;

		
		System.out.print(y);

	
	}

}
