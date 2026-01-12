package baekjoon;

import java.util.Scanner;

public class B18247 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int M=s.nextInt();
            if(N<12 || M<4){
                System.out.println(-1);
            }
            else{
                System.out.println(M*11+4);
            }
        }
    }
}
