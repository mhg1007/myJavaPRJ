package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B1837 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger P=new BigInteger(s.next());
        int K=s.nextInt();
        boolean chk=true;
        for (int i = 2; i < K; i++) {
            if(P.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
                chk=false;
                System.out.print("BAD "+i);
                break;
            }
        }
        if(chk){
            System.out.print("GOOD");
        }
    }
}
