package study;

import java.util.Scanner;

public class if01 {

	public static void main(String[] args) {
	//¿¹Á¦ 1 
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A > B) {
			System.out.println(">");
		}
		
		if(A < B) {
			System.out.println("<");
		}
		
		if(A == B) {
			System.out.println("==");
		}
	}
}
