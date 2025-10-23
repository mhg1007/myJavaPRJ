package baekjoon;

import java.util.Scanner;

public class B9325 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int S=s.nextInt();
            int n=s.nextInt();
            for (int j = 0; j < n; j++) {
                S+=s.nextInt()*s.nextInt();
            }
            System.out.println(S);
        }
    }
}
