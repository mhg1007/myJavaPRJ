package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B22193 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        System.out.print(new BigInteger(s.next()).multiply(new BigInteger(s.next())));
    }
}
