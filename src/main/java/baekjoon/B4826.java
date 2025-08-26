package baekjoon;

import java.util.Scanner;

public class B4826 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            double d=s.nextDouble();
            double f=s.nextDouble();
            if(d==-1.0 && f==-1.0){
                break;
            }
            double ds=0.0,fs=0.0;
            while(true){
                double d2=s.nextDouble();
                double f2=s.nextDouble();
                if(d2==0.0 && f2==0.0){
                    break;
                }
                if(f>f2){
                    ds+=d2-d;
                    fs+=f-f2;
                }
                d=d2;
                f=f2;
            }
            System.out.println((int)Math.round(ds/fs*f));
        }
    }
}
