package baekjoon;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B4150 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        List<BigInteger> list=new ArrayList<>();
        list.add(BigInteger.ONE);
        list.add(BigInteger.ONE);
        for (int i = 2; i < n; i++) {
            BigInteger n1=list.get(i-2);
            BigInteger n2=list.get(i-1);
            list.add(n1.add(n2));
        }
        System.out.print(list.get(list.size()-1));
    }
}
