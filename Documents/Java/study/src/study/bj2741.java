import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2741{
    public static void main(String[] args) throws IOException{
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(br.readLine());
     for(int i=0;i<n;i++){
         System.out.println(i+1);
     }
     System.out.println("for");
     //while문으로 풀기
     int a=1;
     while(a<=n){
         System.out.println(a);
         a++;
         
     }
    }
}