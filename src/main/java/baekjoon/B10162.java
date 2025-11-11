package baekjoon;

import java.util.Scanner;

public class B10162 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A=300;
        int B=60;
        int C=10;

        int T=s.nextInt();
        int a=T/A;
        T=T%A;
        int b=T/B;
        T=T%B;
        int c=T/C;
        T=T%C;
        System.out.print(T==0? a+" "+b+" "+c : "-1");
    }
}
