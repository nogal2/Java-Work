package main;

import java.util.Scanner;

import dao.AccountDao;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDao dao = new AccountDao();
		
		// 메뉴
		while(true) {
			//CRUD
			System.out.println("1.가계부 내용 입력");
			System.out.println("2.가계부 내용 삭제");
			System.out.println("3.가계부 내용 검색");
			System.out.println("4.가계부 내용 수정");
			// 아래는 CRUD는 아님
			System.out.println("5.가계부 월/항목/내용별 수입/지출 확인");
			System.out.println("6.가계부 정보 모두 출력");
			System.out.println("7.가계부 내용 저장");
			System.out.println("8.종료");
			
			System.out.print("메뉴번호를 입력 >>");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1:
					dao.insert();
					break;
				case 2:
					dao.delete();
					break;
				case 3:
					dao.select();
					break;
				case 4:
					dao.update();
					break;
				case 5:
					dao.monthlyCf();
					break;
				case 6:
					dao.alldata();
					break;
				case 7:
					dao.dataSave();
					break;
				case 8:
					System.exit(0);
					break;
			}
		}
		

	}

}
