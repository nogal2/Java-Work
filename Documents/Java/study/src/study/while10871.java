package study;

import java.util.Scanner;

public class while10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,X;
		N = sc.nextInt(); 
		X = sc.nextInt();
		int A[] = new int[N];
		int i = 0;
		while(i<A.length) {
			A[i]= sc.nextInt();
			i++;
		}
		int j = 0;
		while(j<A.length) {
			if (A[j] < X) {
				System.out.print(A[j] + " ");
			}
			j++;
		}
		
	}

}
