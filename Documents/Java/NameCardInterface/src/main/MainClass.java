package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhoneCard;

public class MainClass {

	public static void main(String[] args) {
		NameCard namecard = new NameCard("홍길동", "123-4567", "hgd@naver.com");	// NameCard를 namecard 객체로 주소를 저장하고 클래스를 사용할수 있도록 한다.
		
		namecard.setPrintCard(new PrintNameCard());			// namecard에 있는 setPrintCard메소드로 PrintNameCard 클래스를 사용한다.
		namecard.print();									// namecard에 있는 print 메소드를 호출한다.
		
		namecard.setPrintCard(new PrintNamePhoneCard());	// namecard에 있는 setPrintCard메소드로 PrintNamePhoneCard를 호출한다.
		namecard.print();									// namecard에 있는 print 메소드를 호출한다.

	}

}
