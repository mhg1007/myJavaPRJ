package baekjoon;

import java.util.Scanner;

public class B14914 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a%i==0 && b%i==0) {
                System.out.println(i+" "+(a/i)+" "+(b/i));
            }
        }
    }
}
