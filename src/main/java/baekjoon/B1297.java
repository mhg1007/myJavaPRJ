package baekjoon;

import java.util.Scanner;

public class B1297 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int D=s.nextInt();
        int H=s.nextInt();
        int W=s.nextInt();
        double rate=D/Math.sqrt(H*H+W*W);
        System.out.print((int)(H*rate)+" "+(int)(W*rate));
    }
}
