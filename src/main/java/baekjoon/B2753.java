package baekjoon;

import java.util.Scanner;

public class B2753 {    //윤년
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();

        if ((A % 4 == 0 && A % 100 != 0) || A % 400 == 0) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}
