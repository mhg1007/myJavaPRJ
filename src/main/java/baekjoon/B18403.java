package baekjoon;

import java.util.Scanner;

public class B18403 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        for (int i = 0; i < T; i++) {
            String[] yrs=s.nextLine().split(", ");
            StringBuilder sb=new StringBuilder();
            for(String y:yrs) {
                if(Integer.parseInt(y)%4==0) {
                    sb.append(y).append(" ");
                }
            }
            sb.setLength(sb.length()-1);
            System.out.println(sb);
        }
    }
}
