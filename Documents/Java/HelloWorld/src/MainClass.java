
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("안녕하세요");
		/*ln은 안녕하세요 한 다음에 행을 바꿔주는 명령어 
		 행을 바꾸고 싶지 않을 경우 그냥 print만 넣어주면된다.*/
		System.out.print("하이");
		
		System.out.println(); // 행을 바꿈
		
		System.out.println("만나서 반갑습니다.");
		
		/*print는 프로그램이 제대로 동작하는지를 확인하는게 print 이다.*/
		
		// printf	-> f는 format(형태) , 이것도 출력해보는게 목적.
		System.out.printf("%d %s", 123, "성공을 기원합니다.");
		System.out.println();
		
		// escape sequence
		// \n(행바꿈), \t(탭 메모장의 탭기능과 동일), \", \', \b(백스페이스), \\(역슬러시 나타낼때)
		System.out.print("나는 끝까지 노력할 것이다\n");
		System.out.print("성공할\n 때까지\n");
		
		System.out.println("홍길동\t 24 서울시");
		System.out.println("박훈\t 22 부산시");
		System.out.println("선우태영\t 25 강릉시");
		
		System.out.println("\"나는 문제 없어\"");
		System.out.println("\"나는 \'문\'제 없어\"");
		System.out.println("\"나는 '문'제 없어\"");
		
		System.out.println("나는 '문'제 없어\b");
		
		System.out.println("\\나는 '문'제 없어\\");
		
		/*print 는 출력이 목적이다(중요).*/
	}
	
	
}