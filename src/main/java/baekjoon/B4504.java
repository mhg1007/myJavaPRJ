package baekjoon;

import java.util.Scanner;

public class B4504 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(true){
            int m=s.nextInt();
            if(m==0){
                break;
            }
            System.out.println(m+" is "+(m%n==0?"":"NOT ")+"a multiple of "+n+".");
        }
    }
}
