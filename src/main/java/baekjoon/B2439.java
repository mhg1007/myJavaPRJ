package baekjoon;

import java.util.Scanner;

public class B2439 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int N=s.nextInt();

        for (int i=0; i<N; i++){
            for(int j=1; j<N-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
