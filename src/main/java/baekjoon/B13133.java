package baekjoon;

import java.util.Scanner;

public class B13133 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[][] arr=new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
        }
        int M=s.nextInt();
        for (int i = 0; i < M; i++) {
            int m=s.nextInt();
            arr[m-1][0]=0;
            arr[m-1][1]=0;
            for (int j = 0; j < N; j++) {
                if(arr[j][0]==m) {
                    arr[j][0]=0;
                }
                if(arr[j][1]==m) {
                    arr[j][1]=0;
                }
            }
        }
        int cnt=0;
        for(int[] a:arr) {
            if(a[0]!=0 && a[1]!=0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
