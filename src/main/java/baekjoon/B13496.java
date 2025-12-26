package baekjoon;

import java.util.Scanner;

public class B13496 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int K=s.nextInt();
        for (int i = 0; i < K; i++) {
            if(i!=0){
                System.out.println();
            }
            int n=s.nextInt();
            int ss=s.nextInt();
            int d=s.nextInt();
            int sum=0;
            for (int j = 0; j < n; j++) {
                int di=s.nextInt();
                int vi=s.nextInt();
                if((double)di/ss<=d){
                    sum+=vi;
                }
            }
            System.out.println("Data Set "+(i+1)+":");
            System.out.println(sum);
        }
    }
}
