package study;

import java.util.Scanner;

public class if04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int x;
		int y;
		
		System.out.print("x좌표를 입력해주세요. = ");
		x = sc.nextInt();
		System.out.print("y좌표를 입력해주세요. = ");
		y = sc.nextInt();
		
		
		if(x >= -1000 && x <= 1000 && x != 0) {
			if(y >= -1000 && y <= 1000 && y != 0) {
				if(x > 0 && y > 0) {
					System.out.println("1");
				}
				else if (x > 0 && y < 0) {
					System.out.println("4");
				}
				else if (x < 0 && y < 0) {
					System.out.println("3");
				}
				else if (x < 0 && y > 0) {
					System.out.println("2");
				}
			}
		}
		
		
		
	}

}
