package baekjoon;

import java.util.Scanner;

public class B12400 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[] arr={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        int T=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < T; i++) {
            String S=s.nextLine();
            String[] sar=S.split(" ");
            StringBuilder sb=new StringBuilder();
            sb.append("Case #").append(i+1).append(": ");
            for (String a : sar) {
                for (int k = 0; k < a.length(); k++) {
                    sb.append(arr[a.charAt(k) - 97]);
                }
                sb.append(" ");
            }
            sb.setLength(sb.length()-1);
            System.out.println(sb);
        }
    }
}
