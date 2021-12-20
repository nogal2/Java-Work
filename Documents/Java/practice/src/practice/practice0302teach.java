package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practice0302teach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		사용자가 원하는 학생수로 점수를 입력 받는다.
		총점, 평균 그리고 최고점수를 구한다.
		입력 받은 점수 중에서 90점 이상인 학생의 수는 몇 명인가?
		그리고 그 점수들만을 새로운 배열에 저장하도록 한
		 */
		
		int count = 0;
		int number[] = null;	// (0) 동적할당을 해줘야 하는 요소들의 초기화는 null
		
		// 입력
		// 몇명?
		System.out.print("몇명의 통계를 구하시겠습니까? = ");
		count = sc.nextInt();
		
		number = new int[count];
		// 학생들의 점수 입력
		for(int i=0; i<number.length; i++) {
			System.out.print((i+1) + "번째 점수 = ");
			number[i] = sc.nextInt();
		}
		
		
		// 총점
		int sum = 0;
		for (int i=0; i<number.length; i++) {
			sum = sum + number[i];
		}
		
		// 평균
		double avg = sum / number.length ;
		
		// 최고점수
		int max = number[0];
		for (int i=0; i<number.length; i++) {
			if(number[1] > max) {
				max = number[i];
			} 
		}
		
		// 90점 이상의 학생 수
		int high = 0;
		for(int i=0; i<number.length; i++) {
			if(number[i] >= 90) {
				high++;
			}
		}
		
		
		// 배열에 저장
		int highCount[] = new int[high];
		int n=0;
		for (int i=0; i<number.length; i++) {
			if (number[i] >= 90) {
				highCount[n] = number[i];
				n++;
			}
		}
		
		System.out.println(Arrays.toString(number));
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("최고점수: "+max);
		System.out.println("90점 이상 맞은 학생 수: "+high);
		System.out.println(Arrays.toString(highCount));
		
		/*
		숫자 입력 5개로 음수가 입력되면 다시 입력한다(0보다 큰숫자).
		*/
		
		int inputNum[] = new int[5];
		int w=0;
		while(w < 5) {
			System.out.print((w+1) + "번째 수 = ");
			int num = sc.nextInt();
			if(num > 0) { // 정상 입력
				inputNum[w] = num;
			}else {
				System.out.println("0이상의 수를 입력해 주십시오");
				continue;
			}
			
			w++;
		}
		
		// while을 쓴 이유는 와일은 잘못 입력된 숫자가 있을시 다시 입력하라고 한뒤 그 자리에서 다시 실행가능하다.
	}

}
