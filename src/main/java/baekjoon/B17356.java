package baekjoon;

import java.util.Scanner;

public class B17356 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        double M=(double)(B-A)/400;
        double pst=1/(1+Math.pow(10,M));
        System.out.print(pst);
    }
}
