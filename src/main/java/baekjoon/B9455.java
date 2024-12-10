package baekjoon;

import java.util.Scanner;

public class B9455 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int m=s.nextInt();
            int n=s.nextInt();
            int[][] arr=new int[m][n];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    arr[j][k]=s.nextInt();
                }
            }
            int count=0;
            for (int j = 0; j < n; j++) {
                for (int k = m-1; k >0; k--) {
                    if(arr[k][j]==0 && arr[k-1][j]==1){
                        int l=k-1;
                        while(l<m-1 && arr[l+1][j]==0) {
                            arr[l+1][j] = 1;
                            arr[l][j] = 0;
                            count++;
                            l++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
