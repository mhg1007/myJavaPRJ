package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B19946 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger N=new BigInteger(s.next());
        BigInteger T=new BigInteger("18446744073709551616");
        int seq=0;
        while(N.compareTo(BigInteger.ZERO)>0) {
            if(T.equals(N.add(BigInteger.ONE))) {
                System.out.print(64-seq);
                break;
            }
            else {
                N=N.divide(BigInteger.TWO);
                T=T.divide(BigInteger.TWO);
                seq++;
            }
        }
    }
}
