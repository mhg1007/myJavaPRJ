package baekjoon;

import java.util.Scanner;

public class B21603 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt(),K=s.nextInt(),cnt=0;
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if(!(i%10==K%10||i%10==K*2%10)){
                sb.append(i).append(" ");
                cnt++;
            }
        }
        if(sb.length()!=0)sb.setLength(sb.length()-1);
        System.out.print(cnt+"\n"+sb);
    }
}
