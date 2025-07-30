package baekjoon;

import java.util.Scanner;

public class B3046 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int R1=s.nextInt();
        int S=s.nextInt();
        int R2=S*2-R1;
        System.out.print(R2);
    }
}
