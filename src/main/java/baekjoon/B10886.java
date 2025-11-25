package baekjoon;

import java.util.Scanner;

public class B10886 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int c=0, nc=0;
        for (int i = 0; i < N; i++) {
            int vt=s.nextInt();
            c+= vt==1? 1:0;
            nc+= vt==0? 1:0;
        }
        System.out.print("Junhee is ");
        System.out.print(c>nc? "cute!":"not cute!");
    }
}
