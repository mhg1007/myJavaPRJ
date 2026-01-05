package baekjoon;

import java.util.Scanner;

public class B14563 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int sum=0;
            for (int j = 1; j < N; j++) {
                if(N%j==0){
                    sum+=j;
                }
            }
            if(sum==N){
                System.out.println("Perfect");
            }
            else if(sum<N){
                System.out.println("Deficient");
            }
            else{
                System.out.println("Abundant");
            }
        }
    }
}
