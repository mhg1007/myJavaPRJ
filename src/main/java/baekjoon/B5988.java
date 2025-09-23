package baekjoon;

import java.util.Scanner;

public class B5988 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            String K=s.next();
            System.out.println(Character.getNumericValue(K.charAt(K.length()-1))%2==0?"even":"odd");
        }
    }
}
