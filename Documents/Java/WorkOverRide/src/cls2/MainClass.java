package cls2;

import cls2.Student;

public class MainClass {

	public static void main(String[] args) {
		
		Student se[] = new Student[3];
		
		se[0] = new Student("홍길동", 15, 171, 81, "201101");
		se[1] = new Student("정길동", 13, 183, 72, "201102");
		se[2] = new Student("박길동", 16, 175, 65, "201103");
		
		System.out.printf("%4s %5s %8s %8s %4s\n", "name", "나이", "신장", "몸무게", "학번");
						// 중간에 숫자는 칸 수 이다.
		for (Student sm : se) {
			System.out.println(sm.toString());
		}
	}
	// se의 배열을 sm으로 넘김

}
