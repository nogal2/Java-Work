package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.AccountDto;
import file.FileProc;
import single.Singleton;

public class AccountDao extends AccountDto {
	Scanner sc = new Scanner(System.in);
	
	//List
//	private List<AccountDto> acB;
	FileProc fp = null;
	public AccountDao() {
//		acB = new ArrayList<AccountDto>();
//		
//		acB.add(new AccountDto("2021/06/05", "경조사", "수입",50000, "결혼"));
//		acB.add(new AccountDto("2021/06/21", "교통", "지출",40000, "기차"));
//		acB.add(new AccountDto("2021/02/04", "문화생활", "수입",70000, "아이템"));
//		acB.add(new AccountDto("2021/06/25", "경조사", "수입",20000, "결혼"));
//		acB.add(new AccountDto("2021/06/30", "교통", "지출",30000, "기차"));
//		acB.add(new AccountDto("2021/02/06", "문화생활", "수입",80000, "카페"));
//		acB.add(new AccountDto("2021/07/05", "문화생활", "수입",80000, "커피"));
//		acB.add(new AccountDto("2021/02/09", "교통", "수입",80000, "아이템"));
//		acB.add(new AccountDto("2021/03/06", "식비", "지출",12000, "아이템"));
//		acB.add(new AccountDto("2021/06/06", "식비", "지출",30000, "아이템"));
		fp = new FileProc("AccountBook");
		fp.Createfile();
		fp.Load();
		
	}
	
