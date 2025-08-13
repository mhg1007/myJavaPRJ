package baekjoon;

import java.util.Scanner;

public class B4458 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String except=s.nextLine();
        for (int i = 0; i < N; i++) {
            String str=s.nextLine();
            String fst=String.valueOf(str.charAt(0));
            str=str.replaceFirst(fst,fst.toUpperCase());
            System.out.println(str);
        }
    }
}
