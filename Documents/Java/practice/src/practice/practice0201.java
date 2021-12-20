package practice;

public class practice0201 {

	public static void main(String[] args) {
		
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
		
		int fee;
		int total;
		int change;
		
		fee = 	 3210;
		total = 10000;
		change = total - fee;
		System.out.println(change);
		
		int fthousand;
		int thousand;
		int fhund;
		int hund;
		int fifteen;
		int ten;
		
		int bill[] = new int[6];
		bill[0] = 5000; // 1개
		bill[1] = 1000; // 1개
		bill[2] =  500; // 1개
		bill[3] =  100; // 2개
		bill[4] =   50; // 1개
		bill[5] =   10; // 4개
	
		fthousand = change/bill[0];
		thousand = (change-(bill[0]*fthousand))/bill[1];
		fhund = (change-(bill[0]*fthousand)-(bill[1]*thousand))/bill[2];
		hund = (change-(bill[0]*fthousand)-(bill[1]*thousand)-(bill[2]*fhund))/bill[3];
		fifteen = (change-(bill[0]*fthousand)-(bill[1]*thousand)-(bill[2]*fhund)-(bill[3]*hund))/bill[4];
		ten = (change-(bill[0]*fthousand)-(bill[1]*thousand)-(bill[2]*fhund)-(bill[3]*hund)-(bill[4]*fifteen))/bill[5];
		System.out.println(fthousand);
		System.out.println(thousand);
		System.out.println(fhund);
		System.out.println(hund);
		System.out.println(fifteen);
		System.out.println(ten);
		
	}

}
