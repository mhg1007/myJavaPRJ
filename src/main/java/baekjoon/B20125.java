package baekjoon;

import java.util.Scanner;

public class B20125 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        char[][] ckr=new char[N][N];
        for (int i = 0; i < N; i++) {
            String ln=s.next();
            for (int j = 0; j < N; j++) {
                ckr[i][j]=ln.charAt(j);
            }
        }

        int hx=0,hy=0,lh=0,rh=0,ws=0,lf=0,rf=0;
        for (int i = 1; i < N-1; i++) {
            for (int j = 1; j < N-1; j++) {
                if(ckr[i+1][j]=='*' && ckr[i-1][j]=='*' && ckr[i][j-1]=='*' && ckr[i][j+1]=='*'){
                    hx=i;
                    hy=j;
                    System.out.println((i+1)+" "+(j+1));
                }
            }
        }
        for (int j = 0; j < N ; j++) {
            if(ckr[hx][j]=='*'){
                rh=j;
            }
            if(ckr[j][hy]=='*'){
                ws=j;
            }
            if(ckr[j][hy-1]=='*'){
                lf=j;
            }
            if(ckr[j][hy+1]=='*'){
                rf=j;
            }
        }
        for (int i = hy; i >=0 ; i--) {
            if(ckr[hx][i]=='*'){
                lh=i;
            }
        }

        lh=hy-lh;
        rh=rh-hy;
        lf=lf-ws;
        rf=rf-ws;
        ws=ws-hx;

        System.out.print(lh+" "+rh+" "+ws+" "+lf+" "+rf);
    }
}
