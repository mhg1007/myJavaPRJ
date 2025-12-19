package baekjoon;

import java.util.Scanner;

public class B11944 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(N);
            if(sb.length()>M){
                break;
            }
        }
        if(String.valueOf(N).length()*N > M){
            sb.setLength(M);
        }
        System.out.print(sb);
    }
}
