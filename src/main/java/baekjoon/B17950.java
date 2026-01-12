package baekjoon;

import java.util.Scanner;

public class B17950 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int H=s.nextInt();
        int x=s.nextInt();
        long sb=0,mp=1;
        for (int i = 0; i < H; i++) {
            mp=mp*x%1000000007;
            sb=(sb+s.nextInt()*mp)%1000000007;
        }
        System.out.print(sb);
    }
}
