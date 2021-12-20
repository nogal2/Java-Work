
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int sum1=0; // num 변수의 값이 짝수일 때 합계를 저장할 변수 선언
		int sum2=0; // num 변수의 값이 홀수일 때 합게를 저장할 변수 선언
		
		// num 변수의 값이 홀수이면 0부터 num 변수의 값까지 홀수의 합을 출력하고,
		// num 변수의 값이 짝수이면 0부터 num 변수의 값까지 짝수의 합을 출력합니다.
		
		for(int i=0; i<=num; i++) {
			if(i%2==0) {
				sum1 += i;
			} else {
				sum2 +=i;
			}
		}
		if(sum1%2 ==0) { // 또는 if(sum2%2 ==1) { 
			System.out.println("결과값:"+sum1);
		}else {
			System.out.println("결과값:"+sum2);
		}
		
	}

}
