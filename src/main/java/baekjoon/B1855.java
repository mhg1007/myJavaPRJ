package baekjoon;

import java.util.Scanner;

public class B1855 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int K=s.nextInt();
        String pw=s.next();
        int rw=pw.length()/K;
        char[][] arr=new char[rw][K];
        for (int i = 0; i < rw; i++) {
            String cut=pw.substring(0,K);
            if(i%2==0) {
                arr[i] = cut.toCharArray();
            }
            else{
                StringBuilder tmp=new StringBuilder();
                arr[i] = tmp.append(cut).reverse().toString().toCharArray();
            }
            pw=pw.substring(K);
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < rw; j++) {
                sb.append(arr[j][i]);
            }
        }
        System.out.print(sb);
    }
}