	//CRUD
	// 추가 입력 받는 부분
	public void insert() {
		
		
		System.out.println("날짜 입력 예)2021/04/21 = ");
		String dateTime = sc.next();
		
		String item = item();

		String classify = classify();

		System.out.println("금액 입력 = ");
		int money = sc.nextInt();
		
		System.out.println("내용 입력 = ");
		String memo = sc.next();
		
		Singleton s = Singleton.getInstance();
		s.list.add(new AccountDto(dateTime, item, classify, money, memo));
		
	}
	
	
	// 삭제
	public void delete() {
		System.out.println("삭제할 내용을 입력해주세요 = ");
		String memo = sc.next();
		
		int index = search(memo);
				
		if(index == -1) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			Singleton s = Singleton.getInstance();
			System.out.println(s.list.get(index).getMemo() +"의 정보가 삭제되었습니다.");
			s.list.remove(index);
		}
		
	}
	// 검색
	public void select() {
		System.out.print("검색할 내용 = ");
		String memo = sc.next();
		
		int index = search(memo);
		
		
		// 출력
		if (index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}else {
			Singleton s = Singleton.getInstance();
			System.out.println(s.list.get(index).toString());
		}
	}
	
	// 수정
	public void update() {
		int index = -1;
		boolean b = true;
		
		String memo = "";
		while(b==true) {
			Singleton s = Singleton.getInstance();
			System.out.print("검색할 내용 = ");
			memo = sc.next();
			
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				if(dto.getMemo().equals(memo)) {
					index = i;
					break;
				} 
			}
			if(index == -1) {	
			System.out.println("잘못 입력하셨습니다.");
			} else {
				b= false;
			}
			
		}
		Singleton s = Singleton.getInstance();	
		System.out.println("해당 학생의 정보중 수정할 항목을 번호로 입력해주세요.");
		System.out.println("1. 날짜");
		System.out.println("2. 항목");
		System.out.println("3. 수입/지출");
		System.out.println("4. 금액");
		System.out.println("5. 내용");
		int num = sc.nextInt();
		index = -1;
		switch(num) {
			case 1: 
				System.out.println("변경할 날짜를 입력해주세요");
				String date = sc.next();
				index = search(memo);
				
				if(index == -1) {
					System.out.println("잘못 입력하셨습니다.");
				} else {
					s.list.get(index).setDateTime(date);
				}
			break;
			
			case 2: 
				String item = item();
				index = search(memo);
				
				if(index == -1) {
					System.out.println("잘못 입력하셨습니다.");
				} else {
					s.list.get(index).setItem(item);
				}
				break;
				
			case 3: 
				String classify = classify();
				index = search(memo);
				
				if(index == -1) {
					System.out.println("잘못 입력하셨습니다.");
				} else {
					s.list.get(index).setClassify(classify);
				}
				break;
				
			case 4: 
				System.out.println("변경할 금액을 입력해주세요");
				int money = sc.nextInt();
				index = search(memo);
				
				if(index == -1) {
					System.out.println("잘못 입력하셨습니다.");
				} else {
					s.list.get(index).setMoney(money);
				}
				break;
				
			case 5: 
				System.out.println("변경할 내용을 입력해주세요");
				String memo1 = sc.next();
				index = search(memo);
				
				if(index == -1) {
					System.out.println("잘못 입력하셨습니다.");
				} else {
					s.list.get(index).setMemo(memo1);
				}
				break;
			
			
		}
			
	}
	
	//가계부 월별 수입/지출 확인
	public void monthlyCf() {
		String month = "";
		System.out.println("해당 날짜에 필요한 정보들을 선택해주세요.");
		System.out.println("1. 월별 모든 정보");
		System.out.println("2. 월별 수입");
		System.out.println("3. 월별 지출");
		System.out.println("4. 항목별 모든 정보");
		System.out.println("5. 항목별 수입");
		System.out.println("6. 항목별 지출");
		System.out.println("7. 내용별 모든 정보");
		System.out.println("8. 내용별 수입");
		System.out.println("9. 내용별 지출");
		int num = sc.nextInt();
		
		int index = -1;
		switch(num) {
			case 1:
				monthlyAll();
				break;
			case 2:
				monthlyIncome();
				break;
			case 3:
				monthlyExpense();
				break;
			case 4:
				itemAll();
				break;
			case 5:
				itemIncome();
				break;
			case 6:
				itemExpense();
				break;
			case 7:
				memoAll();
				break;
			case 8:
				memoIncome();
				break;
			case 9:
				memoExpense();
				break;
		
		}
		
		
		
	}
	
	// all data print
	public void alldata() {
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			s.list.get(i).toString();
			System.out.println(s.list.get(i));
		}
	} 
	
	// 저장
	public void dataSave() {
		fp.write();
	}
	
	// 항목 선택
	public String item () {
		String item= "";
		System.out.println("기입할 항목을 번호로 선택해주세요.");
		System.out.println("1.식비");
		System.out.println("2.문화생활");
		System.out.println("3.교통");
		System.out.println("4.경조사");
		System.out.println("5.생활비");
		System.out.println("6.직접입력");
		System.out.print("항목을 번호로 입력 >>");
		int num = sc.nextInt();
		switch(num) {
			case 1:
				item = "식비";
				break;
			case 2:
				item = "문화생활";
				break;
			case 3:
				item = "교통";
				break;
			case 4:
				item = "경조사";
				break;
			case 5:
				item = "생활비";
				break;
			case 6:
				System.out.println("항목을 직접 입력해주세요 = ");
				item = sc.next();
				break;
		} 
		return item;
		
	}
	
	// 수입 지출 선택
	public String classify() {
		String classify = "";
		System.out.println("수입/지출을 선택해주세요.");
		System.out.println("1. 수입");
		System.out.println("2. 지출");
		int num = sc.nextInt();
		
		switch(num) {
			case 1:
				classify = "수입";
				break;
			case 2:
				classify = "지출";
				break;
		}
		
		return classify;
		
	}
	
	// 검색
	public int search(String memo) {
		Singleton s = Singleton.getInstance();
		int index = -1;
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			if(dto.getMemo().equals(memo)) {
				index = i;
				break;
			}
			
		}
		return index;
	}
	
	public String searchMon(String month) {
		
		return month;
	}
	
	// -------------------------------------------
	// select 
	// 입력한 달의 데이터 모두 출력(완)-> 수입과 지출도 출력이 되도록. 그 달의 총 수입과 총 지출(완)
	// 내용 검색어로 산출된 데이터 출력.
	
	//월별 모든 정보	
	public void monthlyAll() {
		String month = inputRepeat(); 
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			String date = dto.getDateTime().substring(0, 7);
			if(date.equals(month)) {
				System.out.println(s.list.get(i));
			}
		}
	}
	
	//날짜 입력(틀리면 반복)
	public String inputRepeat() {
		int index = -1;
		boolean b = true;
		String month = "";
		while(b==true) {
			Singleton s = Singleton.getInstance();
			System.out.println("찾고 싶은 해당 년도과 월을 입력해주세요. 예)2021/04");
			month = sc.next();
			
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				String date = dto.getDateTime().substring(0, 7);
				if(date.equals(month)) {
					index=i;
					break;
				}
				
			}
			
			if(index == -1) {	
			System.out.println("해당 정보가 없습니다.");
			} else {
				b= false;
			}
			
		}
		return month;
	}
	
	// 월별 수입
	public void monthlyIncome() {
		String month = inputRepeat();
		Singleton s = Singleton.getInstance();
		String date= "";
		for (int i = 0; i < s.list.size(); i++) {
			
			AccountDto dto = s.list.get(i);
			date = dto.getDateTime().substring(0, 7);
			if(date.equals(month)) {
				if(dto.getClassify() == "수입") {
					System.out.println(s.list.get(i));
				}
			}
		}
		int sum = 0;
		System.out.println("총 수입을 보시겠습니까?");
		System.out.println("1. 본다");
		System.out.println("2. 안 본다");
		int num = sc.nextInt();
		if (num == 1) {
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				date = dto.getDateTime().substring(0, 7);
				if(date.equals(month)) {
					if(dto.getClassify() == "수입") {
						sum = sum +dto.getMoney();
					}
				}
			}
			System.out.println(date + "의 총 수입은 " + sum + "원 입니다.");
		} 
		
		
	}
	
	// 월별 지출
	public void monthlyExpense() {
		String month = inputRepeat();
		String date = "";
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			date = dto.getDateTime().substring(0, 7);
			if(date.equals(month)) {
				if(dto.getClassify() == "지출") {
					System.out.println(s.list.get(i));
				}
			}
		}
		
		int sum = 0;
		System.out.println("총 지출을 보시겠습니까?");
		System.out.println("1. 본다");
		System.out.println("2. 안 본다");
		int num = sc.nextInt();
		if (num == 1) {
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				date = dto.getDateTime().substring(0, 7);
				if(date.equals(month)) {
					if(dto.getClassify() == "지출") {
						sum = sum +dto.getMoney();
					}
				}
			}
			System.out.println(date + "의 총 지출은 " + sum + "원 입니다.");
		} 
	}
	
	// 항목 입력(잘못입력시 반복)
	public String inputItemRe() {
		int index = -1;
		boolean b = true;
		String item = "";
		while(b==true) {
			item = item();
			Singleton s = Singleton.getInstance();
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				if(dto.getItem().equals(item)) {
					index=i;
					break;
				}
			}
			if(index == -1) {	
			System.out.println("해당 정보가 없습니다.");
			} else {
				b= false;
			}
			
		}
		return item;
	}
	
	//항목별 모든 정보 보기
	public void itemAll() {
		String item = inputItemRe();
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			if(dto.getItem().equals(item)) {
				System.out.println(s.list.get(i));
			}
		}
	}
	
	// 항목별 수입과 총수입
	public void itemIncome() {
		String item = inputItemRe();
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			if(dto.getItem().equals(item)) {
				if(dto.getClassify() == "수입") {
					System.out.println(s.list.get(i));
				}
			}
			
		}
		
		int sum = 0;
		System.out.println("총 수입을 보시겠습니까?");
		System.out.println("1. 본다");
		System.out.println("2. 안 본다");
		int num = sc.nextInt();
		if (num == 1) {
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				if(dto.getItem().equals(item)) {
					if(dto.getClassify() == "수입") {
						sum = sum + dto.getMoney();
					}
				}
			}
			System.out.println(item + "의 총 수입은 " + sum + "원 입니다.");
		} 
	}
	
	//항목별 지출과 총 지출
	public void itemExpense() {
		String item = inputItemRe();
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			if(dto.getItem().equals(item)) {
				if(dto.getClassify() == "지출") {
					System.out.println(s.list.get(i));
				}
			}
			
		}
		
		int sum = 0;
		System.out.println("총 수입을 보시겠습니까?");
		System.out.println("1. 본다");
		System.out.println("2. 안 본다");
		int num = sc.nextInt();
		if (num == 1) {
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				if(dto.getItem().equals(item)) {
					if(dto.getClassify() == "지출") {
						sum = sum + dto.getMoney();
					}
				}
			}
			System.out.println(item + "의 총 지출은 " + sum + "원 입니다.");
		} 
	}
	
	public String inputMemo() {
		int index = -1;
		boolean b = true;
		String memo = "";
		while(b==true) {
			Singleton s = Singleton.getInstance();
			System.out.println("찾고 싶은 내용을 입력해주세요 = ");
			memo = sc.next();
			
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				if(dto.getMemo().equals(memo)) {
					index=i;
					break;
				}
			}
			
			if(index == -1) {	
			System.out.println("해당 정보가 없습니다.");
			} else {
				b= false;
			}
		}
		return memo;
	} 
	
	//내용 모든 정보
	public void memoAll() {
		String memo = inputMemo();
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			if(dto.getMemo().equals(memo)) {
				System.out.println(s.list.get(i));
			}
		}
	}
	
	// 내용 수입과 총수입
	public void memoIncome() {
		String memo = inputMemo();
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			if(dto.getMemo().equals(memo)) {
				if(dto.getClassify() == "수입") {
					System.out.println(s.list.get(i));
				}
			}
		}
		
		int sum = 0;
		System.out.println("총 수입을 보시겠습니까?");
		System.out.println("1. 본다");
		System.out.println("2. 안 본다");
		int num = sc.nextInt();
		if (num == 1) {
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				if(dto.getMemo().equals(memo)) {
					if(dto.getClassify() == "수입") {
						sum = sum + dto.getMoney();
					}
				}
			}
			System.out.println(memo + "의 총 수입은 " + sum + "원 입니다.");
		} 
	}
	
	//내용 지출과 총 지출
	public void memoExpense() {
		String memo = inputMemo();
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < s.list.size(); i++) {
			AccountDto dto = s.list.get(i);
			if(dto.getMemo().equals(memo)) {
				if(dto.getClassify() == "지출") {
					System.out.println(s.list.get(i));
				}
			}
			
		}
		
		int sum = 0;
		System.out.println("총 수입을 보시겠습니까?");
		System.out.println("1. 본다");
		System.out.println("2. 안 본다");
		int num = sc.nextInt();
		if (num == 1) {
			for (int i = 0; i < s.list.size(); i++) {
				AccountDto dto = s.list.get(i);
				if(dto.getMemo().equals(memo)) {
					if(dto.getClassify() == "지출") {
						sum = sum + dto.getMoney();
					}
				}
			}
			System.out.println(memo + "의 총 지출은 " + sum + "원 입니다.");
		} 
	}
	
	
	
	// -----------------------
	
	//파일 저장.
	
	
	//파일 불러오기 및 리스트 반환

	
	
	// 파일저장/불러오기 불러오기는 파일에 불러다가 리스트로 넘어오는것. 
	// 저장하기는 우리가 해야하지만 불러오기는 자동으로. 파일에 저장된 것을 리스트에 넣기. 메모장에 텍스트 파일로.
	// 불러오기는 함수 따로 만들어 놓는게 좋다.
}
