package baekjoon;

import java.util.Scanner;

public class B14490 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int p=str.indexOf(":");
        int a=Integer.parseInt(str.substring(0,p));
        int b=Integer.parseInt(str.substring(p+1));
        int gcm=0;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a%i==0&&b%i==0){
                gcm=i;
            }
        }
        System.out.print((a/gcm)+":"+(b/gcm));
    }
}
