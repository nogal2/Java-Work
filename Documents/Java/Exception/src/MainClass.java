import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		/*
			Exception:	예외 ! = 에러 : 맞지 않는 값이 나왔을때 에러(틀린게 아님). 문법상 틀린것이 아님.
			int number <- 'A' == 65 
			
			예)
				number -> char
				array -> index out of bounds : 배열의 범위 초과. 배열이 5개인데 5번지를 검색했을 때(5개면 4번지까지 이니까)
				class -> 없음
				file -> 없음
				
			형식(코드인 경우)
				try{
					예외가 발생될 가능성이 있는 코드
				
				}catch(예외클래스1 e) {		<- number
					
					예외 클래스 메시지 출력
				
				}catch(예외클래스2 e) {		<- bound
					
					예외 클래스 메시지 출력
				} 
						:
						:
				finally {
					무조건 실행!
					뒷처리
				}
				=> 외부에서 들어오는 부분이 문제가 됐을때 출력시켜줌.
			
			형식(함수안에서 발생할 경우)
			static void method() throw 예외클래스 {
				함수 안에서 예외가 발생될 경우.
			}
			
			
		*/		
		
		int array[] = {1, 2, 3};	// 배열 3개
		System.out.println("start");
		
		try {
		
			for (int i = 0; i < 4; i++) {	// 배열 4개
				System.out.println(array[i]);
			}
			System.out.println("process");
		}catch (ArrayIndexOutOfBoundsException e) {
		//	System.out.println("배열의 범위 초과");
			e.printStackTrace(); 	// exception 정보가 출력.
		//	return;		리턴 값을 주면 리턴 값 밑으로는 다 처리 안됨. finally 부분은 실행된다.(함수 계의 continue)
		}catch (ArithmeticException e) {
			e.printStackTrace(); 
		}finally {
			System.out.println("finally 부분");
		}
		// exception 이 발생 되는 순간 다음 처리는 안하고 catch로 가서 처리하고 다음으로 처리를 진행한다.
		System.out.println("end");
		
		method();
		try {
			objectCall();	// 함수에서  Exception을 지정했으면 코드에서도 해줘야한다.
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// Exception 이라는 명령어로 모든 Exception을 볼 수 있다. 그래서 굳이 ArrayIndexOutOfBoundsException 이렇게 하지 않아도됨.
	}
	
	// 함수에서 Exception 적용
	static void method() throws IndexOutOfBoundsException{
		int num[] = {1, 2, 3};
		for (int i = 0; i < 4; i++) {
			System.out.println(num[i]);
		}
	}
	
	static void objectCall()throws ClassNotFoundException {
		Class.forName("MyClass");
	}
}
