package baekjoon;

import java.util.Scanner;

public class B9501 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int D=s.nextInt();
            int sum=0;
            for (int j = 0; j < N; j++) {
                int v=s.nextInt();
                int f=s.nextInt();
                int c=s.nextInt();
                if((double)f/c*v>=D){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
