package baekjoon;

import java.util.Scanner;

public class B9493 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int M=s.nextInt();
            int A=s.nextInt();
            int B=s.nextInt();
            if(M==0 && A==0 && B==0) break;
            double ah=(double)M/A*3600;
            double bh=(double)M/B*3600;
            int hs=(int)Math.round(ah-bh);
            int h=hs/3600;
            hs%=3600;
            int mm=hs/60;
            hs%=60;
            int ss=hs;
            System.out.printf("%d:%02d:%02d\n",h,mm,ss);
        }
    }
}
