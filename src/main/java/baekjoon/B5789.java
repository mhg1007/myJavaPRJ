package baekjoon;

import java.util.Scanner;

public class B5789 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            String str=s.next();
            int len=str.length();
            System.out.println(str.charAt(len/2-1)==str.charAt(len/2)?"Do-it":"Do-it-Not");
        }
    }
}
