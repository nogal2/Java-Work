import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(br.readLine());
        int a=1;
        int n=num;

        for(;;){
            int n10=n/10;// 10의 자리수 구하기
            int n1=n%10;// 1의 자리수 구하기
            int nn=(n10+n1)%10;// 1의자리수 와 10의자리수 더하고 오른쪽 숫자 가져오기
            int newnum=nn+(n1*10);// 새로운숫자만들기
            if(newnum==num){//새로운숫자와 입력받은숫자비교
                break;
            }
            n=newnum;
            a++;
        }
        System.out.println(a);
    }
}
