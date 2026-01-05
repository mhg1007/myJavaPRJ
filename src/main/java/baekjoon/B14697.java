package baekjoon;

import java.util.Scanner;

public class B14697 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        int N=s.nextInt();
        boolean chk=false;
        for (int i = 0; i <= N/A; i++) {
            for (int j = 0; j <= N/B; j++) {
                for (int k = 0; k <= N/C; k++) {
                    if(i*A+j*B+k*C==N){
                        chk=true;
                        break;
                    }
                }
            }
        }
        System.out.print(chk?1:0);
    }
}
