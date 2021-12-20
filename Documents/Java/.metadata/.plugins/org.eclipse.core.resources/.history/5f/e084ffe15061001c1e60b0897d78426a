import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //while문으로 풀기
        int i=1;
        while(i<=n){
            int a=1;
            while(true){
                if(n-i<a){
                    break;
                }
                System.out.print(" ");
                a++;
            }
            int b=1;
            while(true){
                if(b>i){
                    break;
                }
                System.out.print("*");
                b++;
            }
            System.out.println();
            i++;
        }
        
    }
}
