package baekjoon;

import java.util.Scanner;

public class B14913 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int d=s.nextInt();
        int k=s.nextInt();
        /*
        a+(n-1)d=k
        n=(k-a)/d+1
         */
        if((k-a)%d==0 && (k-a)/d>=0){
            System.out.print((k-a)/d+1);
        }
        else{
            System.out.print("X");
        }
    }
}
