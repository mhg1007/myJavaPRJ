package baekjoon;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B9342 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(Pattern.matches("^[A-F]?A+F+C[A-F]?$",s.next())?"Infected!":"Good");
        }
    }
}
