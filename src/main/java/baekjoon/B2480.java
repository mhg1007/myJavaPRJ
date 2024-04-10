package baekjoon;

import java.util.Scanner;

public class B2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        if (A==B&&B==C){
            System.out.print(10000+A*1000);
        }
        else if (A==B||B==C){
            System.out.print(1000+B*100);
        }
        else if (C==A){
            System.out.print(1000+A*100);
        }
        else{
            if (A>B && A>C){
                System.out.print(A*100);
            }
            else if(B>A && B>C){
                System.out.print(B*100);
            }
            else{
                System.out.print(C*100);
            }
        }
    }
}
