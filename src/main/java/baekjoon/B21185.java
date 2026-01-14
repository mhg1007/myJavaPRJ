package baekjoon;

import java.util.Scanner;

public class B21185 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String answer = N%2==0? (N%4==0?"Even":"Odd"):"Either";
        System.out.print(answer);
    }
}
