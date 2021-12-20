
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			자료형		byte				우선순위		예(그릇)
		  	boolean		1					낮음			작다
		  	byte		1
		  	short		2
		  	int			4
		  	long		8
		  	float		4
		  	double		8					높음			크다
		  	
		  	char		2
		  	String		"ABC" -> 6 byte
		  												=> float가 long보다 크기가 작은데도 우선순위가 높은 이유는 그렇게 만들었기 때문이다.
		  	
		  	
		  	(자료)형 변환
		  	자동	(자료)형 	변환				: 작은 그릇을 큰그릇으로 옮기는 것(자동)
		  	강제	(자료)형	변환 -> Cast		: 큰 그릇에 있는것을 작은 그릇으로 옮기는것.
				  	
		/**/
		
		// 자동형
		short sh = 12345;	// 2
		int num;			// 4
		num = sh;			// 자동 (자료)형 변환
		
		num = 234567;
		sh = (short)num;	// 강제 (자료)형 변환
		System.out.println(sh);
		
		long l = 123456789L;
		float f;
		
		f=l;
		System.out.println(f);
		
		double d = 1.23e3;
		/*
		 	1.23e3		e3 == 10의 3승 	=> 1.23 * 1000
		 */
		System.out.println(d);
		
		d = 2.34e-2;
		/*
		  	2.34e-2		e-2 == 10의 -2승	=> 2.34 * 0.01
		 */
		System.out.println(d);
		
		int number1, number2;
		float fnum;
		
		number1 = 3;
		number2 = 2;
		
		fnum = (float)number1 / number2;
		System.out.println(fnum); // (float) 가 없을 경우 1.0 이 나온다. 왜냐하면 number는 int로 인식되기 때문이다.
		
		
		
		
		
	}

}
