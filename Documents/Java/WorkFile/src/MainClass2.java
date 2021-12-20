import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class MainClass2 {

	public static void main(String[] args) {
		//1번과제
		// String data 3개 저장.
		File file = new File("c:\\myfile\\WorkFile.txt");
		String name[]= {"노승현", "31살", "서울"};
		
		
		// String data 3개 불러오기 -> 배열에 저장.
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (int i = 0; i < name.length; i++) {
				pw.println(name[i]);
			}
			pw.close();
			
					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 데이터 갯수 파악
		int count=0;
		String str;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((str=br.readLine()) != null) {
				count++;
			}
			
		// 실제의 데이터의 저장
		int n = 0;
		String stu[] = new String[count];
		br = new BufferedReader(new FileReader(file));
		while((str=br.readLine()) != null) {
			stu[n] = str;
			n++;
		}
						 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//2번과제
		
		
		// 파일에 저장 -> println 을 한번만 사용해서 저장.
		File file1 = new File("c:\\myfile\\WorkFile2.txt");
		String human[] = { "홍길동", "24", "서울시" };
		String st;
		try {
			
			PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter(file1)));
			
			st = human[0] + "-" + human[1] + "-" + human[2];
			pw1.println(st);
			pw1.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일에서 불러오기 -> , [0] -> 이름 , [1] -> 나이, [2] -> 주소 
		
		String str1;
		String mem = null;
		int k = 0;
		try {
			
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			while((str1=br1.readLine()) != null) {
					mem = str1;
			}
			br1.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(mem);
		String split[] = mem.split("-");
		System.out.println(Arrays.toString(split));
		//3번과제 함수화

	
	}

}
