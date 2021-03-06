package main;

import dto.MemberDto;

public class MainClass {

	public static void main(String[] args) {
		// 절차 지향으로 사용하는 법
		String Member[][] = {
				{"홍길동", "24", "123-4567", "서울시", "동창"},
				{"성춘향", "19", "234-5678", "남원시", "여사친"},
				{"정수동", "22", "345-6789", "인천시", "선배"},
		};
		// 객체 지향으로 사용하는 법
		MemberDto member[] =  new MemberDto[3];
		
		for (int i = 0; i < member.length; i++) {
			member[i] = new MemberDto();
		}
		
		//추가
		member[0].setName("홍길동");
		member[0].setAge(24);
		member[0].setPhone("123-4567");
		member[0].setAddress("서울시");
		member[0].setContent("동창");
		
		System.out.println(member[0].getName());
		System.out.println(member[0].getAge());
		System.out.println(member[0].getPhone());
		System.out.println(member[0].getAddress());
		System.out.println(member[0].getContent());
	}

}
