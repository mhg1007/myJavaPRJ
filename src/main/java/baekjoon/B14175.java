package baekjoon;

import java.util.Scanner;

public class B14175 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        int K=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < M; i++) {
            char[] arr=s.next().toCharArray();
            for (int j = 0; j < K; j++) {
                for(char c:arr){
                    sb.append(String.valueOf(c).repeat(K));
                }
                sb.append('\n');
            }
        }
        System.out.print(sb);
    }
}
