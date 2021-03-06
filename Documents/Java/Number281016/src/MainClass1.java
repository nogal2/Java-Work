import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("Menu >>>");
			System.out.println("1. 10진수 -> 2진수로 변경");
			System.out.println("2. 10진수 -> 8진수로 변경");
			System.out.println("3. 10진수 -> 16진수로 변경");
			System.out.println("4. 2진수 -> 10진수로 변경");
			System.out.println("5. 8진수 -> 10진수로 변경");
			System.out.println("6. 16진수 -> 10진수로 변경");		// 0 ~ 9 A ~ F -> AC 9F
			System.out.print("원하시는 처리 번호를 입력해 주세요 >> ");
			int work = sc.nextInt();
			
			System.out.print("변환하고 싶은 숫자를 입력해 주십시오 >> ");
			String numStr = sc.next();
			
			int num10;
			String num2, num8, num16;		
			switch(work) {
				case 1:
				//	num10 = Integer.parseInt(numStr);
				//	num2 = Integer.toBinaryString(num10);
					num2 = decTo2(numStr);
					System.out.println("10진수 " + numStr + "의 2진수는 " + num2 + "입니다");
					break;
				case 2:
					//num10 = Integer.parseInt(numStr);
					//num8 = Integer.toOctalString(num10);
					num8 = decTo8(numStr);
					System.out.println("10진수 " + numStr + "의 8진수는 0" + num8 + "입니다");				
					break;
				case 3:
					//num10 = Integer.parseInt(numStr);
					//num16 = Integer.toHexString(num10);
					num16 = decTo16(numStr);
					System.out.println("10진수 " + numStr + "의 16진수는 0x" + num16 + "입니다");
					break;
				case 4:
				//	num10 = Integer.parseInt(numStr, 2); 
					num10 = twoTo10(numStr);
					System.out.println("2진수 " + numStr + "의 10진수는 " + num10 + "입니다");
					break;
				case 5:
					//num10 = Integer.parseInt(numStr, 8); 
					num10 = octTo10(numStr);
					System.out.println("8진수 0" + numStr + "의 10진수는 " + num10 + "입니다");
					break;
				case 6:
					//num10 = Integer.parseInt(numStr, 16); 
					num10 = hexTo10(numStr);
					System.out.println("16진수 0x" + numStr + "의 10진수는 " + num10 + "입니다");
					break;		
			}		
		}
	}
	
	static String decTo2(String numStr) {
		int num10 = Integer.parseInt(numStr);
		String num2 = Integer.toBinaryString(num10);
		return num2;
	}
	static String decTo8(String numStr) {
		int num10 = Integer.parseInt(numStr);
		String num8 = Integer.toOctalString(num10);
		return num8;
	}
	static String decTo16(String numStr) {
		int num10 = Integer.parseInt(numStr);
		String num16 = Integer.toHexString(num10);
		return num16;
	}
	static int twoTo10(String numStr) {
		int num10 = Integer.parseInt(numStr, 2);
		return num10;
	}
	static int octTo10(String numStr) {
		int num10 = Integer.parseInt(numStr, 8);
		return num10;
	}
	static int hexTo10(String numStr) {
		int num10 = Integer.parseInt(numStr, 16);
		return num10;
	}
}




