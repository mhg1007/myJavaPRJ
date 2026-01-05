package baekjoon;

import java.util.Scanner;

public class B14561 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            long A=s.nextLong();
            int n=s.nextInt();
            String an=Long.toString(A,n);
            String anb=new StringBuilder(an).reverse().toString();
            System.out.println(an.equals(anb)?1:0);
        }
    }
}
