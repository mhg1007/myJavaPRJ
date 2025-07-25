package baekjoon;

import java.util.Scanner;

public class B2999 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String msg=s.next();
        int N=msg.length();
        int R=0,C=0;
        for (int i = 1; i < N; i++) {
            if(N%i==0 && i<=N/i){
                R=i;
                C=N/i;
            }
        }
        char[][] arr=new char[R][C];
        int pos=0;
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                arr[j][i]=msg.charAt(pos);
                pos++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char[] a:arr){
            for(char c:a){
                sb.append(c);
            }
        }
        System.out.print(sb);
    }
}
