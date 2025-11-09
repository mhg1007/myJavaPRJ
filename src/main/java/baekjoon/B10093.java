package baekjoon;

import java.util.Scanner;

public class B10093 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long A=s.nextLong();
        long B=s.nextLong();
        StringBuilder sb=new StringBuilder();
        if(A!=B) {
            for (long i = Math.min(A, B) + 1; i < Math.max(A, B); i++) {
                sb.append(i);
                if (i != Math.max(A, B) - 1) {
                    sb.append(" ");
                }
            }
            System.out.print((Math.abs(A-B)-1)+"\n"+sb);
        }
        else{
            System.out.print(0);
        }
    }
}
