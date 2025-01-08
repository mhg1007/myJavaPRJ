package baekjoon;

import java.util.Scanner;

public class B2167 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[][] arr=new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j]=s.nextInt();
            }
        }

        int K=s.nextInt();
        for (int i = 0; i < K; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int d=s.nextInt();
            int res=0;
            for (int j = a; j <= c; j++) {
                for (int k = b; k <= d; k++) {
                    res+=arr[j-1][k-1];
                }
            }
            System.out.println(res);
        }
    }
}
