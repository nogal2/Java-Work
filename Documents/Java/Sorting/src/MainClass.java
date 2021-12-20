import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number[] = {3, 5, 1, 4, 2};
					//  1 -> 첫번째 번호로 다비교								Debug
					//	   2 -> 두번째 번호로 다 비교(첫번째 제외)
					//		  3 -> 세번째 번호로 다 비교(1,2번째 재외)
					//			 4-> 네 번째 번호로 다 비교 (1,2,3번재 재외)
		int temp; // 스왑처리해줄 변수
		for(int i=0; i <number.length - 1; i++) {
			
			for (int j=i+1; j < number.length; j++) {
				if(number[i] > number[j]) { // 교환처리
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(number));
		
		/*
		  temp = number[0] : temp=3
number[0] = number[2] =>  number[0]강ㅄ이 number[2]의 값으로 바뀜
number[2] = 3 => 2번지에 3이들어감.
		*/
	}
}
		
		