package study;

import java.util.Scanner;

public class array3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt() % 42;
		}
		boolean bl;
		int cnt= 0;
		for (int i = 0; i < a.length; i++) {
			bl = false;
			for (int j = 1+i; j < a.length; j++) {
				if (a[i] == a[j]) {
					bl=true;
					break;
				}
			}
			if(bl==false) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}
