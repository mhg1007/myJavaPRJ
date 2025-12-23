package baekjoon;

import java.util.Scanner;

public class B12836 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        long[] arr=new long[N];
        int Q=s.nextInt();
        for (int i = 0; i < Q; i++) {
            int q=s.nextInt();
            int p=s.nextInt();
            int xq=s.nextInt();
            if(q==1){
                arr[p-1]+=xq;
            }
            else if(q==2){
                long sum=0;
                for (int j = p-1; j < xq; j++) {
                    sum+=arr[j];
                }
                System.out.println(sum);
            }
        }
    }
}
