package baekjoon;

import java.util.Scanner;

public class B14720 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(s.next());
        }
        String str=sb.toString();
        int nxt=0;
        int cnt=0;
        for (int i = 0; i < str.length(); i++) {
            int nw=Character.getNumericValue(str.charAt(i));
            if(nw==nxt){
                cnt++;
                nxt++;
                if(nxt>2){
                    nxt=0;
                }
            }
        }
        System.out.print(cnt);
    }
}
