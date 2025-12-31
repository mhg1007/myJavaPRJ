package baekjoon;

import java.util.Scanner;

public class B14470 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        int D=s.nextInt();
        int E=s.nextInt();
        int time=0;
        boolean iced=A<0;
        while(A<B){
            if(A<0){
                time+=C;
                A++;
            }
            else if(A==0 && iced){
                time+=D;
                iced=false;
            }
            else {
                time+=E;
                A++;
            }
        }
        System.out.print(time);
    }
}
