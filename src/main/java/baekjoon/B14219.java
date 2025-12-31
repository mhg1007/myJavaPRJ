package baekjoon;

import java.util.Scanner;

public class B14219 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print((s.nextInt()*s.nextInt())%3==0?"YES":"NO");
    }
}
