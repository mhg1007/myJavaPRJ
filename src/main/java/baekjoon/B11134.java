package baekjoon;

import java.util.Scanner;

public class B11134 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int C=s.nextInt();
            System.out.println(N%C==0?N/C:N/C+1);
        }
    }
}
