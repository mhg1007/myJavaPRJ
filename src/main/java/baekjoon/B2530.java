package baekjoon;

import java.util.Scanner;

public class B2530 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int H=s.nextInt();
        int M=s.nextInt();
        int S=s.nextInt();
        int t=s.nextInt();
        int th,tm,ts;
        th=t/3600;
        tm=(t-(th*3600))/60;
        ts=(t-(th*3600))%60;
        H+=th;
        M+=tm;
        S+=ts;
        if(S>=60){
            S-=60;
            M++;
        }
        if(M>=60){
            M-=60;
            H++;
        }
        if(H>=24){
            H%=24;
        }
        System.out.print(H+" "+M+" "+S);
    }
}
