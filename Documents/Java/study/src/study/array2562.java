package study;

import java.util.Scanner;

public class array2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[9];
		int max = n[0];
		
		for (int i=0; i < 9; i++) { 
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		} 
		System.out.println(max);
		
		for (int i = 0; i < n.length; i++) {
			if( max == n[i]) {
				System.out.println(i+1);
			}
		}
		
		
	}

}
