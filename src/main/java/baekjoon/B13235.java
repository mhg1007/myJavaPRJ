package baekjoon;

import java.util.Scanner;

public class B13235 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuilder sb=new StringBuilder();
        sb.append(str).reverse();
        System.out.print(str.contentEquals(sb));
    }
}
