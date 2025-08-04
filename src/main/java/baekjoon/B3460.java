package baekjoon;

import java.util.Scanner;

public class B3460 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int n=s.nextInt();
            String str=Integer.toBinaryString(n);
            StringBuilder sb=new StringBuilder();
            for (int j = str.length()-1; j >= 0; j--) {
                if(str.charAt(j)=='1'){
                    sb.append(str.length()-1-j).append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
