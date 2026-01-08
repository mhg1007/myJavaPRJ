package baekjoon;

import java.util.Scanner;

public class B17174 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int c=N;
        while(N/M>0){
            c+=N/M;
            N/=M;
        }
        System.out.print(c);
    }
}
