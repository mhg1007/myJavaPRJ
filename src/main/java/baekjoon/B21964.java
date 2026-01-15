package baekjoon;

import java.util.Scanner;

public class B21964 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String S=s.next();
        System.out.print(S.substring(N-5));
    }
}
