package baekjoon;

import java.util.Scanner;

public class B1173 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int m = s.nextInt();
        int M = s.nextInt();
        int T = s.nextInt();
        int R = s.nextInt();
        int htb = m;
        int exc = 0;
        int rst = 0;
        while (exc < N) {
            if(m+T>M) break;
            if (htb + T <= M) {
                exc++;
                htb += T;
            } else {
                rst++;
                htb -= R;
                if (htb < m) {
                    htb = m;
                }
            }
        }
        System.out.print(exc == N ? exc + rst : -1);
    }
}
