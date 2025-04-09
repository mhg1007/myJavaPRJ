package baekjoon;

import java.util.Scanner;

public class B1225 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        long sum=0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                sum+=(long)Character.getNumericValue(A.charAt(i))*Character.getNumericValue(B.charAt(j));
            }
        }
        System.out.print(sum);
    }
}
