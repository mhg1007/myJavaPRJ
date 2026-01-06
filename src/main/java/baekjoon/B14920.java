package baekjoon;

import java.util.Scanner;

public class B14920 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int seq=1;
        for(int c=s.nextInt();c!=1;seq++){
            c=c%2==0?c/2:c*3+1;
        }
        System.out.print(seq);
    }
}
