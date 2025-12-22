package baekjoon;

import java.util.Scanner;

public class B12185 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int[] A=new int[N];
            int[] B=new int[N];
            for (int j = 0; j < N; j++) {
                A[j]=s.nextInt();
                B[j]=s.nextInt();
            }
            int P=s.nextInt();
            StringBuilder sb=new StringBuilder();
            sb.append("Case #").append(i+1).append(":");
            for (int j = 0; j < P; j++) {
                int C=s.nextInt();
                int cnt=0;
                for (int k = 0; k < N; k++) {
                    if(C>=A[k] && C<=B[k]){
                        cnt++;
                    }
                }
                sb.append(" ").append(cnt);
            }
            System.out.println(sb);
        }
    }
}
