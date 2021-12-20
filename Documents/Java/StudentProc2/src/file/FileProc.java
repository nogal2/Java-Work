package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dto.StudentDto;
import single.Singleton;

public class FileProc {
	
	private File file;
	
	public FileProc(String filename) {		
		file = new File("c:\\myfile\\" + filename + ".txt");
	}

	public void Createfile() {		
		try {			
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
	
	public void Load() {		
		Singleton s = Singleton.getInstance();		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			
			while((str = br.readLine()) != null) {
			
				String split[] = str.split("-");	// 1001-홍길동-171.1-90-85
				
				StudentDto dto = new StudentDto();
				dto.setNumber( Integer.parseInt(split[0]) );	// 1001
				dto.setName( split[1] );						// 홍길동
				dto.setHeight( Double.parseDouble(split[2]) );	// 171.1
				dto.setEng( Integer.parseInt(split[3]) );		// 90
				dto.setMath( Integer.parseInt(split[4]) );		// 85
				
				s.list.add(dto);
			}			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}
	
	public void Write() {
		Singleton s = Singleton.getInstance();	
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for (int i = 0; i < s.list.size(); i++) {
				StudentDto dto = s.list.get(i);
				pw.println( dto.toString() );
			}
			pw.close();
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}













