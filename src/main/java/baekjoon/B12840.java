package baekjoon;

import java.util.Scanner;

public class B12840 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int m=s.nextInt();
        int ss=s.nextInt();
        int T=h*3600+m*60+ss;
        int q=s.nextInt();
        for (int i = 0; i < q; i++) {
            int qry=s.nextInt();
            switch (qry){
                case 1:
                    T+=s.nextInt();
                    break;
                case 2:
                    T-=s.nextInt();
                    break;
                case 3:
                    System.out.println(T/3600+" "+(T%3600/60)+" "+(T%3600%60));
            }
            if(T>=86400){
                T%=86400;
            }
            else if(T<0){
                T=86400+(T%86400==0?-86400:T%86400);
            }
        }
    }
}
