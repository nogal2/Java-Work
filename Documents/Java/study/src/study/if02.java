package study;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		int tpt;
		System.out.print("���� ������ �Է��ϼ��� = ");
		tpt = sc.nextInt();
		if (tpt >= 90 && tpt <= 100) {
			System.out.println("A");
		}
		else if (tpt >= 80 && tpt <= 89) {
			System.out.println("B");
		}
		else if (tpt >= 70 && tpt <= 79) {
			System.out.println("C");
		}
		else if (tpt >= 60 && tpt <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
