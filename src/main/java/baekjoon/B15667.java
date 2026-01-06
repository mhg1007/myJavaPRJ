package baekjoon;

import java.util.Scanner;

public class B15667 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=0;
        for (int i = 1; i <= 100; i++) {
            if(i*i+i+1 == N){
                K=i;
                break;
            }
        }
        System.out.print(K);
    }
}
