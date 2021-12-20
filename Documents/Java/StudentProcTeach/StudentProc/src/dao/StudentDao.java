package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dto.StudentDto;

//데이터의 접근, 관리
public class StudentDao {
	Scanner sc = new Scanner(System.in);

//	private StudentDto student[] = new StudentDto[20];	// 변수 20개	[0 ~ 2] -> [3 ~ 19] = null
//	private int count;
	private List<StudentDto> student;
		
	
	public StudentDao() {		
		/*	
		student.add(new StudentDto(1, "노", 180, 50, 60));
		student.add(new StudentDto(2, "승", 140, 60, 29));
		student.add(new StudentDto(3, "현", 168, 85, 76));
		*/
		student = new ArrayList<StudentDto>();
		student.add(new StudentDto(1, "노", 180, 50, 60));
		student.add(new StudentDto(2, "승", 140, 60, 29));
		student.add(new StudentDto(3, "현", 168, 85, 76));
	}
	
	// CRUD
	public void insert() {	// 추가
		System.out.print("번호 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		System.out.print("영어 = ");
		int eng = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();
		
		student.add(new StudentDto(number, name, height, eng, math));
	//	student[count] = new StudentDto(number, name, height, eng, math);
				
	}
	public void delete() {	// 삭제
		System.out.print("삭제할 학생명 = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}
		else {
			
			System.out.println(student.get(index).getName() + "의 데이터를 삭제하였습니다");
			StudentDto removeDto = student.remove(index);
			
		//	student[index].remove();			
		}		
		
	}
	public void select() {	// 검색한 후에 출력
		System.out.print("검색할 학생명 = ");
		String name = sc.next();
		
		// 찾기
		/*
		int index = -1;
		for (int i = 0; i < student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null && !dto.getName().equals("")) {
				if(dto.getName().equals(name)) {
					index = i;
					break;
				}
			}
		}*/
		int index = search(name);
		
		// 출력
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}else {
			StudentDto dto = student.get(index);
			System.out.println(dto.toString());
		}		
	}
	
	public void update() {	// 수정
		System.out.print("수정할 학생명 = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}
		else {
			System.out.print("영어 점수 = ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 = ");
			int math = sc.nextInt();
			
		//	MyClass obj = list.get(0);
		//	obj.setHeight(182.3);
			StudentDto change = student.get(index);
			change.setEng(eng);
			change.setMath(math);
			
			System.out.println("데이터를 수정하였습니다");
		}
	}
	
	public int search(String name) {
		int index = -1;
		for (int i = 0; i < student.size(); i++) {
			StudentDto dto = student.get(i);
			if(dto.getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void alldata() {
		for (int i = 0; i < student.size(); i++) {
			StudentDto dto = student.get(i);
			System.out.println(dto.toString());
			
		}
	}
	
}





