import java.util.Arrays;

public class MainClass1 {

	public static void main(String[] args) {
		/*
			Array : 같은 자료형의 묶음 변수들
					접근 및 관리는 index로 된다. 0 ~ Array.length-1
					int Arr[] = new int[5];	// 0 ~ 4
					배열은 동적으로 일단 할당한다. 그리고 할당한 후에는 정적으로 사용한다.
					1차원 배열 0-0-0-0-0 행(row)
					
					int array[] = { 1, 2, 3, 4, 5 };
					
					
					2차원 배열
							0-0-0-0-0
							0-0-0-0-0
							0-0-0-0-0
					
					int array2[][] = new int[3][4];
					int []array2[] = new int[3][4];
					int [][]array2 = new int[3][4];
					0-0-0-0
					0-0-0-0
					0-0-0-0
					
					초기화
					int array2[][] = {
						{ 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 }
					}
		
		*/	
		
		int Array2[][] = new int[3][4];
		
		Array2[0][0] = 1;
		Array2[0][1] = 2;
		Array2[0][2] = 3;
		Array2[0][3] = 4;
		
		Array2[1][0] = 5;
		Array2[1][1] = 6;
		Array2[1][2] = 7;
		Array2[1][3] = 8;
		
		Array2[2][0] = 9;
		Array2[2][1] = 10;
		Array2[2][2] = 11;
		Array2[2][3] = 12;
		
		System.out.println(Arrays.toString(Array2[0]));
		
		//Array [큰 묶음] [큰 묶음 안의 요소]
		
		int Array23[][] = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		System.out.println(Array23[1][1]);
		System.out.println(Array23[2][1]);
		
		System.out.println(Array23.length);		//length 는 큰 묶음 갯수가 나온다.
		System.out.println(Array23[0].length);	//작은 묶음의 갯수가 나온다.
		
		
	}

}

