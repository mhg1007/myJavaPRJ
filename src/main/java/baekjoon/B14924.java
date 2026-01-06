package baekjoon;

import java.util.Scanner;

public class B14924 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int T=s.nextInt();
        int D=s.nextInt();
        System.out.print(D/(S*2)*T);
    }
}
