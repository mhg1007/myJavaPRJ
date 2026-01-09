package baekjoon;

import java.util.Scanner;

public class B17249 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String tb=s.next();
        int lf=tb.indexOf("(");
        int rt=tb.indexOf(")");
        int lfc=0,rtc=0;
        for (int i = 0; i < lf; i++) {
            if(tb.charAt(i)=='@'){
                lfc++;
            }
        }
        for (int i = rt; i < tb.length(); i++) {
            if(tb.charAt(i)=='@'){
                rtc++;
            }
        }
        System.out.print(lfc+" "+rtc);
    }
}
