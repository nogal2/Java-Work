package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practice03_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
			사용자가 원하는 학생수로 점수를 입력 받는다.
			총점, 평균 그리고 최고점수를 구한다.
			입력 받은 점수 중에서 90점 이상인 학생의 수는 몇 명인가?
			그리고 그 점수들만을 새로운 배열에 저장하도록 한
		*/
		/*
		// 사용자가 원하는 학생, 점수 입력
		int ustu;
		int stuPt[];
		
		System.out.println("학생 수를 입력하세요.");
		ustu = sc.nextInt();
		stuPt = new int[ustu];
				
		for(int i=0; i < ustu; i++) {
			System.out.println("각 학생의 점수를 입력하세요.");
			stuPt[i] = sc.nextInt();
		}
		
		// 총점, 평균, 최고점수
		
		//총점
		int total = 0;
		for(int i=0; i < stuPt.length; i++) {
			total= total + stuPt[i]; 
		}
		
		
		// 평균
		int avg = 0;
		avg = total / stuPt.length;
		
		// 최고 점수
		int max = stuPt[0];
		for(int i=0; i < stuPt.length; i++) {
			if(max < stuPt[i]) {
				max = stuPt[i];
			}
		}
		
		//입력 받은 점수 중에서 90점 이상인 학생의 수는 몇 명인가?
		int high = 0;
		for(int i=0; i < stuPt.length; i++) {
			if(stuPt[i] >= 90) {
				high++;
			}
		}
		
		
		System.out.println(total);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(high);
			
		/**/
			
			
			/*
				숫자 입력 5개로 음수가 입력되면 다시 입력한다(0보다 큰숫자).
				
			*/
			int count[] = new int[5];
			int w=0;			
			while(w < 5) {
				System.out.println((w+1) + "번째 숫자를 입력해주세요= ");
				int num = sc.nextInt();
				if (num > 0) {
					count[w] = num;
				}
				else {
					System.out.println("1이상의 자연수를 입력해주세요.");
					continue;
				}
				
				w++;
			} 
				
			
		
	}
	
		
		
}


