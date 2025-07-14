package baekjoon;

import java.util.Scanner;

public class B2810 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String seat=s.next();
        seat=seat.replace("S","*S*");
        seat=seat.replace("LL","*LL*");
        seat=seat.replace("**","*");
        int cnt=0;
        for (int i = 0; i < seat.length(); i++) {
            if(seat.charAt(i)=='*'){
                cnt++;
            }
        }
        System.out.print(Math.min(cnt, N));
    }
}
