package baekjoon;

import java.util.Scanner;

public class B14732 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] arr=new int[500][500];
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            int x1=s.nextInt();
            int y1=s.nextInt();
            int x2=s.nextInt();
            int y2=s.nextInt();
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    arr[j][k]++;
                }
            }
        }
        int count=0;
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                if(arr[i][j]>0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
