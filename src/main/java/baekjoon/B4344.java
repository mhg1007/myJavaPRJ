package baekjoon;

import java.util.Scanner;

public class B4344 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int C=s.nextInt();
        for (int i = 0; i < C; i++) {
            int N=s.nextInt();
            int sum=0;
            int[] arr=new int[N];
            for (int j = 0; j < N; j++) {
                arr[j]=s.nextInt();
                sum+=arr[j];
            }
            float avg=sum/(float)N;
            int count=0;
            for (int j = 0; j < N; j++) {
                if(arr[j]>avg){
                    count++;
                }
            }
            float ovav=count/(float)N*100;
            System.out.printf("%5.3f%%\n",ovav);
        }
    }
}
