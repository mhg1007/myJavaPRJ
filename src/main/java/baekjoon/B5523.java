package baekjoon;

import java.util.Scanner;

public class B5523 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int as=0,bs=0;
        for (int i = 0; i < N; i++) {
            int ap=s.nextInt();
            int bp=s.nextInt();
            as+=ap>bp?1:0;
            bs+=ap<bp?1:0;
        }
        System.out.print(as+" "+bs);
    }
}
