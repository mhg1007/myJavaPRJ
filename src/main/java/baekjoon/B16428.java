package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B16428 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger a=new BigInteger(s.next());
        BigInteger b=new BigInteger(s.next());
        BigInteger q=a.compareTo(BigInteger.ZERO)>=0? a.divide(b) : (b.compareTo(BigInteger.ZERO)>=0? a.divide(b).subtract(BigInteger.ONE) : a.divide(b).add(BigInteger.ONE));
        BigInteger r=a.subtract(q.multiply(b));
        System.out.print(q+"\n"+r);
    }
}
