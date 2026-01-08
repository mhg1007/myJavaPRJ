package baekjoon;

import java.util.Scanner;

public class B16504 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long m=0;
        for (int i = 0; i < n*n; i++) {
            m+=s.nextInt();
        }
        System.out.print(m);
    }
}
