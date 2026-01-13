package baekjoon;

import java.util.Scanner;

public class B20124 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String nxt="";
        int mxs=0;
        for (int i = 0; i < N; i++) {
            String nm=s.next();
            int scr=s.nextInt();
            if(scr>mxs || (scr==mxs && nm.compareTo(nxt)<0)) {
                mxs=scr;
                nxt=nm;
            }
        }
        System.out.print(nxt);
    }
}
