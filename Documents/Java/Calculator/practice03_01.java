package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practice03_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
			����ڰ� ���ϴ� �л����� ������ �Է� �޴´�.
			����, ��� �׸��� �ְ������� ���Ѵ�.
			�Է� ���� ���� �߿��� 90�� �̻��� �л��� ���� �� ���ΰ�?
			�׸��� �� �����鸸�� ���ο� �迭�� �����ϵ��� ��
		*/
		/*
		// ����ڰ� ���ϴ� �л�, ���� �Է�
		int ustu;
		int stuPt[];
		
		System.out.println("�л� ���� �Է��ϼ���.");
		ustu = sc.nextInt();
		stuPt = new int[ustu];
				
		for(int i=0; i < ustu; i++) {
			System.out.println("�� �л��� ������ �Է��ϼ���.");
			stuPt[i] = sc.nextInt();
		}
		
		// ����, ���, �ְ�����
		
		//����
		int total = 0;
		for(int i=0; i < stuPt.length; i++) {
			total= total + stuPt[i]; 
		}
		
		
		// ���
		int avg = 0;
		avg = total / stuPt.length;
		
		// �ְ� ����
		int max = stuPt[0];
		for(int i=0; i < stuPt.length; i++) {
			if(max < stuPt[i]) {
				max = stuPt[i];
			}
		}
		
		//�Է� ���� ���� �߿��� 90�� �̻��� �л��� ���� �� ���ΰ�?
		int high = 0;
		for(int i=0; i < stuPt.length; i++) {
			if(stuPt[i] >= 90) {
				high++;
			}
		}
		
		
		System.out.println(total);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(high);
			
		/**/
			
			
			/*
				���� �Է� 5���� ������ �ԷµǸ� �ٽ� �Է��Ѵ�(0���� ū����).
				
			*/
			int count[] = new int[5];
			int w=0;			
			while(w < 5) {
				System.out.println((w+1) + "��° ���ڸ� �Է����ּ���= ");
				int num = sc.nextInt();
				if (num > 0) {
					count[w] = num;
				}
				else {
					System.out.println("1�̻��� �ڿ����� �Է����ּ���.");
					continue;
				}
				
				w++;
			} 
				
			
		
	}
	
		
		
}


