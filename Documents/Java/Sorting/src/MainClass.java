import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number[] = {3, 5, 1, 4, 2};
					//  1 -> ù��° ��ȣ�� �ٺ�								Debug
					//	   2 -> �ι�° ��ȣ�� �� ��(ù��° ����)
					//		  3 -> ����° ��ȣ�� �� ��(1,2��° ���)
					//			 4-> �� ��° ��ȣ�� �� �� (1,2,3���� ���)
		int temp; // ����ó������ ����
		for(int i=0; i <number.length - 1; i++) {
			
			for (int j=i+1; j < number.length; j++) {
				if(number[i] > number[j]) { // ��ȯó��
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(number));
		
		/*
		  temp = number[0] : temp=3
number[0] = number[2] =>  number[0]������ number[2]�� ������ �ٲ�
number[2] = 3 => 2������ 3�̵�.
		*/
	}
}
		
		