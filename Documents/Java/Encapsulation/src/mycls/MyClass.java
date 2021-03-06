package mycls;

public class MyClass {
	/*
		Encapsulation == 은닉성, 캡슐화
		멤버에 대해서 외부 접근 제어(차단, 읽기전용, 허용여부)
		
		접근 지정자
		private:	개인적인 = 해당 클래스 내에서만 접근 가능하다. 클래스 내라는 것은 이 파일의 MyClass 내라는 얘기.
		public:		대중적인
		protected:	상속에 따른 보호	
		
	*/
	
	private int number;
	public String name;
	protected double height;
	
	public void setNumber(int number) {	// setter = 밖에서 값을 세팅할 수 있게 허용하는 것.
		this.number = number;
	}
	
	public int getNumber(int number) {	// getter = 밖에서 값에 대한 접근을 허용하게 해주는 것.
		return this.number;
	}
	
	// 멤버변수:	90% private
	// 멤버메소드:	90% public
	
}
