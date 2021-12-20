import java.io.File;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		/*
			File:	저장 매체
					Database(file)
		*/
		
		File file = new File("c:\\");	// file에 대한 객체를 잡아준 것.
		
		// 파일 조사(검색)
		/*
		String filelist[] = file.list();
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);	// C드라이브 안에 있는 모든 (숨겨진)파일과 폴더들 출력됨.
		}
		/**/
		
		// 파일인지 폴더인지 조사하는 것.
		/*
		File filelist[] = file.listFiles();			// 배열이 문자형이 아니라 File 형이다. file 안에 있는 파일 리스트를 배열로 놓음.
		for (int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {
				System.out.println("[파일]" + filelist[i].getName());		// 파일이었을때 파일 명
			}
			else if(filelist[i].isDirectory()) {
				System.out.println("[폴더]" + filelist[i].getName());		// 폴더였을때 폴더 명
			}
		}
		/**/
		
		// 파일 생성
		File newFile = new File("c:\\myfile\\newfile.txt");
		
		try {
			if(newFile.createNewFile()) {		// newFile.createNewFile boolean으로 되어 있어서 if 로 하는것.
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패");
			}
		}catch (IOException e) {
			System.out.println("파일을 생성하지 못했습니다.");
		}
		
		// 폴더(디렉토리) 생성
		File newDir = new File("c:\\myfile\\myimage");
		if(newDir.mkdir()) {
			System.out.println("폴더 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
		
		
		// file 존재 여부
		if(newFile.exists()) {	// 이것도 boolean으로 되어있음.
			System.out.println("newfile.txt가 존재합니다.");
		}else {
			System.out.println("newfile.txt가 존재하지 않습니다.");
		}
		
		// 읽기전용
	//	newFile.setReadOnly();
		
		// 쓰기 가능 여부
		if(newFile.canWrite()) {
			System.out.println("쓰기 가능합니다.");
		} else {
			System.out.println("쓰기 불가능합니다.");
		}
		
		// 파일 삭제
	//	newFile.delete();
		
		
	}

}
