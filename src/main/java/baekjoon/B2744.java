package baekjoon;

import java.util.Scanner;

public class B2744 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String org=s.nextLine();
        int len=org.length();
        String chg="";
        for (int i = 0; i < len; i++) {
            int ch=org.charAt(i);
            if(ch>=65&&ch<=90){
                chg+=(char)((int)org.charAt(i)+32);
            }
            else{
                chg+=(char)((int)org.charAt(i)-32);
            }
        }
        System.out.println(chg);
    }
}
