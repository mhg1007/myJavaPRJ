package baekjoon;

import java.util.Scanner;

public class B11945 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        if(N!=0&&M!=0) {
            for (int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder();
                String fb = s.next();
                sb.append(fb);
                sb.reverse();
                System.out.println(sb);
            }
        }
    }
}
