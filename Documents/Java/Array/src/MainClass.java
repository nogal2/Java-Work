import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
			배열의 목적
			int num1, num2, num3, num4, num5;	변수는 독립적으로 존재해야한다. 이거를 하나의 묶음으로 관리하기 위해서 배열이 나왔다.
			num1 = 11;
			num2 = 22;
			num3 = 33;
			
			Array:	배열. 같은 자료형 변수들의 묶음. <- 변수들
					목적: 변수 관리. 관리는 index number로 구분한다.
			형식 :
					자료형 배열변수명[] = new 자료형[배열의 총개수];
					배열변수명[index number]	-> index number는 0부터. index number는 묶어놓은 변수를 구분하기위해서
					int arrName[] = new int[5]; -> 정수형 변수 5개 선언
									위의 것은 동적(dynamic)할당이다.		정적(static)	
					arrName[0] = 11;
					arrName[1] = 22;
					arrName[2] = 33;
					arrName[3] = 44;
					arrName[4] = 55;
					* 자료형 배열변수명[] = new 자료형[배열의 총개수]; => 왼쪽항과 오른쪽 항의 저장되는 곳은 다르다. 왼쪽항은 stack. 오른쪽항은 heap에 저장됨.
		*/
		
	//	int array[] = new int[5];
	//	int []array = new int[5];
		int[] array = new int[5];	// 0 ~ 4
		
		// 3개 다 가능.
		System.out.println(array); // [I@5d22bbb7 이렇게 출력되는데 5d22bbb7은 heap 영역의 주소이다.
		System.out.println(array.length); // 배열의 길이
		
		int num1;
		num1 = 333;
		
		System.out.println(num1);
		System.out.println(array[0]);
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		array[3] = 44;
		array[4] = 55;
		
		System.out.println(array[2]);
		
		System.out.println(Arrays.toString(array));
		
		// 선언 & 초기화
		int number = 0; // 선언과 동시에 초기화한 것.
		number = 1;		// 값의 갱신
		
		// 배열도 선언&초기화 가능하다.
		int Array[] = { 111, 222, 333, 444, 555 };
					//	 0	  1	   2	3	 4
		System.out.println(Array[1]);
		
		char chArr[] = { 'h', 'e', 'l', 'l', 'o' };
		
		System.out.println(chArr.length);
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr);	// println 이 원래 문자열로 인식해서 hello 로 출력됨.
		
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c); // 65가 출력된다. 이건 ASCII 코드이다.
		
		String strArr[] = { "나는", "노승현", "입니다."};
		System.out.print(strArr[0]);
		System.out.print(strArr[1]);
		System.out.print(strArr[2]);
		System.out.println(Arrays.toString(strArr));
		/*
		1. 자료형 배열변수명[] = new 자료형[배열의 총개수];
		2. 자료형 배열변수명[] = { };
		
		두개는 적용되는 것은 같지만 상황에 맞게 쓰면된다.
		1번은
		int Arr[];
		Arr = new int[7];
		이렇게 처음에 배열할 개수를 몰라도 일단 선언을 한 후 나중에 적용하고싶을 때 사용하면된다.
		2번은 미리 개수를 알았을때 하면 된다.
		*/

		
		
	}

}
