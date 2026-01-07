package baekjoon;

import java.util.Scanner;

public class B15995 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int m=s.nextInt();
        int sq=1;
        while (true){
            if((a*sq)%m==1){
                System.out.print(sq);
                break;
            }
            sq++;
        }
    }
}
