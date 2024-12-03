package baekjoon;

import java.util.Scanner;

public class B3035 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int R=s.nextInt();
        int C=s.nextInt();
        int ZR=s.nextInt();
        int ZC=s.nextInt();
        char[][] arr=new char[R][C];
        for (int i = 0; i < R; i++) {
            String str=s.next();
            for (int j = 0; j < C; j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < ZR; j++) {
                for (int k = 0; k < C; k++) {
                    for (int l = 0; l < ZC; l++) {
                        System.out.print(arr[i][k]);
                    }
                }
                System.out.println();
            }
        }
    }
}
