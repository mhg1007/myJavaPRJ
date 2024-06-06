package baekjoon;
import java.util.Scanner;
public class B2745 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String N=s.next();      //입력받는 변환할 숫자
        int B=s.nextInt();      //입력받는 진법 수
        int len=N.length();     //N의 길이
        int rdx=0;              //변환 후 결과를 저장할 변수
        for (int i = len-1; i >= 0; i--) { //입력받은 N의 맨 끝자리부터 시작해서 맨 앞까지
            int num=N.charAt(i);   //각 자리의 수를 아스키코드로 변환
                                        //0~9 : 48~57, A~Z : 65~90
            //B진법으로 변환하려면 맨 밑자리 수부터 B의 n제곱을 하며 더해야 함
            if(num<58) {    //자리수가 0~9일 경우 원래 숫자로 돌려놓기 위해 48을 뺌
                rdx += (num-48) * (int) Math.pow(B, len-1 - i);
            }
            else{   //문제에서 주어지는 알파벳 값이 아스키코드와 비교해서 55만큼 작으므로 그만큼 뺌
                rdx += (num-55) * (int) Math.pow(B, len-1 - i);
            }
        }
        System.out.print(rdx);
    }
}
