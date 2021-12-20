import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		File file = new File("c:\\myfile\\newfile.txt");
		
		// 파일 읽기
		try {
			// 한 글자씩 읽기
			/*
			FileReader fr = new FileReader(file);
			int ch = fr.read();
			while(ch != -1) {	// ch != -1 => 파일 맨 끝에까지 도달했을때 (설정이 이렇게 되어있음 -1이 나오면 데이타고 없다고 하는것이다.)
				System.out.println((char)ch);
				ch = fr.read();		//출력해주고 갱신해주는 코드.
			}
			fr.close();
			*/
			
			// 문장으로 읽기	buffer 저장공간	한글자씩 읽기보다 이게 더 활용도가 높다.
			
			BufferedReader br = new BufferedReader(new FileReader(file));	//FileReader를 BufferedReader에다 넣음
			
			String str;
			while((str=br.readLine()) != null) {	// readLine 문장을 읽어옴.
				System.out.println(str);
			}
			br.close();		// BufferedReader 로 파일을 열고 close로 닫는다.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// public static void main(String[] args) throws Exception 으로 하면 모두 처리됨.
	}

}
