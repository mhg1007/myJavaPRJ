package baekjoon;

import java.util.Scanner;

public class B2742 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int n=N;
        for (int i = 0; i < N; i++) {
            if(n!=1) {
                System.out.println(n);
            }
            else{
                System.out.print(n);
            }
            n--;
        }
    }
}
