package baekjoon;

import java.util.Scanner;

public class B17202 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        String C="";
        for (int i = 0; i < 8; i++) {
            C+=A.charAt(i);
            C+=B.charAt(i);
        }
        for (int i = 0; i < 14; i++) {
            C=gh(C);
        }
        System.out.print(C);
    }
    public static String gh(String a){
        String asc="";
        for (int i = 0; i < a.length()-1; i++) {
            int asm=Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(a.charAt(i+1)));
            asc+=String.valueOf(asm%10);
        }
        return asc;
    }
}
