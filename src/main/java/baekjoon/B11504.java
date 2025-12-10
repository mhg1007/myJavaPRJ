package baekjoon;

import java.util.Scanner;

public class B11504 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt(),M=s.nextInt();
            String x="",y="";
            for (int j = 0; j < M; j++) {
                x=x+s.next();
            }
            for (int j = 0; j < M; j++) {
                y=y+s.next();
            }
            int X=Integer.parseInt(x),Y=Integer.parseInt(y);
            int[] a=new int[N+M];
            for (int j = 0; j < N; j++) {
                a[j]=s.nextInt();
            }
            for (int j = N; j < N+M; j++) {
                a[j]=a[j-N];
            }
            int cnt=0;
            for (int j = 0; j < N; j++) {
                String Z="";
                for (int k = j; k < j+M; k++) {
                    Z=Z+a[k];
                }
                int z=Integer.parseInt(Z);
                if(z>=X && z<=Y){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
