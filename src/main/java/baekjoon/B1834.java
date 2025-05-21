package baekjoon;

import java.util.Scanner;

public class B1834 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        long sum=0;
        for (int i = 1; i < N; i++) {
            sum+=(long)N*i+i;
        }
        System.out.print(sum);
    }
}
