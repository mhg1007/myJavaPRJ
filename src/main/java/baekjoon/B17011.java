package baekjoon;

import java.util.Scanner;

public class B17011 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            String str=s.next();
            StringBuilder sb=new StringBuilder();
            int seq=0;
            int ln=1;
            while (seq<str.length()-1) {
                char c=str.charAt(seq);
                if(c==str.charAt(seq+1)) {
                    ln++;
                }
                else{
                    sb.append(ln).append(" ").append(c).append(" ");
                    ln=1;
                }
                seq++;
            }
            sb.append(ln).append(" ").append(str.charAt(str.length()-1)).append(" ");
            sb.setLength(sb.length()-1);
            System.out.println(sb);
        }
    }
}
