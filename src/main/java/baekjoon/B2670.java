package baekjoon;

import java.util.Scanner;

public class B2670 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        double[] arr=new double[N];
        double max=0;
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            double psb=1;
            for (int j = i; j < N; j++) {
                psb*=arr[j];
                max= Math.max(psb, max);
            }
        }
        System.out.printf("%.3f",max);
    }
}
