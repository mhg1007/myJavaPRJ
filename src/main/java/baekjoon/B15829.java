package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B15829 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger sum=new BigInteger("0");
        int L=s.nextInt();
        long M=1234567891;
        String str=s.next();
        for (int i = 0; i < L; i++) {
            int ch=(int)str.charAt(i)-96;
            BigInteger a=new BigInteger(String.valueOf(ch));
            BigInteger b=new BigInteger("31");
            for (int j = 0; j < i; j++) {
                a=a.multiply(b);
            }
            sum=sum.add(a);
        }
        System.out.print(sum.remainder(BigInteger.valueOf(M)));
    }
}
