package workWeekend;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 인원 입력받는 함수
		String info[][] = null;
		int infoPt[][] = null;
		int stnum = stnum();
		
		// 각 인원의 정보를 입력 받는 함수
		info = input(stnum,info);
		
		// 입력받은 정보중 숫자쪽은 인티저로 변환하는 함수
		infoPt = cvint(stnum, info);
		
		//각 학생들의 국어, 영어, 수학을 합친 총점은? 개개인의 총점 
		sumPrint(stnum, infoPt, info);
		
		//학생들의 국어점수의 총점은?
		sumKo(stnum, infoPt);
		
		//영어 점수의 최고점수는 몇 점인가?
		maxEng(stnum, infoPt);
		
		//수학점수의 최저점수는 몇 점인가?
		minMath(stnum, infoPt);
		
		//학급에서 1등은 누구인가? 이름을 출력하라. sum[i]
		int sum[] = sum(stnum, infoPt);
		first(sum, stnum, info);
	
	}
	
	// 학생인원 입력 받는 메소드
	static int stnum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 인원을 숫자로 입력해주세요. = ");
		int stnum = sc.nextInt();
		return stnum;
	}
	
	// 학생들의 정보를 2차원배열에 입력을 받는다(이름, 생년월일, 국어, 영어, 수학) -- 전체부분 
	static String[][] input(int stnum, String[][] info) {
		Scanner sc = new Scanner(System.in);
		info = new String[stnum][5];
		
		for (int i=0; i < stnum; i++) {	
			
			for(int j=0; j < 5; j++) {			
				reInput(i,j,info);		
			}
		}
		
		return info;
	}
	
	// 학생들의 정보를 2차원배열에 입력을 받는다(이름, 생년월일, 국어, 영어, 수학) -- 입력 및 재입력 부분
	static void reInput(int i, int j, String info[][]) {
		Scanner sc = new Scanner(System.in);
		while(true) {	
			if (j==0) {
				System.out.println("이름을 입력해 주세요 = ");
			} 
			else if (j==1) {
				System.out.println("생년월일을 입력해주세요 = ");
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
			boolean ok = true;
			if (j==0) {
				break;
			}
			else if (j==1) {
				break;
			}
			else if (j==2) {
				for (int k=0; k < info[i][j].length(); k++) {
					int n = (int)info[i][j].charAt(k);
					if (n < 48 || n > 57) { // 숫자가 아닐 경우
						ok = false;
						break;
					}
				}
				if(ok==true) {
					break;
				}
				System.out.println("숫자만 입력해주세요.");
			}
			else if (j==3) {
				for (int k=0; k < info[i][j].length(); k++) {
					int n = (int)info[i][j].charAt(k);
					if (n < 48 || n > 57) { // 숫자가 아닐 경우
						ok = false;
						break;
					}
				}
				if(ok==true) {
					break;
				}
				System.out.println("숫자만 입력해주세요.");
			}
			else if (j==4) {
				for (int k=0; k < info[i][j].length(); k++) {
					int n = (int)info[i][j].charAt(k);
					if (n < 48 || n > 57) { // 숫자가 아닐 경우
						ok = false;
						break;
					}
				}
				if(ok==true) {
					break;
				}
				System.out.println("숫자만 입력해주세요.");
			}
				
		}
	
	}	
	
	// 입력받은 정보 중 숫자부분은 인티저로 바꾸는 메소드(확인해보니 전부 인티저로 바뀌어있음)
	static int[][] cvint(int stnum, String info[][]) {
		
		int infoPt[][] = new int[stnum][5];
		for(int i=0; i < stnum; i++) {
			for(int j=2; j < 5; j++) {
			infoPt[i][j] = Integer.parseInt(info[i][j]);
			}
		}
		return infoPt;
	}
	
	// 각 학생들의 국어, 영어, 수학을 합친 총점 -- 개개인의 총점 출력
	static void sumPrint(int stnum, int infoPt[][], String info[][]) {
		int sum[] = new int[stnum];
		for (int i=0; i < stnum; i++ ) {
			
			for(int j=2; j < 5; j++) {
			sum[i] = sum[i] + infoPt[i][j];
			}
			
		}
		
		for (int i=0; i < stnum; i++) {
			System.out.println(info[i][0]+"의 점수의 합계는" + sum[i] + "점 입니다.");
		}
	}
	
	// 각 학생들의 국어, 영어, 수학을 합친 총점 -- 개개인의 총점 리턴.
	static int[] sum(int stnum, int infoPt[][]) {
		int sum[] = new int[stnum];
		for (int i=0; i < stnum; i++ ) {
			
			for(int j=2; j < 5; j++) {
			sum[i] = sum[i] + infoPt[i][j];
			}
			
		}
		return sum;
	}
	
	// 학생들의 국어점수의 총점 -- 모든 학생의 국어점수 총점 출력
	static void sumKo(int stnum, int infoPt[][]) {
		int sumKo = 0;
		for (int i=0; i<stnum; i++) {
			sumKo += infoPt[i][2];
		}
		System.out.println("학생들의 국어점수의 총점은 " + sumKo + "점 입니다.");
	}
	
	// 영어 점수의 최고점수 -- 모든 학생 중 최고 높은 영어 점수 출력
	static void maxEng(int stnum, int infoPt[][]) {
		int maxEng = 0;
		for (int i=0; i<stnum; i++) {
			for(int j=3; j<4; j++) {
				if (maxEng < infoPt[i][j]) {
					maxEng = infoPt[i][j];
				}
			}
		}
		System.out.println("영어 점수의 최고 점수는 " + maxEng + "점입니다.");
	}
	
	// 수학점수의 최저점수 -- 모든 학생 중 최고 낮은 수학 점수 출력
	static void minMath(int stnum, int infoPt[][]) {
		int minMath = 999;
		for (int i=0; i<stnum; i++) {
			for(int j=4; j<5; j++) {
				if (minMath > infoPt[i][j]) {
					minMath = infoPt[i][j];
				}
			}
		}
		System.out.println("수학 점수의 죄저 점수는 "+ minMath + "점입니다.");
	}
	
	// 학급에서 성적 1등의 이름 출력 
	static void first(int sum[], int stnum, String info[][]) {
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
