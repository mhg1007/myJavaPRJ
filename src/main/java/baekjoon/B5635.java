package baekjoon;

import java.util.Scanner;

public class B5635 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] nm=new String[N];
        int[] ymd=new int[N];

        for (int i = 0; i < N; i++) {
            nm[i]=s.next();
            int d=s.nextInt();
            int m=s.nextInt();
            int y=s.nextInt();
            ymd[i]=y*10000+m*100+d;
        }
        int max=ymd[0];
        int maxp=0;
        int min=ymd[0];
        int minp=0;
        for (int i = 1; i < N; i++) {
            if(ymd[i]>max){
                max=ymd[i];
                maxp=i;
            }
            if(ymd[i]<min){
                min=ymd[i];
                minp=i;
            }
        }
        System.out.print(nm[maxp]+"\n"+nm[minp]);
    }
}
