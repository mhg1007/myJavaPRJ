package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B11948 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] sc=new int[4];
        for (int i = 0; i < 4; i++) {
            sc[i]=s.nextInt();
        }
        Arrays.sort(sc);
        int E=s.nextInt();
        int F=s.nextInt();
        System.out.print(sc[1]+sc[2]+sc[3]+Math.max(E,F));
    }
}
