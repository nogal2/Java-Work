
public class MainClass1 {

	public static void main(String[] args) {
		/*
			continue:	skip(생략)
			
			loop문과 같이 사용한다.
			
			while(조건문){
				
				처리1
				
				처리2
				if(조건){
					continue;
				} 
				처리3		<- if문의 조건이 true면 처리3은 실행안되고 다시 while(조건문)으로 간다. 만약 다시 돌아와서 if조건이 틀리다면 처리3이 실행되고 while(조건문)으로 돌아간다.
			}
		
		  
		*/

		for(int i=0; i<10; i++) {
			System.out.println("i= " + i);
			
			System.out.println("for start");
			
			if(i>3) {
				continue;
			}
			
			System.out.println("for end");
		}
		// 4부터는 for end는 안나온다  continue 문 아래있는건 다음 작업부터 모두 생략.
		
		int w=0;
		while(w<10) {
			System.out.println("w= " + w);
			
			System.out.println("while start");
			
			if(w>3) {
				continue;
			}
			
			System.out.println("while end");
			
			w++;
		}
		// w++가 continue 아래 있기 때문에 continue가 조건에 맞을 경우 그 아래 처리는 무시된다. 그래서 w=4에서 무한루프가 된다.
		
	}

}
