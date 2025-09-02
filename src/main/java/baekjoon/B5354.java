package baekjoon;

import java.util.Scanner;

public class B5354 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(j==0 || j==N-1 || k==0 || k==N-1){
                        System.out.print("#");
                    }
                    else{
                        System.out.print("J");
                    }
                }
                System.out.println();
            }
            if(i!=T-1){
                System.out.println();
            }
        }
    }
}
