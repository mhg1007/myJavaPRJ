package baekjoon;

import java.util.Scanner;

public class B12871 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        String T=s.next();
        int sl=S.length();
        int tl=T.length();
        int lcm=0;
        for (int i = Math.max(sl,tl); i <= sl*tl; i++) {
            if(i%sl==0 && i%tl==0){
                lcm=i;
                break;
            }
        }
        while(S.length()<lcm*2){
            S=S+S;
        }
        S=S.substring(0,lcm*2);
        while(T.length()<lcm*2){
            T=T+T;
        }
        T=T.substring(0,lcm*2);
        System.out.println(S.equals(T)?1:0);
    }
}
