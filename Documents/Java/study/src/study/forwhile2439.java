package study;

import java.util.Arrays;
import java.util.Scanner;

public class forwhile2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 10;
		int sum= 0;
		int a[][] = new int[10][10];
		
		
		for(int i=0; i < a.length; i++) {
			
			for (int j = 0; j < a.length-i; j++) {
				a[i][j] = 0;
				System.out.print(a[i][j]);
			}
		
			for (int k = 0 ; k <= i; k++) {
				sum= sum+1; 
				a[i][9-i] = sum;
				
				
				System.out.print(a[i][9-i]);
			}
			
			System.out.print('\n');
			
		}
		/*
		for(int i=1; i <= 5; i++) {
			5--;
			for (int j = 1; j <= 5; j++) {
				System.out.print(' ');
			}
			5++;
			for (int k =  ; k <= 5; k++) {
				System.out.print('*');
			}
			5--;
			System.out.print('\n');
			
		}
		/**/
		
	}

}
