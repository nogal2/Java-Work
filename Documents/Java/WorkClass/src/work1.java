
public class work1 {
	public static void main(String args[]) {
		work1Class s = new work1Class();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal(s.kor, s.eng, s.math));
		System.out.println("이름:" + s.getAverage());
	}
}
