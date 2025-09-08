package baekjoon;

import java.util.Scanner;

public class B5524 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            String str=s.next();
            System.out.println(str.toLowerCase());
        }
    }
}
