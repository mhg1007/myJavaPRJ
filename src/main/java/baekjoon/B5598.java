package baekjoon;

import java.util.Scanner;

public class B5598 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ks=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ks.length(); i++) {
            int c= (int)ks.charAt(i)-3;
            if(c<65) {
                c += 26;
            }
            if(c>90) {
                c -= 26;
            }
            sb.append((char)c);
        }
        System.out.print(sb);
    }
}
