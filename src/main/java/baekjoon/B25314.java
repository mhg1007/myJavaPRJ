package baekjoon;

import java.util.Scanner;

public class B25314 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();

        int res=N/4;
        for (int i=1; i<=res; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
