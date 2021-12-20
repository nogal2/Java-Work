package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practice0402_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정렬 프로그램
		
		int count;	// 몇개를 정렬할지의 변수
		int number[] = null;
		int updown;
		// user 몇개의 숫자를 정렬?
		// 갯수를 결정
		System.out.print("몇ㅊ개의 숫자를 정렬 = ");
		count = sc.nextInt();
		
		number = new int[count];
		// 숫자들을 입력
		for(int i=0; i<number.length; i++) {
			System.out.print((i+1 + "번째 수 ="));
			number[i] = sc.nextInt();
		}
		
		// 오름/내림		
		System.out.print("오름(1)/내림(2) = ");
		updown = sc.nextInt();
		
		
		// 정렬처리
		int temp;
		for (int i=0; i < number.length -1; i++) {
			for (int j=i+1; j<number.length; j++) {
				
				if(updown == 1) {
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
				else {
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
				}
			}
		}
		
		// 결과출력
		
		
		
		
		
		}
		System.out.println(Arrays.toString(number));
		
	}
}
