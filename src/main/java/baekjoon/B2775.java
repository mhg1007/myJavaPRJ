package baekjoon;

import java.util.Scanner;

public class B2775 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        int[][] arr=new int[15][15];
        for (int i = 0; i < 15; i++) {
            arr[0][i]=i;
        }
        for (int i = 1; i < 15; i++) {
            int sum=0;
            for (int j = 0; j < 15; j++) {
                sum+=arr[i-1][j];
                arr[i][j]=sum;
            }
        }
        for (int i = 0; i < T; i++) {
            int k=s.nextInt();
            int n=s.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}
