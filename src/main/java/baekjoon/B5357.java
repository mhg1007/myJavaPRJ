package baekjoon;

import java.util.Scanner;

public class B5357 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            String str=s.next();
            StringBuilder sb=new StringBuilder();
            sb.append(str.charAt(0));
            for (int j = 1; j < str.length(); j++) {
                if(str.charAt(j)!=sb.charAt(sb.length()-1)){
                    sb.append(str.charAt(j));
                }
            }
            System.out.println(sb);
        }
    }
}
