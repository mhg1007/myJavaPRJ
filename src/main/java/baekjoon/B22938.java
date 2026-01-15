package baekjoon;

import java.util.Scanner;

public class B22938 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] gn1=new int[3];
        int[] gn2=new int[3];
        for (int i = 0; i < 3; i++) {
            gn1[i]=s.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            gn2[i]=s.nextInt();
        }
        long l1=gn1[2]+gn2[2];
        long xl=(long)Math.pow(Math.abs(gn2[0]-gn1[0]),2);
        long yl=(long)Math.pow(Math.abs(gn2[1]-gn1[1]),2);
        double l2=Math.pow(xl+yl,0.5);
        System.out.print(l1>l2?"YES":"NO");
    }
}
