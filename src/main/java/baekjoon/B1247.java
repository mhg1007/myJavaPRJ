package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B1247 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int N=s.nextInt();
            BigInteger sum=BigInteger.ZERO;
            for (int j = 0; j < N; j++) {
                BigInteger nxt=new BigInteger(s.next());
                sum=sum.add(nxt);
            }
            if(sum.compareTo(BigInteger.ZERO)>0){
                System.out.println("+");
            }
            else if(sum.equals(BigInteger.ZERO)){
                System.out.println(0);
            }
            else{
                System.out.println("-");
            }
        }
    }
}
