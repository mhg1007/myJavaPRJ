package baekjoon;

import java.util.Scanner;

public class B9507 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        long[] koong=new long[68];
        koong[0]=1;
        koong[1]=1;
        koong[2]=2;
        koong[3]=4;
        for (int i = 4; i < 68; i++) {
            koong[i]=koong[i-1]+koong[i-2]+koong[i-3]+koong[i-4];
        }
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            System.out.println(koong[n]);
        }
    }
}
