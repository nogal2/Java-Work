package study;

import java.util.Arrays;
import java.util.Scanner;

public class array2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int div[] = {100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};
		int num[] = new int[9];
		int an[] = new int[9];
		int abc = a*b*c;
		
		for(int i=0; i < 9; i++){
			num[i] = abc % div[i];
			
			if(num[i] == abc) {
				num[i] = 0;
			}
			else {
				an[i] = abc / div[i];
				abc = abc - (an[i] * div[i]);
				
			}

		}
//		System.out.println(Arrays.toString(an));
//		System.out.println(Arrays.toString(num));
		int count =0;
		for (int i = 0; i < an.length; i++) {
			
			if (an[i] == 0) {
				count++;
			}
			
		}
		if(an[0] == 0)  {
			count--;
		}
		if(an[1] == 0)  {
			count--;
		}
		System.out.println(count);
		
		int countNum[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		/*
		for (int i = 0; i < an.length; i++) {
			if(an[i] == 1) {
				countNum[0]++;
			}
		}
		System.out.println(count1);
		
		int count2 = 0;
		for (int i = 0; i < an.length; i++) {
			if(an[i] == 2) {
				countNum[1]++;
			}
		}
		System.out.println(count2);
		/**/
		
		for (int i = 0; i < an.length; i++) {
			
			for (int j = 0; j < an.length; j++) {
				if(number[i]== an[j]) {
					countNum[i]++;
				}
			}
			System.out.println(countNum[i]);
		}
	}
}

/* for(int i=0; i < 9; i++){
num[i] = abc % div[i]
if(num[i] == abc) {
	num[i] = -1
	an[i] = -1
}
else {
	abc = abc - (num[i] * div[i])
}
  num[0] = -1	an[0] = -1
  num[1] = -1	an[1] = -1
  num[2] = 9		abc=483239
  num[3] = 4		abc=83239
  num[4] = 8		abc=3239
  num[5] = 3		abc=239
  num[6] = 2		abc=39
  num[7] = 3		abc=9
  num[8] = 9		abc=0

}
*/