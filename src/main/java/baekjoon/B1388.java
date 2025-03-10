package baekjoon;

import java.util.Scanner;

public class B1388 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        char[][] arr=new char[N][M];
        for (int i = 0; i < N; i++) {
            String flr=s.next();
            arr[i]=flr.toCharArray();
        }
        int sum=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j]=='-'){
                    sum++;
                    if(j>0 && arr[i][j-1]=='-'){
                        sum--;
                    }
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[j][i]=='|'){
                    sum++;
                    if(j>0 && arr[j-1][i]=='|'){
                        sum--;
                    }
                }
            }
        }
        System.out.print(sum);
    }
}
