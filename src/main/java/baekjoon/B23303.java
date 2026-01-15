package baekjoon;

import java.util.Scanner;

public class B23303 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.print(str.contains("D2")||str.contains("d2")?"D2":"unrated");
    }
}
