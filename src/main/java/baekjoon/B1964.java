package baekjoon;

import java.util.Scanner;

public class B1964 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        long sum=5L;
        for (int i = 2; i <= N; i++) {
            sum+=(long)3*i+1;   //점의 개수 증가 규칙은 5n-(2n-1)=3n+1
            if(sum>=45678){
                sum%=45678;
            }
        }
        System.out.print(sum);
    }
}
