package baekjoon;

import java.util.Scanner;

public class B10250 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int H=s.nextInt();
            int W=s.nextInt();
            int N=s.nextInt();
            int f= N%H==0? H : N%H;
            int r= N%H==0? N/H : N/H+1;
            System.out.println(f*100+r);
        }
    }
}
