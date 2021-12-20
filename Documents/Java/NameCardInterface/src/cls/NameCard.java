package cls;

import inter.PrintInterface;

public class NameCard {
	String name;
	String phone;
	String email;
	
	// interface다.  클래스가 아님
	PrintInterface printInterface;		// PrintInterface 클래스를 printInterface 객체로 주소를 저장한다.
	
	public NameCard(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintCard(PrintInterface p) {	// setPrintCard함수를 정의하는데 매개변수는 PrintInterface 클래스로 한다. 임의의 p를 통해 호출한다.
		printInterface = p;	// PrintInterface 클래스를 p로 호출해서 printInterface 객체에 대입시킨다.
	}
	
	public void print() {
		printInterface.print(this);		// printInterface를 print로 호출시키는데 호출시키는 곳에 있는 값으로 print한다.(호출하는건 PrintInterface가 된다. 위에서 대입시켰기 때문에) 
	}
	
}
