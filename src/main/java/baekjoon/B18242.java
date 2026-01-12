package baekjoon;

import java.util.Scanner;

public class B18242 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        char[][] arr=new char[N][M];
        for (int i = 0; i < N; i++) {
            String str=s.next();
            for (int j = 0; j < M; j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(i>=1 && i<=N-2){
                    if(arr[i-1][j]=='#' && arr[i][j]=='.' && arr[i+1][j]=='#'){
                        for (int k = 0; k < M; k++) {
                            if(arr[i][k]=='#'){
                                if(j>k){
                                    System.out.print("RIGHT");
                                }
                                else if(j<k){
                                    System.out.print("LEFT");
                                }
                            }
                        }
                    }
                }
                if(j>=1 && j<=M-2){
                    if(arr[i][j-1]=='#' && arr[i][j]=='.' && arr[i][j+1]=='#'){
                        for (int k = 0; k < N; k++) {
                            if(arr[k][j]=='#'){
                                if(i>k){
                                    System.out.print("DOWN");
                                }
                                else if(i<k){
                                    System.out.print("UP");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
