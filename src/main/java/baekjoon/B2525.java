package baekjoon;

import java.util.Scanner;

public class B2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = A*60+B+C;
        int E = D/60;
        int F = D%60;

        if (E>=24) {
            E-=24;
        }

        System.out.print(E+" "+F);
    }
}
