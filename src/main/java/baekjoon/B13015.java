package baekjoon;

import java.util.Scanner;

public class B13015 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N*4-3-i; j++) {
                if(i==0){
                    if(j<N||j>N*3-4-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j==i || j==N+i-1 || j==N*3-3-i || j==N*4-4-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for (int i = N-2; i >=0 ; i--) {
            for (int j = 0; j < N*4-3-i; j++) {
                if(i==0){
                    if(j<N||j>N*3-4-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j==i || j==N+i-1 || j==N*3-3-i || j==N*4-4-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
