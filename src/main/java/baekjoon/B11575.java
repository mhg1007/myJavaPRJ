package baekjoon;

import java.util.Scanner;

public class B11575 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            String org=s.next();
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < org.length(); j++) {
                char c=org.charAt(j);
                int chg=(a*(c-65)+b)%26;
                sb.append((char)(chg+65));
            }
            System.out.println(sb);
        }
    }
}
