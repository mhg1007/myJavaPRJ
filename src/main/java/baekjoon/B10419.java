package baekjoon;

import java.util.Scanner;

public class B10419 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int d=s.nextInt();
            int mx=0;
            for (int j = 0; j < Math.sqrt(d); j++) {
                if(j+j*j<=d){
                    mx=j;
                }
            }
            System.out.println(mx);
        }
    }
}
