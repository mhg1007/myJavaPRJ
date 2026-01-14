package baekjoon;

import java.util.Scanner;

public class B20410 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int sd=s.nextInt();
        int x1=s.nextInt();
        int x2=s.nextInt();
        rand:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if((i*sd+j)%m==x1 && (i*x1+j)%m==x2){
                    System.out.print(i+" "+j);
                    break rand;
                }
            }
        }
    }
}
