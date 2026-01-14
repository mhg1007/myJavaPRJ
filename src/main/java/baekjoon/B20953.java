package baekjoon;

import java.util.Scanner;

public class B20953 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=a+b;
            /*
            dolmen 메서드는 0~a+b-1횟수만큼 +1 더하기를 a+b회 수행
            등차수열의 합 공식 n(a+l)/2(j,k)에 a+b(i)를 곱한 수가 출력됨
            (a+b)(0+a+b-1)/2 * (a+b)
            -> (a+b)(a+b)(a+b-1)/2
             */
            System.out.println((long)c*c*(c-1)/2);
        }
    }
}
