package baekjoon;

import java.util.Scanner;

public class B3062 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            StringBuilder sb=new StringBuilder();
            sb.append(N);
            sb.reverse();
            int nr=Integer.parseInt(sb.toString());
            nr+=N;
            StringBuilder sb2=new StringBuilder();
            sb2.append(nr);
            sb2.reverse();
            int nrr=Integer.parseInt(sb2.toString());
            System.out.println(nr==nrr?"YES":"NO");
        }
    }
}
