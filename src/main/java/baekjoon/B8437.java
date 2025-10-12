package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B8437 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger a=new BigInteger(s.next());
        BigInteger b=new BigInteger(s.next());
        System.out.println(a.add(b).divide(new BigInteger("2")));
        System.out.print(a.subtract(b).divide(new BigInteger("2")));
    }
}
