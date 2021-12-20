package practice;

import java.util.Scanner;

public class practice02_05_self {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number[] = {2, 1, 3, 5, 4};
		
		int temp;
		
		for (int i=0; i < number.length - 1; i++) {
			for (int j=0+1; i < number.length; j++) {
				if (number[i] < number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		
		
	}
}
