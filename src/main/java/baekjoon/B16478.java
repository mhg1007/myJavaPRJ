package baekjoon;

import java.util.Scanner;

public class B16478 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ab=s.nextInt();
        int bc=s.nextInt();
        int cd=s.nextInt();
        double da=ab*cd/(double)bc;
        System.out.println(da);
    }
}
