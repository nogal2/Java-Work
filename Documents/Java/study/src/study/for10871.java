package study;

import java.util.Scanner;

public class for10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,X;
		N = sc.nextInt(); 
		X = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		for (int j = 0; j < A.length; j++) {
			if(A[j] < X) {
				System.out.print(A[j]+ " ");
			}
		}
		
		
		
	}

}
