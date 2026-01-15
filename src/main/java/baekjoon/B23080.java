package baekjoon;

import java.util.Scanner;

public class B23080 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int K=s.nextInt();
        String org=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < org.length(); i+=K) {
            sb.append(org.charAt(i));
        }
        System.out.print(sb);
    }
}
