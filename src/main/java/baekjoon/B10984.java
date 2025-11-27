package baekjoon;

import java.util.Scanner;

public class B10984 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int sum1=0;
            double sum2=0;
            for (int j = 0; j < N; j++) {
                int C=s.nextInt();
                double G=s.nextDouble();
                sum1+=C;
                sum2+=C*G;
            }
            System.out.print(sum1+" ");
            System.out.println(Math.round(sum2/sum1*10)/10.0);
        }
    }
}
