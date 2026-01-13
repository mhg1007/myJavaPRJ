package baekjoon;

import java.util.Scanner;

public class B18868 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        int[][] a=new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j]=s.nextInt();
            }
        }
        int cnt=0;
        for (int i = 0; i < M-1; i++) {
            for (int j = i+1; j < M; j++) {
                boolean chk=true;
                for (int k = 0; k < N-1; k++) {
                    for (int l = k+1; l < N; l++) {
                        chk=chk&&((a[i][k]<a[i][l]&&a[j][k]<a[j][l])||(a[i][k]==a[i][l]&&a[j][k]==a[j][l])||(a[i][k]>a[i][l]&&a[j][k]>a[j][l]));
                    }
                }
                if(chk)cnt++;
            }
        }
        System.out.print(cnt);
    }
}
