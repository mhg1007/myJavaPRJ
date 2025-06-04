package baekjoon;

import java.util.Scanner;

public class B2033 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        double chg=N;
        int seq=String.valueOf(N).length()-1;
        for (int i=0; i<seq; i++){
            chg=Math.round(chg/10);
        }
        System.out.print((int)(chg*Math.pow(10,seq)));
    }
}
