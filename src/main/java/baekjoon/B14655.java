package baekjoon;

import java.util.Scanner;

public class B14655 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0;
        for (int i = 0; i < N*2; i++) {
            sum+=Math.abs(s.nextInt());
        }
        System.out.print(sum);
    }
}
