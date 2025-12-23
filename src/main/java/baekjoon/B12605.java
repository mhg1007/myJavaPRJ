package baekjoon;

import java.util.Scanner;

public class B12605 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        s.nextLine();
        for (int i = 0; i < N; i++) {
            String[] str=s.nextLine().split(" ");
            StringBuilder sb=new StringBuilder();
            sb.append("Case #").append(i+1).append(": ");
            for (int j = str.length-1; j >=0 ; j--) {
                sb.append(str[j]).append(" ");
            }
            sb.setLength(sb.length()-1);
            System.out.println(sb);
        }
    }
}
