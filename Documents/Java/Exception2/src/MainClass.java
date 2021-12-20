import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) {
		
		// NullPointerException:			동적할당이 안 된 경우
		String str = null;
		try {
			System.out.println(str.length());		// null값이어서 길이를 알수 없어서 예외
		}catch (NullPointerException e) {
		//	e.printStackTrace();
			System.out.println("str은 할당되지 않았습니다");
		}
	
		// ArrayIndexOutOfboundsException:	배열 범위가 초과한 경우
		int array[] = {1, 2, 3};		
		try {
			array[3] = 'a';			// 배열을 초과함. a는 아스키코드 값이 있기 때문에 예외에 걸리진 않음.
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// FileNotFoundException: 			파일이 없는 경우
		File file = new File("c:\\xxx");	//이런 파일은 존재하지 않아서 에외
		FileInputStream is;
		
		try {
			is = new FileInputStream(file);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// StringIndexOutOfBoundsException:	문자열 길이가 넘어갔을때
		String str1 = "java";
		
		try {
			str1.charAt(4);		// 5번째 문자는 없어서 예외 발생
		}catch (StringIndexOutOfBoundsException e) {
				e.printStackTrace();
		}
		
		// NumBerFormatException:			숫자가 아닌 경우
		
		try {
			int number = Integer.parseInt("12a");		// 12a는 숫자형태가 아니라서 예외
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		// 위에 있는 예외 명령어 다 Exception 으로 잡아도 된다.
	}

}
