package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamCorruptedException;

import dto.AccountDto;
import single.Singleton;

public class FileProc {
	private File file;
	
	public FileProc(String filename) {
		file = new File("c:\\mylife\\" + filename + ".txt");
	}
	
	public void Createfile() {
		try {
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공");
			}
			else {
				System.out.println("파일 생성 실패");
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Load() {
		Singleton s = Singleton.getInstance();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str;
			if((str=br.readLine()) != null) {
				String split[] = str.split("-");
				AccountDto dto = new AccountDto();
				
				dto.setDateTime(split[0]);
				dto.setItem(split[1]);
				dto.setClassify(split[2]);
				dto.setMoney(Integer.parseInt(split[3]));
				dto.setMemo(split[4]);
				
				s.list.add(dto);
				
			}
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void write() {
		Singleton s = Singleton.getInstance();
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				pw.println(dto.toString());
			}
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
