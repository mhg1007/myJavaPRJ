package baekjoon;

import java.util.Scanner;

public class B12780 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String H=s.next();
        String N=s.next();
        int cnt=0,idx=0;
        while(idx<H.length()){
            idx=H.indexOf(N,idx);
            if(idx==-1){
                break;
            }
            cnt++;
            idx+=N.length();
        }
        System.out.print(cnt);
    }
}
