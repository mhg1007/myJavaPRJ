package baekjoon;

import java.util.Scanner;

public class B14915 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        String ch=Integer.toString(m,n);
        ch=n>=11?ch.toUpperCase():ch;
        System.out.print(ch);
    }
}
