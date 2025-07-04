package baekjoon;

import java.util.Scanner;

public class B2756 {
    public static int scr(double x, double y){
        double dst=Math.sqrt(x*x+y*y);
        int scr=0;
        if(dst<=3){
            scr=100;
        }
        else if(dst<=6){
            scr=80;
        }
        else if(dst<=9){
            scr=60;
        }
        else if(dst<=12){
            scr=40;
        }
        else if(dst<=15){
            scr=20;
        }
        return scr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=0,M=0;
            for (int j = 0; j < 3; j++) {
                double x=s.nextDouble();
                double y=s.nextDouble();
                N+=scr(x,y);
            }
            for (int j = 0; j < 3; j++) {
                double x=s.nextDouble();
                double y=s.nextDouble();
                M+=scr(x,y);
            }
            StringBuilder sb=new StringBuilder("SCORE: ");
            sb.append(N).append(" to ").append(M).append(", ");
            if(N>M){
                sb.append("PLAYER 1 WINS");
            }
            else if(N<M){
                sb.append("PLAYER 2 WINS");
            }
            else{
                sb.append("TIE");
            }
            sb.append(".");
            System.out.println(sb);
        }
    }
}
