package baekjoon;

import java.util.Scanner;

public class B11006 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int M=s.nextInt();
            int ol=M*2-N;
            System.out.println(ol+" "+(M-ol));
        }
    }
}
