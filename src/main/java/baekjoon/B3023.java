package baekjoon;

import java.util.Scanner;

public class B3023 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int R=s.nextInt();
        int C=s.nextInt();
        char[][] arr=new char[R*2][C*2];
        for (int i = 0; i < R; i++) {
            String str=s.next();
            char[] ar=str.toCharArray();
            for (int j = 0; j < C; j++) {
                arr[i][j]=ar[j];
                arr[i][C*2-1-j]=ar[j];
                arr[R*2-1-i][j]=ar[j];
                arr[R*2-1-i][C*2-1-j]=ar[j];
            }
        }
        int A=s.nextInt();
        int B=s.nextInt();
        arr[A-1][B-1]= arr[A-1][B-1]=='#'?'.':'#';
        StringBuilder sb=new StringBuilder();
        for(char[] a:arr){
            for (char b:a) {
                sb.append(b);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
