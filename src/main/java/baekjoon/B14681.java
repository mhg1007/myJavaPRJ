package baekjoon;

import java.util.Scanner;

public class B14681 {   //사분면 고르기
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();

        if (A>0 && B>0) {
            System.out.print(1);
        }
        else if(A<0 && B>0) {
            System.out.print(2);
        }
        else if(A<0 && B<0) {
            System.out.print(3);
        }
        else{
            System.out.print(4);
        }
    }
}
