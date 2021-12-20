package practice;

import java.util.Scanner;

public class practice0203 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
	 	편의점
	 	지불금액:		 3,210원
	 	본인지불금액:	10,000원
	 	
	 	거스름돈: ?
	 	
	 	5000원 	-> ?장
	 	1000원 	-> ?장
	 	500원  	-> ?개
	 	100원	-> ?개
	 	50원		-> ?개
	 	10원		-> ?개
	 	
	 	다 했으면
	 	지불금액, 본인지불금액 입력값으로 바꾸기
	*/
	
	int myMoney = 10000;
	int price = 3210;
	
	System.out.print("지불해야 할 돈= ");
	price = scan.nextInt();
	
	System.out.print("제시한 돈=");
	myMoney = scan.nextInt();
	
	// 거스름돈
	int changeMoney = myMoney - price;
	
	// 5000원
	int m5000 = changeMoney / 5000;
	
	// 1000원
	int m1000 = (changeMoney % 5000) / 1000;	// = 6790 % 5000 -> 1790
	
	// 500원
	int m500 = (changeMoney % 1000) / 500;
	
	// 100원
	int m100 = (changeMoney % 500) / 100;
	
	// 50원
	int m50 = (changeMoney % 100) / 50;
	
	// 10원
	int m10 = (changeMoney % 50) / 10;
	
	System.out.println("총 거스름돈:" + changeMoney);
	System.out.println("5000원:" + m5000);
	System.out.println("1000원:" + m1000);
	System.out.println("500원:" + m500);
	System.out.println("100원:" + m100);
	System.out.println("50원:" + m50);
	System.out.println("10원:" + m10);
	
	}

}
