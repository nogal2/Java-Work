import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
			�迭�� ����
			int num1, num2, num3, num4, num5;	������ ���������� �����ؾ��Ѵ�. �̰Ÿ� �ϳ��� �������� �����ϱ� ���ؼ� �迭�� ���Դ�.
			num1 = 11;
			num2 = 22;
			num3 = 33;
			
			Array:	�迭. ���� �ڷ��� �������� ����. <- ������
					����: ���� ����. ������ index number�� �����Ѵ�.
			���� :
					�ڷ��� �迭������[] = new �ڷ���[�迭�� �Ѱ���];
					�迭������[index number]	-> index number�� 0����. index number�� ������� ������ �����ϱ����ؼ�
					int arrName[] = new int[5]; -> ������ ���� 5�� ����
									���� ���� ����(dynamic)�Ҵ��̴�.		����(static)	
					arrName[0] = 11;
					arrName[1] = 22;
					arrName[2] = 33;
					arrName[3] = 44;
					arrName[4] = 55;
					* �ڷ��� �迭������[] = new �ڷ���[�迭�� �Ѱ���]; => �����װ� ������ ���� ����Ǵ� ���� �ٸ���. �������� stack. ���������� heap�� �����.
		*/
		
	//	int array[] = new int[5];
	//	int []array = new int[5];
		int[] array = new int[5];	// 0 ~ 4
		
		// 3�� �� ����.
		System.out.println(array); // [I@5d22bbb7 �̷��� ��µǴµ� 5d22bbb7�� heap ������ �ּ��̴�.
		System.out.println(array.length); // �迭�� ����
		
		int num1;
		num1 = 333;
		
		System.out.println(num1);
		System.out.println(array[0]);
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		array[3] = 44;
		array[4] = 55;
		
		System.out.println(array[2]);
		
		System.out.println(Arrays.toString(array));
		
		// ���� & �ʱ�ȭ
		int number = 0; // ����� ���ÿ� �ʱ�ȭ�� ��.
		number = 1;		// ���� ����
		
		// �迭�� ����&�ʱ�ȭ �����ϴ�.
		int Array[] = { 111, 222, 333, 444, 555 };
					//	 0	  1	   2	3	 4
		System.out.println(Array[1]);
		
		char chArr[] = { 'h', 'e', 'l', 'l', 'o' };
		
		System.out.println(chArr.length);
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr);	// println �� ���� ���ڿ��� �ν��ؼ� hello �� ��µ�.
		
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c); // 65�� ��µȴ�. �̰� ASCII �ڵ��̴�.
		
		String strArr[] = { "����", "�����", "�Դϴ�."};
		System.out.print(strArr[0]);
		System.out.print(strArr[1]);
		System.out.print(strArr[2]);
		System.out.println(Arrays.toString(strArr));
		/*
		1. �ڷ��� �迭������[] = new �ڷ���[�迭�� �Ѱ���];
		2. �ڷ��� �迭������[] = { };
		
		�ΰ��� ����Ǵ� ���� ������ ��Ȳ�� �°� ����ȴ�.
		1����
		int Arr[];
		Arr = new int[7];
		�̷��� ó���� �迭�� ������ ���� �ϴ� ������ �� �� ���߿� �����ϰ���� �� ����ϸ�ȴ�.
		2���� �̸� ������ �˾����� �ϸ� �ȴ�.
		*/

		
		
	}

}
