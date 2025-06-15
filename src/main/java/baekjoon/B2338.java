package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B2338 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger a=new BigInteger(s.next());
        BigInteger b=new BigInteger(s.next());
        System.out.print(a.add(b)+"\n"+a.subtract(b)+"\n"+a.multiply(b));
    }
}
