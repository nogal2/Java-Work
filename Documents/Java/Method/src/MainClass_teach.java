import java.util.Arrays;

public class MainClass_teach {

	public static void main(String[] args) {
		/*
			function : �븿�닔. �룆由쎌쟻
			method : class�뿉 �냼�냽�맂 �븿�닔.
			
			�삎�떇:
									parameter, �씤�닔, �씤�옄
			�룎�븘�삤�뒗 媛믪쓽 �옄猷뚰삎	�븿�닔紐�(�뱾�뼱媛��뒗 媛믪쓽 �옄猷뚰삎 蹂��닔, �뱾�뼱媛��뒗 媛믪쓽 �옄猷뚰삎 蹂��닔, ...){
			
				泥섎━
				
				return 媛�;			
			}
			
			void -> �옄猷뚰삎�씠 �뾾�뒗 寃�
		*/		
		
		int i = functionName('A');		// 'A' == argument
		System.out.println(i);
		
		String st = "abcDEF";
		String upst = toUpperCase(st);
		System.out.println(upst);
		
		functionName1();
		
		functionName2(6.2, 0);
		
		int r = functionName3();
		
		String str = "hello";
		int len = str.length();
		
		System.out.println( len );
		
		char c = str.charAt(1);
		System.out.println( c );
		
		
		int array[] = { 11, 22, 33 };
		int arrAlias[]; // 諛곗뿴 蹂듭궗
		
		arrAlias = array;	// 二쇱냼 蹂듭궗		
		arrAlias[1] = 27;
		
		System.out.println(arrAlias[1]);
		System.out.println(array[1]);
		
		System.out.println(arrAlias);
		System.out.println(array);
		
		int arrayNum[] = { 1, 2, 3, 4, 5 };
		functionName4(arrayNum[0], arrayNum[1], arrayNum[2], arrayNum[3], arrayNum[4]);
		System.out.println(Arrays.toString(arrayNum));
		
		functionName5(arrayNum);
		System.out.println(Arrays.toString(arrayNum));
		
		int arr[] = functionName6(arrayNum);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] functionName6(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
		}		
		return array;
	}
	
	// 二쇱냼瑜� �븷�떦
	static void functionName5(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
		}
	}
	
	// value 媛믪쓣 �븷�떦
	static void functionName4(int a1, int a2, int a3, int a4, int a5) {
		a1 = a1 * 2;
		a2 = a2 * 2;
		a3 = a3 * 2;
		a4 = a4 * 2;
		a5 = a5 * 2;
	}
	
	
	static int functionName3() {
		System.out.println("functionName3() �샇異�");		
		return 3;
	}
	
	static void functionName2(double d, int n) {
		double result;
		
		System.out.println("functionName2(double d, int n) �샇異�");
		
		if(n == 0) {
			System.out.println("怨꾩궛�븷 �닔 �뾾�뒿�땲�떎");
			return;
		}
		
		result = d / n;
		System.out.println("寃곌낵媛�:" + result);		
	}
	
	static void functionName1() {
		System.out.println("functionName1() �샇異�");
		
		return;
	}	
	
	static int functionName(char c) {	// parameter
		System.out.println("functionName(char c) �샇異�");
		
		return 1;
	}
	
	static String toUpperCase(String str) {
		String s = "";
		for(int i = 0;i < str.length();i++) {
			int n = str.charAt(i);
			if(n >= 97) {
				n = n - 32;
			}
			s = s + (char)n;
		}
		return s;
	}
	
	
	

}



