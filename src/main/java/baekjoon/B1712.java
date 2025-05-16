package baekjoon;

import java.util.Scanner;

public class B1712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        /*
        손익분기점이 발생하려면 생산수를 n이라 할 때
        A+nB<nC가 되어야하며,
        식을 정리하면 A+n(B-C)<0가 된다.
        A에서 (B-C)를 n번 더할때 0보다 작아지게 하려면
        (B-C)는 음수가 되어야 한다.
        */
        System.out.print((B-C)<0?A/(C-B)+1:-1);
    }
}
