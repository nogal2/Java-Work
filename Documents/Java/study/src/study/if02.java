package study;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		//첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		int tpt;
		System.out.print("시험 점수를 입력하세요 = ");
		tpt = sc.nextInt();
		if (tpt >= 90 && tpt <= 100) {
			System.out.println("A");
		}
		else if (tpt >= 80 && tpt <= 89) {
			System.out.println("B");
		}
		else if (tpt >= 70 && tpt <= 79) {
			System.out.println("C");
		}
		else if (tpt >= 60 && tpt <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
