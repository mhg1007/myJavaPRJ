package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2804 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        int N=A.length();
        int M=B.length();
        int p1=0,p2=0;
        pnt:
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if(A.charAt(i)==B.charAt(j)){
                    p1=i;
                    p2=j;
                    break pnt;
                }
            }
        }
        char[][] arr=new char[M][N];
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < M; i++) {
            if(i!=p2){
                Arrays.fill(arr[i],'.');
                arr[i][p1]=B.charAt(i);
            }
            else{
                arr[i]=A.toCharArray();
            }

            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
