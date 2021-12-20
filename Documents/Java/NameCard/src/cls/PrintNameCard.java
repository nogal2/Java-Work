package cls;

public class PrintNameCard {
	// 기본 생성자는 빈 깡통으로 있는 상태이다.
	public void print(NameCard nc) {	// 매개변수를 클래스로 쓰면 매개변수를 가져올 수 있다.
		System.out.println("이름:" + nc.name);
	}
}
