package practice;

import java.util.Scanner;

public class practice01print3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age;
		boolean gender;
		String phone;
		double height;
		String address;
		
		System.out.print("이름을 입력하시오: ");
		name = scan.next();	
		System.out.print("나이를 입력하시오: ");
		age = scan.nextInt();
		System.out.print("성별을 입력하시오: ");
		gender = scan.nextBoolean();
		System.out.print("전화번호를 입력하시오: ");
		phone = scan.next();
		System.out.print("키를 입력하시오: ");
		height = scan.nextDouble();
		System.out.print("주소를 입력하시오: ");
		address = scan.next();
		
		System.out.println(">>name: " + name);
		System.out.println(">>age: " + age);
		System.out.println(">>gender: " + gender);
		System.out.println(">>phone: " + phone);
		System.out.println(">>height: " + height);
		System.out.println(">>address: " + address);
	}

}
