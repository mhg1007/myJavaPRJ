package baekjoon;

import java.util.Scanner;

public class B1531 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[][] arr=new int[100][100];
        for (int i = 0; i < N; i++) {
            int x1=s.nextInt();
            int y1=s.nextInt();
            int x2=s.nextInt();
            int y2=s.nextInt();
            for (int j = x1-1; j < x2; j++) {
                for (int k = y1-1; k < y2; k++) {
                    arr[j][k]++;
                }
            }
        }
        int count=0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(arr[i][j]>M){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
