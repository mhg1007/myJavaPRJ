package baekjoon;

import java.util.Scanner;

public class B3449 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String a=s.next();
            String b=s.next();
            int cnt=0;
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(j)!=b.charAt(j)){
                    cnt++;
                }
            }
            System.out.println("Hamming distance is "+cnt+".");
        }
    }
}
