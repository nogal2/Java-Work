package study;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.

		���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
		1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.
		*/
		
		int year;
		System.out.println("�⵵�� �Է��ϼ���. = ");
		year = sc.nextInt();
		if (year >= 1 && year <= 4000) {
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}		
	}
}
