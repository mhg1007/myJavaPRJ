package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B1271 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger n=new BigInteger(s.next());
        BigInteger m=new BigInteger(s.next());
        System.out.println(n.divide(m));
        System.out.print(n.remainder(m));
    }
}
