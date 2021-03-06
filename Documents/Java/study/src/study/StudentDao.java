package study;

import java.util.Arrays;
import java.util.Scanner;

import dto.StudentDto;
//데이터 접근, 관리(학생 기록부)
public class StudentDao {
	Scanner sc = new Scanner(System.in);
	
	
	private StudentDto Student[] = new StudentDto[20];	// 변수 20개
	private int count;
	
	
	
	public StudentDao() {
		count = 0;
		
		// 계속 확인하기 위해 가상으로 정보 입력(이거 없이하면 계속 입력해야해서 오래걸림)
		Student[0] = new StudentDto(1001, "홍길동", 171.1, 90, 85);
		Student[1] = new StudentDto(1002, "성춘향", 165.3, 100, 90);
		Student[2] = new StudentDto(1003, "일지매", 182.6, 80, 95);
		
		count = 3;
	}
	
	// CRUD
	public void insert() {	// 학생 추가
		System.out.print("번호 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("신장 = ");
		double height= sc.nextDouble();
		
		System.out.print("영어 점수 = ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 = ");
		int math = sc.nextInt();
		
		Student[count] = new StudentDto(number, name, height, eng, math);
		count++;
		//반복문을 안써도 되는 이유는 다시 insert() 를 시작했을때 카운트 수가 올라가서 다음 배열로 작성이 되기 때문이다.
	}
	
	public void delete() {	// 학생 삭제
		/*
		System.out.println("삭제할 학생 번호를 입력해주세요 = ");
		int number = sc.nextInt();
		
		Student[number-1] = new StudentDto(0, null, 0, 0, 0);
		/**/
		
		int index = -1;
		System.out.println("삭제할 학생 이름을 입력해주세요 = ");
		String name = sc.next();
		for (int i = 0; i < Student.length; i++) {
			if(Student[i].getName().equals(name)) {
				index=i;
				break;
			} else {
				index = -1;
			}
		}
		
		if(index == -1) {
			System.out.println("찾지 못했습니다.");
		}
		else {
			System.out.println(Student[index].getName() +"의 정보가 삭제되었습니다.");
			Student[index] = new StudentDto(0, null, 0, 0, 0);
		}
		
	}
	
	public void select() {	// 검색
		/*
		//검색
		System.out.println("정보를 확인할 학생 번호를 입력해주세요 = ");
		int number = sc.nextInt();
		
		//출력
		System.out.println(Student[number-1]);
		/**/
		
		// 강사님 코드
		System.out.print("검색할 학생명 = ");
		String name = sc.next();
		
		int index = -1;
		for (int i = 0; i < Student.length; i++) {
			StudentDto dto = Student[i];
			if (dto != null && !dto.getName().equals("")) {
				if(dto.getName().equals(name)) {
					index = i;
					break;
				}
			}
		}
		
		// 출력
		if (index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}else {
		//	StudentDto dto = Student[index];
		//	System.out.println(dto.toString());
			System.out.println(Student[index].toString());
		}
		
	}
	
	public void update() {	// 수정
		/*
		System.out.println("수정할 학생 번호를 입력해주세요 = ");
		int number = sc.nextInt();
		
		System.out.println("해당 학생의 정보중 수정할 항목을 번호로 입력해주세요.");
		System.out.println("1. 번호");
		System.out.println("2. 이름");
		System.out.println("3. 신장");
		System.out.println("4. 영어 점수");
		System.out.println("5. 수학 점수");
		int number2 = sc.nextInt();
		switch(number2) {
			case 1:
				System.out.println("변경할 번호를 입력해주세요");
				int stNum = sc.nextInt();
				Student[number-1].setNumber(stNum);
				break;
			case 2:
				System.out.println("변경할 이름 입력해주세요");
				String stName = sc.next();
				Student[number-1].setName(stName);
				break;
			case 3:
				System.out.println("변경할 신장을 입력해주세요");
				double stHeight = sc.nextDouble();
				Student[number-1].setHeight(stHeight);
				break;
			case 4:
				System.out.println("변경할 영어점수를 입력해주세요");
				int stEng = sc.nextInt();
				Student[number-1].setEng(stEng);
				break;
			case 5:
				System.out.println("변경할 수학점수를 입력해주세요");
				int stMath = sc.nextInt();
				Student[number-1].setMath(stMath);
				break;
		}
		/**/
		System.out.print("검색할 학생명 = ");
		String name = sc.next();
		
		System.out.println("해당 학생의 정보중 수정할 항목을 번호로 입력해주세요.");
		System.out.println("1. 번호");
		System.out.println("2. 이름");
		System.out.println("3. 신장");
		System.out.println("4. 영어 점수");
		System.out.println("5. 수학 점수");
		int number2 = sc.nextInt();
		
		int index = -1;
		switch(number2) {
		case 1: 
			System.out.println("변경할 번호를 입력해주세요");
			int stNum = sc.nextInt();
			for (int i = 0; i < Student.length; i++) {
				
				if(Student[i].getName() != null && !Student[i].getName().equals("")) {	
					if(Student[i].getName().equals(name)) {
						index = i;
						break;
					}
				}
			}
			
			if(index == -1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				Student[index].setNumber(stNum);
			}
			break;
		
		case 2: 
			System.out.println("변경할 이름을 입력해주세요");
			String stName = sc.next();
			for (int i = 0; i < Student.length; i++) {
				
				if(Student[i].getName() != null && !Student[i].getName().equals("")) {	
					if(Student[i].getName().equals(name)) {
						index = i;
						break;
					}
				}
			}
			
			if(index == -1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				Student[index].setName(stName);
			}
			break;
			
		case 3: 
			System.out.println("변경할 신장을 입력해주세요");
			double stHeight = sc.nextDouble();
			for (int i = 0; i < Student.length; i++) {
				
				if(Student[i].getName() != null && !Student[i].getName().equals("")) {	
					if(Student[i].getName().equals(name)) {
						index = i;
						break;
					}
				}
			}
			
			if(index == -1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				Student[index].setHeight(stHeight);
			}
			break;
			
		case 4: 
			System.out.println("변경할 영어 점수를 입력해주세요");
			int stEng = sc.nextInt();
			for (int i = 0; i < Student.length; i++) {
				
				if(Student[i].getName() != null && !Student[i].getName().equals("")) {	
					if(Student[i].getName().equals(name)) {
						index = i;
						break;
					}
				}
			}
			
			if(index == -1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				Student[index].setEng(stEng);
			}
			break;
			
		case 5: 
			System.out.println("변경할 영어 점수를 입력해주세요");
			int stMath = sc.nextInt();
			for (int i = 0; i < Student.length; i++) {
				
				if(Student[i].getName() != null && !Student[i].getName().equals("")) {	
					if(Student[i].getName().equals(name)) {
						index = i;
						break;
					}
				}
			}
			
			if(index == -1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				Student[index].setMath(stMath);
			}
			break;
			
		} 
	}
	
	public void alldata() {	// 확인용
		// 3
		for (int i = 0; i < Student.length; i++) {
			
			if (Student[i] == null) {
				break;
			}
			this.Student[i].toString();
			System.out.println(Student[i]);
			
			
		}
		
	}
	
}
