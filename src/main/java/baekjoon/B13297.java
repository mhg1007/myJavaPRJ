package baekjoon;

import java.util.Scanner;

public class B13297 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(s.next().length());
        }
    }
}
