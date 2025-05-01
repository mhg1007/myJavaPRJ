package baekjoon;

import java.util.Scanner;

public class B1408 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] nwt = s.next().split(":");
        String[] stt = s.next().split(":");
        int nh=Integer.parseInt(nwt[0])*3600
                +Integer.parseInt(nwt[1])*60
                +Integer.parseInt(nwt[2]);
        int sh=Integer.parseInt(stt[0])*3600
                +Integer.parseInt(stt[1])*60
                +Integer.parseInt(stt[2]);
        int sec=sh-nh;
        if(sec<0){
            sec+=3600*24;
        }
        int h=sec/3600;
        sec%=3600;
        int m=sec/60;
        sec%=60;
        int ss=sec;
        System.out.printf("%02d:%02d:%02d",h,m,ss);
    }
}
