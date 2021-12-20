import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        //한줄 읽어
        StringTokenizer st=new StringTokenizer(str," ");
        //스트링 토큰을 통한 문자열 슬라이싱(여기서는 " "이라는 조건으로 문자열을 나눔)
        int n=Integer.parseInt(st.nextToken());
        //문자열에서 " "나오기 전까지 문자열을 리턴해주고 인트형식으로 바꿔줌
        int x=Integer.parseInt(st.nextToken());
        //문자열에서 " "나오기 전까지 문자열을 리턴해주고 인트형식으로 바꿔줌
        StringBuilder sb= new StringBuilder();
        //문자열 출력이 많을때는 스트링 빌더라는 함수를 만들어서 출력하는것이 시간단축에 좋음
        int[] arr=new int[n];
        //입력받을 배열 선언
        String list=br.readLine();
        //배열 입력받음
        StringTokenizer li=new StringTokenizer(list," ");
        //입력받은 배열이 띄워쓰기로 구분되어 입력되어있으므로 스트링토큰을 사용
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(li.nextToken());
            //입력받은 배열에서 처음" "까지 문자열을 인트형식으로 변환
            if(arr[i]<x){
                sb.append(arr[i]+" ");
                //문제에서 x보다 작은수를 출력해야하므로 작은수를 출력하되 바로하는것이아니라
                //sb라는 스트링에 추가해줌(한번에 출력할 예정) 추가하되 " "공백도 추가해줘야함
                //출력할때마다 systemout을 하면 시간이 초과할 때가 있음
            }
            
        }
        //while문으로 풀기
        int i=0;
        while (i<n) {
            arr[i]=Integer.parseInt(li.nextToken());
            if(arr[i]<x){
                sb.append(arr[i]+" ");
            }
            i++;
        }
        System.out.println(sb);
    }
}
