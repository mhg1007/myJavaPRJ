package baekjoon;

import java.util.Scanner;

public class B13136 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int R=s.nextInt();
        int C=s.nextInt();
        int N=s.nextInt();
        System.out.print((long)(Math.ceil((double)R/N)*Math.ceil((double)C/N)));
    }
}
