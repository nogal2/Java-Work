import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		
		File file = new File("c:\\myfile\\writeData.txt");	// 쓰기로 하면 자동생성됨
		
		try {
			
			// 쓰기
			/*
			FileWriter fw = new FileWriter(file);
			fw.write("안녕하세요");
			fw.write("hi hello");
			fw.close();
			/**/
			
			// 추가쓰기
			/*
			FileWriter fw = new FileWriter(file, true);		// 위에거랑 매개변수의 차이밖에 없다.
			fw.write("반갑습니다");
			fw.close();
			/**/
			
			// 문장쓰기
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			//위에 3줄은 파일에 기입하기위한 기능들을 설정한 것
			
			pw.println("안녕하세요");
			pw.println("nice to meet you");
			pw.println("건강하세요");
			
			pw.close();
			bw.close();
			fw.close();
			// 위 세줄은 3개의 기능을 켰던 것을 다시 꺼주는 것.
		
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
