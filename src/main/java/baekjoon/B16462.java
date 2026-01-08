package baekjoon;

import java.util.Scanner;

public class B16462 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0;
        for (int i = 0; i < N; i++) {
            String q=s.next().replaceAll("[0|6]","9");
            sum+=Math.min(Integer.parseInt(q),100);
        }
        System.out.print((int)Math.round((double)sum/N));
    }
}
