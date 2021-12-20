package workWeekend;

import java.util.Arrays;
import java.util.Scanner;

public class MainClassBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//학생들의 정보를 2차원배열에 입력을 받는다(이름, 생년월일, 국어, 영어, 수학)
		
		String info[][] = null;
		System.out.println("학생 인원을 숫자로 입력해주세요. = ");
		int stnum = sc.nextInt();
		info = new String[stnum][5];
		for (int i=0; i < stnum; i++) {
			
			for(int j=0; j < 5; j++) {
				
				if (j==0) {
					System.out.print("이름을 입력해 주세요 = ");
				} 
				else if (j==1) {
					System.out.print("생년월일을 입력해주세요 = ");
				} 
				else if (j==2) {
					System.out.println("국어 점수를 입력해주세요 = ");
				} 
				else if (j==3) {
					System.out.println("영어 점수를 입력해주세요 = ");
				} 
				else {
					System.out.println("수학 점수를 입력해주세요 = ");
				} 
				info[i][j] = sc.next(); 

			}
						
		}
		
		int infoPt[][] = new int[stnum][5];
		for(int i=0; i < stnum; i++) {
			for(int j=2; j<5; j++) {
			infoPt[i][j] = Integer.parseInt(info[i][j]);
			}
		}
				
		//각 학생들의 국어, 영어, 수학을 합친 총점은? 개개인의 총점 
		
		int sum[] = new int[stnum];
		for (int i=0; i < stnum; i++ ) {
			
			for(int j=2; j < 5; j++) {
			sum[i] = sum[i] + infoPt[i][j];
			}
		}
		
		for (int i=0; i < stnum; i++) {
			System.out.println(info[i][0]+"의 점수의 합계는" + sum[i] + "점 입니다.");
		}
		
		//학생들의 국어점수의 총점은?
		
		int sumKo = 0;
		for (int i=0; i<stnum; i++) {
			sumKo += infoPt[i][2];
		}
		System.out.println("학생들의 국어점수의 총점은 " + sumKo + "점 입니다.");
		
		//영어 점수의 최고점수는 몇 점인가?
		
		int max = 0;
		for (int i=0; i<stnum; i++) {
			for(int j=3; j<4; j++) {
				if (max < infoPt[i][j]) {
					max = infoPt[i][j];
				}
			}
		}
		System.out.println("영어 점수의 최고 점수는 " + max + "점입니다.");
		
		//수학점수의 최저점수는 몇 점인가?
		
		int min = 999;
		for (int i=0; i<stnum; i++) {
			for(int j=4; j<5; j++) {
				if (min > infoPt[i][j]) {
					min = infoPt[i][j];
				}
			}
		}
		System.out.println("수학 점수의 죄저 점수는 "+ min + "점입니다.");
		
		//학급에서 1등은 누구인가? 이름을 출력하라. sum[i]
		
		int first= 0;
		for(int i=0; i<sum.length; i++) {
			if(first < sum[i]) {
				first = sum[i];
			}
									
		}
		
		for(int i=0; i<stnum; i++) {
			if(first == sum[i]) {
				System.out.println("학급에서 1등인 학생의 이름은 " + info[i][0] + "입니다.");
			} 
		}
		
	}

}
