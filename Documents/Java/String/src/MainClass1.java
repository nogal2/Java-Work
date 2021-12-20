
public class MainClass1 {

	public static void main(String[] args) {
		/*
			String: Wrapper class
					char[]
					문자열을 편집, 정보 취득 등등.
		*/

		String str;
	//	String	: class 명칭
	//	str		: class 변수 == object(객체)
		
		str = "안녕하세요";
		System.out.println(str);
		
		// 정석.
		String str1 = new String("안녕하세요"); //정석
		String str2 = "반갑습니다";				// 간략
		
		// 문자열의 결합
		String str3 = str1 + str2;
		System.out.println(str3);
		
		str3 = str3 + "건강하세요";
		System.out.println(str3);
		
		// equals: 문자열끼리 비교하는 함수
		String str4 = "world";
		String str5 = "worl";
		str5 = str5 + "d";
		
		if(str4 == str5) {
			System.out.println("같은 문자열입니다");
		}
		
		boolean b = str4.equals(str5);
		if(b==true) {
			System.out.println("같은 문자열입니다");
		}else {
			System.out.println("다른 문자열입니다");
		}
		
		if(str4.equals(str5)) {
			System.out.println("같은 문자열입니다");
		}else {
			System.out.println("다른 문자열입니다");
		}
		
		// indexOf : 앞에서부터 조사해서 문자의 위치를 돌려준다.	hello world 문자를 배열과 같이 생각하면 된다.
		// lastIndexOf : 뒤에서부터 조사해서 문자의 위치를 돌려준다.
		String str6 = "hello world";
		int index = str6.indexOf("h");
		System.out.println(index);
		
		int lastIndex = str6.lastIndexOf("l");
		System.out.println(lastIndex);
		
		// length: 문자열의 길이
		int len = str6.length();
		System.out.println(len);
		
		// replace: 수정
		String str7 = "A*B*C*D";
		String repStr = str7.replace("*", "-");
		System.out.println(repStr);
		
		// split: 문자열을 자르는 기능		파일저장 방식 홍길동-24-2001/05/14-서울시	'기호(-,+와 같은것들)' : token
		String str8 = "홍길동-24-2001/05/14-서울시";
		String spStr[] = str8.split("-");	// split는 배열로 사용해야한다. 기호같은 것들을 기준으로 배열.
	/*
		System.out.println(spStr[0]);
		System.out.println(spStr[1]);
		System.out.println(spStr[2]);
		System.out.println(spStr[3]);
		*/
		for (int i=0; i < spStr.length; i++) {
			System.out.println(spStr[i]);
		}
		
		// substring: 문자열을 범위로 자른다
		String str9 = "안녕 반가워요 건강해요";
		String substr = str9.substring(3, 7); // 7번지 전 까지 가져오라는 뜻. (시작위치, 해당위치 전까지) 
		System.out.println(substr);
		
		// toUpperCase: 모두 대문자로 바꿈
		String str10 ="abcDEF";
		String upStr = str10.toUpperCase();
		System.out.println(upStr);
		
		// toLowerCase: 모두 소문자로 바꿈
		String lowStr = str10.toLowerCase();
		System.out.println(lowStr);
		
		
		// trim: 문자열의 앞뒤에 공백을 없애줌 *사용빈도 있음, 검색엔진에서 공백을 없애주고 검색해주는 경우에 사용함. 아이디 입력할때.
		String str11 = "   java java  java                "; // 이럴경우 맨 앞에있는 곳과 맨 뒤에있는 공백을 없애줌
		String trimstr = str11.trim();
		System.out.println(trimstr);
		
		// charAt	사용빈도 있음. hello world
		String str12 = "가나다라마";
		char c = str12.charAt(2);
		System.out.println(c);
		
		// contains: 문자열 안에 있는 것인지 아닌지 판별해줌.
		String str13 = "서울시 마포구 서교동";
		boolean b1 = str13.contains("서울");
		System.out.println(b1);
		
	}

		
}
