package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhoneCard;

public class MainClass {

	public static void main(String[] args) {
		
		
		NameCard namecard = new NameCard("홍길동", "123-4567", "hgd@naver.com");
		
		PrintNameCard pnc = new PrintNameCard();
		namecard.setPrintNameCard(pnc);
		namecard.print();//Namecard 의 print호출이고 그 print는  PNC클래스의 print를 호출한다.
			
		PrintNamePhoneCard pnpc = new PrintNamePhoneCard();
		namecard.setPrintNamePhoneCard(pnpc);
		namecard.printPhone();

	}

}
