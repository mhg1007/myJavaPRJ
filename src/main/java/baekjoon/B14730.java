package baekjoon;

import java.util.Scanner;

public class B14730 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0;
        for (int i = 0; i < N; i++) {
            sum+=s.nextInt()*s.nextInt();
        }
        System.out.print(sum);
    }
}
