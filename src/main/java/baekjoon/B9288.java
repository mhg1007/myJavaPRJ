package baekjoon;

import java.util.Scanner;

public class B9288 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int x=s.nextInt();
            System.out.println("Case "+(i+1)+":");
            for (int j = 1; j <= x/2; j++) {
                for (int k = 6; k >= 1; k--) {
                    if(j+k==x){
                        System.out.printf("(%d,%d)\n",j,k);
                    }
                }
            }
        }
    }
}
