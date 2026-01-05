package baekjoon;

import java.util.Scanner;

public class B14656 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int cnt=0;
        for (int i = 0; i < N; i++) {
            if(s.nextInt()!=i+1){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
