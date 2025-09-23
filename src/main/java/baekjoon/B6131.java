package baekjoon;

import java.util.Scanner;

public class B6131 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int cnt=0;
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= i; j++) {
                if(i*i-j*j==N){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
