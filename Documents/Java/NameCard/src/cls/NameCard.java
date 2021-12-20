package cls;

public class NameCard {
	String name;
	String phone;
	String email;
	
	PrintNameCard pNameCard;	// PrintNameCard 클래스를 pNameCard 객체를 사용해서 주소를 저장한다
	
	
	public NameCard(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintNameCard(PrintNameCard p) {
		pNameCard = p;
	}
	
	public void print() {
		pNameCard.print(this);		// this는 PNC의 print의 nc를 가리킨다.
	}
	
	PrintNamePhoneCard pNamePhoneCard;
	
	public void setPrintNamePhoneCard(PrintNamePhoneCard p) {
		pNamePhoneCard = p;
	}
	
	public void printPhone() {
		pNamePhoneCard.print(this);
	}
	
}
