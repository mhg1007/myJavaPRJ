package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B6736 {
    public static BigInteger fac(BigInteger n) {
        if(n.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        return n.multiply(fac(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            BigInteger a=new BigInteger(s.next());
            int b=s.nextInt();
            String as=String.valueOf(fac(a));
            int cnt=0;
            for (int j = 0; j < as.length(); j++) {
                if(b==Character.getNumericValue(as.charAt(j))){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
