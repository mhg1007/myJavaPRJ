package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B13277 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger A=new BigInteger(s.next());
        BigInteger B=new BigInteger(s.next());
        System.out.print(A.multiply(B));
    }
}
