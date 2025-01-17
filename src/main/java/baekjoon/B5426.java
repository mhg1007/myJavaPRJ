package baekjoon;

import java.util.Scanner;

public class B5426 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String str=s.next();
            int l=(int)Math.sqrt(str.length());
            char[][] arr=new char[l][l];
            int p=0;
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < l; k++) {
                    arr[j][k]=str.charAt(p);
                    p++;
                }
            }
            for (int j = l-1; j >=0 ; j--) {
                for (int k = 0; k < l; k++) {
                    System.out.print(arr[k][j]);
                }
            }
            System.out.println();
        }
    }
}
