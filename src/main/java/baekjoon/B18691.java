package baekjoon;

import java.util.Scanner;

public class B18691 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int G=s.nextInt();
            int C=s.nextInt();
            int E=s.nextInt();
            if(G==2){
                G=3;
            }
            else if(G==3){
                G=5;
            }
            System.out.println(E-C>0?(E-C)*G:0);
        }
    }
}
