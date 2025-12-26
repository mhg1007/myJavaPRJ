package baekjoon;

import java.util.Scanner;

public class B13235 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.print(str.contentEquals(new StringBuilder(str).reverse()));
    }
}
